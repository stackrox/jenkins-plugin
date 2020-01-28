package Data

import groovy.xml.XmlUtil

class DataUtil {

    static String getJsonBody(String imageName) {
        def jsonBody="{\"image_name\": \"${imageName}\"}"
        return jsonBody
    }

    static String base64Encode(String str) {
       def output = Base64.getEncoder().encodeToString(str.getBytes())
       return output
    }

    static void formatXml(String path, String imageName, String portalAddress,String token) {
        String xml = new File(path).text
        def param = [:]
        param["command"] =  """mkdir \$BUILD_TAG
                               cd \$BUILD_TAG
                               echo \"${imageName}\" >> rox_images_to_scan"""
        param["portalAddress"] = portalAddress
        param["apiToken"] = token
        // parse the xml
        def parsexml = new XmlSlurper().parseText(xml)
        param.each { key,value ->
             parsexml.'**'.findAll { if(it.name() == key)
                 it.replaceBody value
             }

        }
        println("Writing to a temp file")
        File file = new File("src/main/resources/temp.xml")
        def serializedXml = XmlUtil.serialize(parsexml)
        file.write(serializedXml)
    }


    static Boolean deleteFileFromDisk(String filename) {
        boolean fileSuccessfullyDeleted =  new File(filename).delete()
        if (fileSuccessfullyDeleted) {return true}
        return false
    }
}
