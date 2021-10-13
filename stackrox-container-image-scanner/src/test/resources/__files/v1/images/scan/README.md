This directory contains mocked responses for image scan request.
This data were obtained with following commands and edited to fit in a unit test.

```
roxcurl '/v1/images/scan' -X POST --data-raw '{"imageName" : "nginx:latest","force" : true}'
roxcurl '/v1/images/scan' -X POST --data-raw '{"imageName" : "jenkins:lts","force" : true}'
```
