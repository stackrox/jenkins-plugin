package com.stackrox.jenkins.plugins;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class CVE {
   // CVE ID | CVSS Score | Publish date | Package name and version | Fixable | CVE Link

    private final String id;
    private final float cvssScore;
    private final String scoreType;
    private final String publishDate;

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

    private final String packageName;
    private final String packageVersion;
    private final boolean fixable;
    private final String link;

    public CVE (CVEBuilder builder) {
        this.id = builder.id;
        this.cvssScore = builder.cvssScore;
        this.scoreType = builder.scoreType;
        this.publishDate = builder.publishDate;
        this.packageName = builder.packageName;
        this.packageVersion = builder.packageVersion;
        this.fixable = builder.fixable;
        this.link = builder.link;

    }

    public static class CVEBuilder {
        private String id;
        private float cvssScore;
        private String scoreType;
        private String publishDate;
        private String packageName;
        private String packageVersion;
        private boolean fixable;
        private String link;

        private CVEBuilder() {
        }

       public static CVEBuilder newInstance() {
           return new CVEBuilder();
       }

        public CVEBuilder withId(String id)
        {
            this.id = id;
            return this;
        }
        public CVEBuilder withCvssScore(float cvssScore)
        {
            this.cvssScore = cvssScore;
            return this;
        }
        public CVEBuilder withScoreType(String scoreType)
        {
            this.scoreType = scoreType;
            return this;
        }
        public CVEBuilder withPublishDate(String timestamp)
        {
            this.publishDate = timestamp;
            return this;
        }
        public CVEBuilder inPackage(String packageName)
        {
            this.packageName = packageName;
            return this;
        }
        public CVEBuilder inVersion(String packageVersion)
        {
            this.packageVersion = packageVersion;
            return this;
        }
        public CVEBuilder withLink(String link)
        {
            this.link = link;
            return this;
        }
        public CVEBuilder isFixable(boolean fixable) {
            this.fixable = fixable;
            return this;
        }

        public CVE build()
        {
            return new CVE(this);
        }


    }



}
