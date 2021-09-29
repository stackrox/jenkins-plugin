package services

import static io.stackrox.proto.api.v1.MetadataServiceGrpc.MetadataServiceBlockingStub
import static io.stackrox.proto.api.v1.MetadataServiceGrpc.newBlockingStub
import static io.stackrox.proto.api.v1.MetadataServiceOuterClass.Metadata
import groovy.transform.CompileStatic

@CompileStatic
class MetadataService extends BaseService {
    static MetadataServiceBlockingStub getMetadataServiceClient() {
        return newBlockingStub(getChannel())
    }

    static Metadata getMetadata() {
        return getMetadataServiceClient().getMetadata(EMPTY)
    }
}
