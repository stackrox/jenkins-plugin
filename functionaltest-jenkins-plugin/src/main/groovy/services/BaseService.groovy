package services

import static io.stackrox.proto.api.v1.EmptyOuterClass.Empty
import groovy.transform.CompileStatic
import groovy.transform.EqualsAndHashCode
import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.ClientCall
import io.grpc.ClientInterceptor
import io.grpc.ClientInterceptors
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.netty.GrpcSslContexts
import io.grpc.netty.NegotiationType
import io.grpc.netty.NettyChannelBuilder
import io.netty.handler.ssl.util.InsecureTrustManagerFactory
import util.Env

@CompileStatic
class BaseService {

    static final String BASIC_AUTH_USERNAME = Env.mustGetUsername()
    static final String BASIC_AUTH_PASSWORD = Env.mustGetPassword()

    static final Empty EMPTY = Empty.newBuilder().build()
    static final Channel effectiveChannel = useBasicAuth()

    private static Channel useBasicAuth() {
        def sslContext = GrpcSslContexts
                .forClient()
                .trustManager(InsecureTrustManagerFactory.INSTANCE)
                .build()

        def transportChannel = NettyChannelBuilder
                .forAddress(Env.mustGetHostname(), Env.mustGetPort())
                .negotiationType(NegotiationType.TLS)
                .sslContext(sslContext)
                .build()

        def interceptor = new AuthInterceptor(BASIC_AUTH_USERNAME, BASIC_AUTH_PASSWORD)

        return ClientInterceptors.intercept(transportChannel, interceptor)
    }

    static Channel getChannel() {
        return effectiveChannel
    }

    private static class CallWithAuthorizationHeader<ReqT, RespT>
            extends ClientInterceptors.CheckedForwardingClientCall<ReqT, RespT> {

        private static final Metadata.Key<String> AUTHORIZATION =
                Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER)

        private final String authHeaderContents

        CallWithAuthorizationHeader(ClientCall<ReqT, RespT> delegate, String authHeaderContents) {
            super(delegate)
            this.authHeaderContents = authHeaderContents
        }

        @Override
        protected void checkedStart(Listener<RespT> responseListener, Metadata headers) throws Exception {
            headers.put(AUTHORIZATION, authHeaderContents)
            delegate().start(responseListener, headers)
        }
    }

    @EqualsAndHashCode(includeFields = true)
    private static class AuthInterceptor implements ClientInterceptor {
        private final String authHeaderContents

        AuthInterceptor(String username, String password) {
            authHeaderContents = "Basic " + Base64.getEncoder().encodeToString(
                    (username + ":" + password).getBytes("UTF-8"))
        }

        def <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
                MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
            return new CallWithAuthorizationHeader<>(next.newCall(method, callOptions), authHeaderContents)
        }
    }
}
