package data

import groovy.xml.XmlUtil

class DataUtil {

    static String base64Encode(String str) {
        def output = Base64.getEncoder().encodeToString(str.getBytes())
        return output
    }

    static File createJenkinsConfig(String imageName, String portalAddress, String token, Boolean policyEvalCheck, Boolean failOnCriticalPluginError) {
        String path = "resources/template.xml"
        String xml = new File(path).text
        def param = [:]
        param["command"] = """mkdir \$BUILD_TAG
                               cd \$BUILD_TAG
                               echo \"${imageName}\" >> rox_images_to_scan"""
        param["portalAddress"] = portalAddress
        param["apiToken"] = token
        param["failOnPolicyEvalFailure"] = policyEvalCheck
        param["failOnCriticalPluginError"] = failOnCriticalPluginError
        // parse the xml
        def parsexml = new XmlSlurper().parseText(xml)
        param.each { key, value ->
            parsexml.'**'.findAll {
                if (it.name() == key)
                    it.replaceBody value
            }

        }
        println("Writing to a temp file")
        File file = File.createTempFile("temp",".xml",new File("."))
        def serializedXml = XmlUtil.serialize(parsexml)
        file.write(serializedXml)
        return file
    }
}
