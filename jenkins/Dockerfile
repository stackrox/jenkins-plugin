FROM jenkins/jenkins:2.395-alpine
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
COPY --chown=jenkins:jenkins stackrox-container-image-scanner.hpi /var/jenkins_home/plugins/stackrox-container-image-scanner.hpi
COPY config.xml /var/jenkins_home/
