package data

class DataUtil {

    static String base64Encode(String str) {
        def output = Base64.getEncoder().encodeToString(str.getBytes())
        return output
    }
}
