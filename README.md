# jenkins-plugin

The StackRox Jenkins Plugin for image scanning and security.

## Configuration

Please take a look at [plugin README](stackrox-container-image-scanner/README.md)

## Development

### Setup

0. Requirements

- Podman/Docker
- Java 8

1. Create HPI file

```
 cd stackrox-container-image-scanner
 ./mvnw package && ./mvnw hpi:hpi
```

2. Run Jenkins with plugin installed

```
cp  stackrox-container-image-scanner/target/stackrox-container-image-scanner.hpi jenkins/
docker build -t jenkins-test  jenkins
docker run -d --add-host host.docker.internal:host-gateway -p 8080:8080 jenkins-test
```

4. Run the E2E tests

```
export JENKINS_ROX_ENDPOINT='https://host.docker.internal:8000' # endpoint accessed by jenkins
export ROX_ENDPOINT='https://localhost:8000' # endpoint accessed from local machine
export ROX_PASSWORD=... # stackrox admin password
make -C functionaltest-jenkins-plugin test
```

5. This project uses [Lombok](https://projectlombok.org/) so you may need to [enable Annotation Processing](https://stackoverflow.com/q/9424364/1387612)

### Updating API Schema

1. Go to recent version of running rox instance (e.g. `https://k8s.demo.stackrox.com`)
2. Navigate to API Docs `/main/apidocs`
3. Download OpenAPI specification (link may change between versions)
4. Convert JSON to YAML (e.g. with https://editor.swagger.io/)
5. Add authorization methods if it's not defined
   - In `components:` add
    ```yaml
    securitySchemes:
        basicAuth:
            type: http
            scheme: basic
        bearerAuth:
            type: http
            scheme: bearer
    ```
    - In root add:
    ```yaml
    security:
      - basicAuth: [ ]
      - bearerAuth: [ ]
    ```
6. Save changes in `stackrox-container-image-scanner/api.yaml`

## Release

The release process is managed by the [release.yml GitHub Action](https://github.com/stackrox/jenkins-plugin/actions/workflows/release.yml). 
When running the workflow, ensure that the correct version is specified in the workflow options. 
After the release, it typically takes a few hours for the plugin to be available on the 
[Jenkins Plugin site](https://plugins.jenkins.io/stackrox-container-image-scanner/).
