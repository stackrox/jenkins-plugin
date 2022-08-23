# jenkins-plugin

The StackRox Jenkins Plugin for image scanning and security.

## Configuration

Please take a look at [plugin README](stackrox-container-image-scanner/README.md)

## Development

### Setup

0. Requirements

- K8s cluster to run Jenkins
- kubectl
- Maven
- Java 8
- curl
- jq

1. Deploy Jenkins

```
kubectl create namespace jenkins
kubectl apply -f jenkins/jenkins-app-deployment.yaml
kubectl apply -f jenkins/jenkins-service.yaml
nohup kubectl port-forward -n jenkins svc/jenkins 8080:8080 &
```

2. Create HPI file

```
 cd stackrox-container-image-scanner
 ./mvnw package && ./mvnw hpi:hpi
```

3. Install Plugin

```
export JENKIS_CRUMB=`curl  --cookie-jar cookies.txt -s http://localhost:8080/crumbIssuer/api/json | jq .crumb -r`
curl -b cookies.txt -i -F file=@stackrox-container-image-scanner/target/stackrox-container-image-scanner.hpi http://localhost:8080/pluginManager/uploadPlugin\?Jenkins-Crumb=$JENKIS_CRUMB
```

4. Create a new job with the plugin
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
