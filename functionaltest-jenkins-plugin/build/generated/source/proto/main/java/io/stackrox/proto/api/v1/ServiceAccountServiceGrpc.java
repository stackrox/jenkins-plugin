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
    comments = "Source: api/v1/service_account_service.proto")
public final class ServiceAccountServiceGrpc {

  private ServiceAccountServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ServiceAccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse> getGetServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceAccount",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse> getGetServiceAccountMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse> getGetServiceAccountMethod;
    if ((getGetServiceAccountMethod = ServiceAccountServiceGrpc.getGetServiceAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getGetServiceAccountMethod = ServiceAccountServiceGrpc.getGetServiceAccountMethod) == null) {
          ServiceAccountServiceGrpc.getGetServiceAccountMethod = getGetServiceAccountMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ServiceAccountService", "GetServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("GetServiceAccount"))
                  .build();
          }
        }
     }
     return getGetServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse> getListServiceAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServiceAccounts",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse> getListServiceAccountsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse> getListServiceAccountsMethod;
    if ((getListServiceAccountsMethod = ServiceAccountServiceGrpc.getListServiceAccountsMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getListServiceAccountsMethod = ServiceAccountServiceGrpc.getListServiceAccountsMethod) == null) {
          ServiceAccountServiceGrpc.getListServiceAccountsMethod = getListServiceAccountsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ServiceAccountService", "ListServiceAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("ListServiceAccounts"))
                  .build();
          }
        }
     }
     return getListServiceAccountsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceAccountServiceStub newStub(io.grpc.Channel channel) {
    return new ServiceAccountServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceAccountServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceAccountServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceAccountServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getServiceAccount(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceAccountMethod(), responseObserver);
    }

    /**
     */
    public void listServiceAccounts(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListServiceAccountsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetServiceAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse>(
                  this, METHODID_GET_SERVICE_ACCOUNT)))
          .addMethod(
            getListServiceAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse>(
                  this, METHODID_LIST_SERVICE_ACCOUNTS)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceAccountServiceStub extends io.grpc.stub.AbstractStub<ServiceAccountServiceStub> {
    private ServiceAccountServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceAccountServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAccountServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceAccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void getServiceAccount(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listServiceAccounts(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListServiceAccountsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceAccountServiceBlockingStub extends io.grpc.stub.AbstractStub<ServiceAccountServiceBlockingStub> {
    private ServiceAccountServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceAccountServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAccountServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse getServiceAccount(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse listServiceAccounts(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getListServiceAccountsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceAccountServiceFutureStub extends io.grpc.stub.AbstractStub<ServiceAccountServiceFutureStub> {
    private ServiceAccountServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceAccountServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAccountServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceAccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse> getServiceAccount(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse> listServiceAccounts(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getListServiceAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SERVICE_ACCOUNT = 0;
  private static final int METHODID_LIST_SERVICE_ACCOUNTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceAccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceAccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SERVICE_ACCOUNT:
          serviceImpl.getServiceAccount((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.GetServiceAccountResponse>) responseObserver);
          break;
        case METHODID_LIST_SERVICE_ACCOUNTS:
          serviceImpl.listServiceAccounts((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.ListServiceAccountResponse>) responseObserver);
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

  private static abstract class ServiceAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceAccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ServiceAccountServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceAccountService");
    }
  }

  private static final class ServiceAccountServiceFileDescriptorSupplier
      extends ServiceAccountServiceBaseDescriptorSupplier {
    ServiceAccountServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceAccountServiceMethodDescriptorSupplier
      extends ServiceAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceAccountServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceAccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceAccountServiceFileDescriptorSupplier())
              .addMethod(getGetServiceAccountMethod())
              .addMethod(getListServiceAccountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
