import io.fabric8.kubernetes.client.KubernetesClient
import io.fabric8.kubernetes.client.DefaultKubernetesClient
import io.fabric8.kubernetes.api.model.Service as KService
import util.Timer

class Service {
    KService service
    KubernetesClient client
    String namespace
    String serviceName
    String loadBalancerIP

    Service(String namespace, String serviceName) {
        this.namespace = namespace
        this.serviceName = serviceName
        this.client = new DefaultKubernetesClient()
    }

    String getLoadBalancer(int timeout) {
        int interval = 1
        int iterations = timeout / interval
        Timer timer = new Timer(iterations, interval)
        while (loadBalancerIP == null && timer.IsValid()) {
            service = client.services().inNamespace(namespace).withName(serviceName).get()
            if (service?.status?.loadBalancer?.ingress?.size()) {
                loadBalancerIP = service.status.loadBalancer.ingress.get(0).
                        ip ?: service.status.loadBalancer.ingress.get(0).hostname
                println "LB IP: " + loadBalancerIP
                break
            }
        }
        return loadBalancerIP
    }
}
