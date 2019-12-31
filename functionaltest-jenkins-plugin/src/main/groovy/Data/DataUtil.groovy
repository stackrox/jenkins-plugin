package Data

class DataUtil {

    static String getJsonBody(String imageName) {
        def jsonBody="{\"image_name\": \"${imageName}\"}"
        return jsonBody
    }

    static String base64Encode(String str) {
       def output = Base64.getEncoder().encodeToString(str.getBytes())
       return output
    }

}
