package data

class BuildDetectRequest {

    public Name name
    public String imageName

    class Name {
        public String registry
        public String remote
        public String tag
        public String fullName
    }
}
