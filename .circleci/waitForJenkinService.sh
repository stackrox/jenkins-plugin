set +e
SUCCESS=0
JENKINS_PORT=8080
for i in $(seq 1 50); do
  export JENKINS_SVC="$(kubectl -n jenkins get svc jenkins -o jsonpath="{.status.loadBalancer.ingress[*].ip}")"
  export JENKINS_URL="http://${JENKINS_SVC}:${JENKINS_PORT}/"
  curl -sk --connect-timeout 5 --max-time 10 "${JENKINS_URL}"
  result=$?
  if [[ $result -eq 0 ]]; then
    SUCCESS=1
    break
  fi
  sleep 5
  done
if [[ $SUCCESS == 0 ]]; then
  kubectl -n jenkins get pods
  echo "Failed to deploy jenkins server"
  exit 1
fi
echo -e "\nJENKINS_URL is set to ${JENKINS_URL}"