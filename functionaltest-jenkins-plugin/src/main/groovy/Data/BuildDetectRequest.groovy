package Data

class BuildDetectRequest {

        public Name name
        public String image_name

    class Name
    {
        public String registry
        public String remote
        public String tag
        public String full_name
    }

}
