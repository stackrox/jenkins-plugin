# jenkins-plugin

The StackRox Jenkins Plugin for image scanning and security.

## Setup

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
 mvn package && mvn hpi:hpi
```

3. Install Plugin

```
export JENKIS_CRUMB=`curl  --cookie-jar cookies.txt -s http://localhost:8080/crumbIssuer/api/json | jq .crumb -r`
curl -b cookies.txt -i -F file=@stackrox-container-image-scanner/target/stackrox-container-image-scanner.hpi http://localhost:8080/pluginManager/uploadPlugin\?Jenkins-Crumb=$JENKIS_CRUMB
```

4. Create a new job with the plugin