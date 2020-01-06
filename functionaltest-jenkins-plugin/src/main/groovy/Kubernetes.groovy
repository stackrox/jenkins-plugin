import io.fabric8.kubernetes.api.model.apps.Deployment as K8sDeployment
import io.fabric8.kubernetes.api.model.ObjectMeta
import io.fabric8.kubernetes.api.model.PodTemplateSpec
import io.fabric8.kubernetes.api.model.LabelSelector
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec

class Deployment {



    def createDeploymentNoWait(Deployment deployment) {
        deployment.getNamespace() != null ?: deployment.setNamespace(this.namespace)


        K8sDeployment d = new K8sDeployment(
                metadata: new ObjectMeta(
                        name: deployment.name,
                        namespace: deployment.namespace,
                        labels: deployment.labels,
                        annotations: deployment.annotation,
                ),
                spec: new DeploymentSpec(
                        selector: new LabelSelector(null, deployment.labels),
                        replicas: deployment.replicas,
                        minReadySeconds: 15,
                        template: new PodTemplateSpec(
                                metadata: new ObjectMeta(
                                        name: deployment.name,
                                        namespace: deployment.namespace,
                                        labels: deployment.labels,
                                ),
                                spec: generatePodSpec(deployment)
                        )

                )
        )

        try {
            client.apps().deployments().inNamespace(deployment.namespace).createOrReplace(d)
            println("Told the orchestrator to create " + deployment.name)
            if (deployment.createLoadBalancer) {
                waitForLoadBalancer(deployment)
            }
            return true
        } catch (Exception e) {
            println("Error creating k8s deployment: " + e.toString())
            return false
        }
    }

    def generatePodSpec(Deployment deployment) {
        List<ContainerPort> depPorts = deployment.ports.collect {
            k, v -> new ContainerPort(
                    k as Integer,
                    null,
                    null,
                    "port" + (k as String),
                    v as String
            )
        }
}
