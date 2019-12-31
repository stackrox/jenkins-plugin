package io.stackrox.proto.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/service_identity_service.proto")
public final class ServiceIdentityServiceGrpc {

  private ServiceIdentityServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ServiceIdentityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse> getGetServiceIdentitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceIdentities",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse> getGetServiceIdentitiesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse> getGetServiceIdentitiesMethod;
    if ((getGetServiceIdentitiesMethod = ServiceIdentityServiceGrpc.getGetServiceIdentitiesMethod) == null) {
      synchronized (ServiceIdentityServiceGrpc.class) {
        if ((getGetServiceIdentitiesMethod = ServiceIdentityServiceGrpc.getGetServiceIdentitiesMethod) == null) {
          ServiceIdentityServiceGrpc.getGetServiceIdentitiesMethod = getGetServiceIdentitiesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ServiceIdentityService", "GetServiceIdentities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceIdentityServiceMethodDescriptorSupplier("GetServiceIdentities"))
                  .build();
          }
        }
     }
     return getGetServiceIdentitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest,
      io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse> getCreateServiceIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceIdentity",
      requestType = io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest.class,
      responseType = io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest,
      io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse> getCreateServiceIdentityMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest, io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse> getCreateServiceIdentityMethod;
    if ((getCreateServiceIdentityMethod = ServiceIdentityServiceGrpc.getCreateServiceIdentityMethod) == null) {
      synchronized (ServiceIdentityServiceGrpc.class) {
        if ((getCreateServiceIdentityMethod = ServiceIdentityServiceGrpc.getCreateServiceIdentityMethod) == null) {
          ServiceIdentityServiceGrpc.getCreateServiceIdentityMethod = getCreateServiceIdentityMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest, io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ServiceIdentityService", "CreateServiceIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceIdentityServiceMethodDescriptorSupplier("CreateServiceIdentity"))
                  .build();
          }
        }
     }
     return getCreateServiceIdentityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities> getGetAuthoritiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthorities",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities> getGetAuthoritiesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities> getGetAuthoritiesMethod;
    if ((getGetAuthoritiesMethod = ServiceIdentityServiceGrpc.getGetAuthoritiesMethod) == null) {
      synchronized (ServiceIdentityServiceGrpc.class) {
        if ((getGetAuthoritiesMethod = ServiceIdentityServiceGrpc.getGetAuthoritiesMethod) == null) {
          ServiceIdentityServiceGrpc.getGetAuthoritiesMethod = getGetAuthoritiesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ServiceIdentityService", "GetAuthorities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceIdentityServiceMethodDescriptorSupplier("GetAuthorities"))
                  .build();
          }
        }
     }
     return getGetAuthoritiesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceIdentityServiceStub newStub(io.grpc.Channel channel) {
    return new ServiceIdentityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceIdentityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceIdentityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceIdentityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceIdentityServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceIdentityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getServiceIdentities(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceIdentitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateServiceIdentity creates a new key pair and certificate.
     * The key and certificate are not retained and can never be retrieved again.
     * </pre>
     */
    public void createServiceIdentity(io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateServiceIdentityMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAuthorities returns the authorities currently in use.
     * </pre>
     */
    public void getAuthorities(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuthoritiesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetServiceIdentitiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse>(
                  this, METHODID_GET_SERVICE_IDENTITIES)))
          .addMethod(
            getCreateServiceIdentityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest,
                io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse>(
                  this, METHODID_CREATE_SERVICE_IDENTITY)))
          .addMethod(
            getGetAuthoritiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities>(
                  this, METHODID_GET_AUTHORITIES)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceIdentityServiceStub extends io.grpc.stub.AbstractStub<ServiceIdentityServiceStub> {
    private ServiceIdentityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceIdentityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceIdentityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceIdentityServiceStub(channel, callOptions);
    }

    /**
     */
    public void getServiceIdentities(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceIdentitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateServiceIdentity creates a new key pair and certificate.
     * The key and certificate are not retained and can never be retrieved again.
     * </pre>
     */
    public void createServiceIdentity(io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateServiceIdentityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAuthorities returns the authorities currently in use.
     * </pre>
     */
    public void getAuthorities(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAuthoritiesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceIdentityServiceBlockingStub extends io.grpc.stub.AbstractStub<ServiceIdentityServiceBlockingStub> {
    private ServiceIdentityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceIdentityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceIdentityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceIdentityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse getServiceIdentities(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceIdentitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateServiceIdentity creates a new key pair and certificate.
     * The key and certificate are not retained and can never be retrieved again.
     * </pre>
     */
    public io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse createServiceIdentity(io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateServiceIdentityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAuthorities returns the authorities currently in use.
     * </pre>
     */
    public io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities getAuthorities(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAuthoritiesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceIdentityServiceFutureStub extends io.grpc.stub.AbstractStub<ServiceIdentityServiceFutureStub> {
    private ServiceIdentityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceIdentityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceIdentityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceIdentityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse> getServiceIdentities(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceIdentitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateServiceIdentity creates a new key pair and certificate.
     * The key and certificate are not retained and can never be retrieved again.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse> createServiceIdentity(
        io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateServiceIdentityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAuthorities returns the authorities currently in use.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities> getAuthorities(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAuthoritiesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SERVICE_IDENTITIES = 0;
  private static final int METHODID_CREATE_SERVICE_IDENTITY = 1;
  private static final int METHODID_GET_AUTHORITIES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceIdentityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceIdentityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SERVICE_IDENTITIES:
          serviceImpl.getServiceIdentities((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.ServiceIdentityResponse>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_IDENTITY:
          serviceImpl.createServiceIdentity((io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.CreateServiceIdentityResponse>) responseObserver);
          break;
        case METHODID_GET_AUTHORITIES:
          serviceImpl.getAuthorities((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.Authorities>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServiceIdentityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceIdentityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ServiceIdentityServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceIdentityService");
    }
  }

  private static final class ServiceIdentityServiceFileDescriptorSupplier
      extends ServiceIdentityServiceBaseDescriptorSupplier {
    ServiceIdentityServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceIdentityServiceMethodDescriptorSupplier
      extends ServiceIdentityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceIdentityServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServiceIdentityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceIdentityServiceFileDescriptorSupplier())
              .addMethod(getGetServiceIdentitiesMethod())
              .addMethod(getCreateServiceIdentityMethod())
              .addMethod(getGetAuthoritiesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
