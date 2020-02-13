#!/usr/bin/env bash
set -e
JENKINS_DEPLOYED=false
JENKINSPORT="8080"
for i in $(seq 1 50); do
   export JENKINSPOD="$(kubectl get pods -n jenkins  -o=jsonpath='{.items[*].metadata.name}')"
   if [[ -n "${JENKINS_DEPLOYED}" ]]; then
      JENKINS_DEPLOYED=true
      echo "JENKINSPOD is running on ${JENKINSPOD}"
      break
   fi
   sleep 5
done
if [[ "$JENKINS_DEPLOYED" = false  ]]; then
       kubectl -n jenkins describe deploy
       kubectl -n jenkins describe rs
       kubectl -n jenkins get svc
       kubectl -n jenkins get pods
       echo "Failed to deploy jenkins pod"
       exit 1
fi
kubectl cp /home/circleci/jenkins-plugin/stackrox-container-image-scanner/target/stackrox-container-image-scanner.hpi qa/${JENKINSPOD}:/var/jenkins_home/plugins/.
if [[ $? -eq 0 ]]; then
    echo "Jenkins plugin has been installed"
  else
    echo "Jenkins plugin failed to install"
  exit 1
fi
kubectl -n jenkins  exec -i ${JENKINSPOD} ls /var/jenkins_home/plugins/stackrox-container-image-scanner.hpi
GETSVC=false
for i in $(seq 1 50); do
  export JENKINSVC=$(kubectl get svc -n jenkins jenkinsep -o jsonpath="{.status.loadBalancer.ingress[*].ip}")
  if [[ -n "${JENKINSVC}" ]]; then
      echo "Jenkins svc is running on ${JENKINSVC}"
      GETSVC=true
      break
  fi
  sleep 5
done
if [[ "$GETSVC" = false ]]; then
  echo "Jenkins svc failed to come up"
  exit 1
fi
echo restarting jenkins
export JENKINS_URL="http://${JENKINSVC}:${JENKINSPORT}/"
curl -XPOST "${JENKINS_URL}/restart"
SERVICEREADY=false
for i in $(seq 1 50); do
  curl -sk --connect-timeout 5 --max-time 10 "${JENKINS_URL}"
  if [[ $? -eq 0 ]]; then
        SERVICEREADY=true
        echo "stackrox plugin installation on Jenkins is complete"
        break
  fi
  sleep 5
done
if [[ "$SERVICEREADY" = true ]]; then
       echo "Jenkins installation is complete"
       exit 0
    else
       exit 1
fi
