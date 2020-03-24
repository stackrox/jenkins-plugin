FROM jenkins/jenkins:lts
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"
COPY ../functionaltest-jenkins-plugin/security.groovy /usr/share/jenkins/ref/init.groovy.d/security.groovy
COPY ../functionaltest-jenkins-plugin/plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
