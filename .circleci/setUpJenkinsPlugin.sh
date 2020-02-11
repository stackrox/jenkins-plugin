#!/usr/bin/env bash

SUCCESS=1
JENKINSPORT="8080"
for i in $(seq 1 50); do
   export JENKINSPOD="$(kubectl get pods -n qa  -o=jsonpath='{range .items[*]}{.metadata.name}')"
   if [[ -n "${JENKINSPOD}" ]]; then
      SUCCESS=0
      echo "JENKINSPOD is running on ${JENKINSPOD}"
      break
   fi
done
if [[ "${SUCCESS}" == 1 ]]; then
       kubectl -n qa describe deploy
       kubectl -n qa describe rs
       kubectl -n qa get svc
       kubectl -n qa get pods
       echo "Failed to deploy jenkins pod"
       exit 1
fi
kubectl cp /home/circleci/jenkins-plugin/stackrox-container-image-scanner/target/stackrox-container-image-scanner.hpi qa/${JENKINSPOD}:/var/jenkins_home/plugins/.
output="$(kubectl -n qa  exec -i ${JENKINSPOD} ls /var/jenkins_home/plugins/stackrox-container-image-scanner.hpi)"
if [[ $? -eq 0 ]]; then
    echo "Jenkins plugin has been installed"
  else
    echo "Jenkins plugin failed to install"
    exit 1
fi
for i in $(seq 1 50); do
  export JENKINSVC=$(kubectl get svc -n qa jenkinsep -o jsonpath="{.status.loadBalancer.ingress[*].ip}")
   if [[ -n "${JENKINSVC}" ]]; then
      echo "Jenkins svc is running on ${JENKINSVC}"
      break
   fi
done
echo restarting jenkins
export JENKINS_URL="http://${JENKINSVC}:${JENKINSPORT}/"
curl -XPOST "${JENKINS_URL}/restart"
for i in $(seq 1 50); do
  output="$(curl -sk --connect-timeout 5 --max-time 10 "${JENKINS_URL}")"
  if [[ $? -eq 0 ]]; then
        echo "stackrox plugin installation on Jenkins is complete"
        break
  fi
  sleep 5
done
echo "Jenkins installation is complete"