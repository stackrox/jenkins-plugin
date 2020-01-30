package com.stackrox.jenkins.plugins;

public class CVE {
    private final String id;
    private final float cvssScore;
    private final String scoreType;
    private final String publishDate;
    private final String packageName;
    private final String packageVersion;
    private final boolean fixable;
    private final String link;

    private CVE(Builder builder) {
        this.id = builder.id;
        this.cvssScore = builder.cvssScore;
        this.scoreType = builder.scoreType;
        this.publishDate = builder.publishDate;
        this.packageName = builder.packageName;
        this.packageVersion = builder.packageVersion;
        this.fixable = builder.fixable;
        this.link = builder.link;
    }

    public String getId() {
        return id;
    }

    public float getCvssScore() {
        return cvssScore;
    }

    public String getScoreType() {
        return scoreType;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getPackageVersion() {
        return packageVersion;
    }

    public boolean isFixable() {
        return fixable;
    }

    public String getLink() {
        return link;
    }

    public static class Builder {
        private String id;
        private float cvssScore;
        private String scoreType;
        private String publishDate;
        private String packageName;
        private String packageVersion;
        private boolean fixable;
        private String link;

        private Builder() {
        }

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withCvssScore(float cvssScore) {
            this.cvssScore = cvssScore;
            return this;
        }

        public Builder withScoreType(String scoreType) {
            this.scoreType = scoreType;
            return this;
        }

        public Builder withPublishDate(String timestamp) {
            this.publishDate = timestamp;
            return this;
        }

        public Builder inPackage(String packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder inVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }

        public Builder withLink(String link) {
            this.link = link;
            return this;
        }

        public Builder isFixable(boolean fixable) {
            this.fixable = fixable;
            return this;
        }

        public CVE build() {
            return new CVE(this);
        }
    }
}
