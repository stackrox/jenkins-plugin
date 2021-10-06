package services

import io.stackrox.proto.api.v1.APITokenServiceGrpc
import io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenRequest
import io.stackrox.proto.api.v1.Common

class ApiTokenService extends BaseService {
    static getApiTokenService() {
        return APITokenServiceGrpc.newBlockingStub(getChannel())
    }

    static generateToken(String name, String... roles) {
        GenerateTokenRequest.Builder request =
                GenerateTokenRequest.newBuilder()
                        .setName(name)
                        .addAllRoles(Arrays.asList(roles))
        return getApiTokenService().generateToken(request.build())
    }

    static revokeToken(String tokenId) {
        getApiTokenService().revokeToken(Common.ResourceByID.newBuilder()
                .setId(tokenId)
                .build())
    }
}
