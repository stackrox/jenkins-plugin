package data

class BuildDetectRequest {

    Name name
    String imageName

    class Name {
        String registry
        String remote
        String tag
        String fullName
    }
}
