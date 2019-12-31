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
    comments = "Source: api/v1/license_service.proto")
public final class LicenseServiceGrpc {

  private LicenseServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.LicenseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest,
      io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse> getGetLicensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLicenses",
      requestType = io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest.class,
      responseType = io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest,
      io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse> getGetLicensesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest, io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse> getGetLicensesMethod;
    if ((getGetLicensesMethod = LicenseServiceGrpc.getGetLicensesMethod) == null) {
      synchronized (LicenseServiceGrpc.class) {
        if ((getGetLicensesMethod = LicenseServiceGrpc.getGetLicensesMethod) == null) {
          LicenseServiceGrpc.getGetLicensesMethod = getGetLicensesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest, io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.LicenseService", "GetLicenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LicenseServiceMethodDescriptorSupplier("GetLicenses"))
                  .build();
          }
        }
     }
     return getGetLicensesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest,
      io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse> getAddLicenseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLicense",
      requestType = io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest.class,
      responseType = io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest,
      io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse> getAddLicenseMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest, io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse> getAddLicenseMethod;
    if ((getAddLicenseMethod = LicenseServiceGrpc.getAddLicenseMethod) == null) {
      synchronized (LicenseServiceGrpc.class) {
        if ((getAddLicenseMethod = LicenseServiceGrpc.getAddLicenseMethod) == null) {
          LicenseServiceGrpc.getAddLicenseMethod = getAddLicenseMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest, io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.LicenseService", "AddLicense"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LicenseServiceMethodDescriptorSupplier("AddLicense"))
                  .build();
          }
        }
     }
     return getAddLicenseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse> getGetActiveLicenseExpirationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetActiveLicenseExpiration",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse> getGetActiveLicenseExpirationMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse> getGetActiveLicenseExpirationMethod;
    if ((getGetActiveLicenseExpirationMethod = LicenseServiceGrpc.getGetActiveLicenseExpirationMethod) == null) {
      synchronized (LicenseServiceGrpc.class) {
        if ((getGetActiveLicenseExpirationMethod = LicenseServiceGrpc.getGetActiveLicenseExpirationMethod) == null) {
          LicenseServiceGrpc.getGetActiveLicenseExpirationMethod = getGetActiveLicenseExpirationMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.LicenseService", "GetActiveLicenseExpiration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LicenseServiceMethodDescriptorSupplier("GetActiveLicenseExpiration"))
                  .build();
          }
        }
     }
     return getGetActiveLicenseExpirationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LicenseServiceStub newStub(io.grpc.Channel channel) {
    return new LicenseServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LicenseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LicenseServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LicenseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LicenseServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LicenseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLicenses(io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLicensesMethod(), responseObserver);
    }

    /**
     */
    public void addLicense(io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddLicenseMethod(), responseObserver);
    }

    /**
     */
    public void getActiveLicenseExpiration(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetActiveLicenseExpirationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLicensesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest,
                io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse>(
                  this, METHODID_GET_LICENSES)))
          .addMethod(
            getAddLicenseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest,
                io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse>(
                  this, METHODID_ADD_LICENSE)))
          .addMethod(
            getGetActiveLicenseExpirationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse>(
                  this, METHODID_GET_ACTIVE_LICENSE_EXPIRATION)))
          .build();
    }
  }

  /**
   */
  public static final class LicenseServiceStub extends io.grpc.stub.AbstractStub<LicenseServiceStub> {
    private LicenseServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LicenseServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LicenseServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LicenseServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLicenses(io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLicensesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addLicense(io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddLicenseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getActiveLicenseExpiration(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetActiveLicenseExpirationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LicenseServiceBlockingStub extends io.grpc.stub.AbstractStub<LicenseServiceBlockingStub> {
    private LicenseServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LicenseServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LicenseServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LicenseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse getLicenses(io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLicensesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse addLicense(io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddLicenseMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse getActiveLicenseExpiration(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetActiveLicenseExpirationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LicenseServiceFutureStub extends io.grpc.stub.AbstractStub<LicenseServiceFutureStub> {
    private LicenseServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LicenseServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LicenseServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LicenseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse> getLicenses(
        io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLicensesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse> addLicense(
        io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddLicenseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse> getActiveLicenseExpiration(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetActiveLicenseExpirationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LICENSES = 0;
  private static final int METHODID_ADD_LICENSE = 1;
  private static final int METHODID_GET_ACTIVE_LICENSE_EXPIRATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LicenseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LicenseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LICENSES:
          serviceImpl.getLicenses((io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetLicensesResponse>) responseObserver);
          break;
        case METHODID_ADD_LICENSE:
          serviceImpl.addLicense((io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.LicenseServiceOuterClass.AddLicenseResponse>) responseObserver);
          break;
        case METHODID_GET_ACTIVE_LICENSE_EXPIRATION:
          serviceImpl.getActiveLicenseExpiration((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.LicenseServiceOuterClass.GetActiveLicenseExpirationResponse>) responseObserver);
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

  private static abstract class LicenseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LicenseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.LicenseServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LicenseService");
    }
  }

  private static final class LicenseServiceFileDescriptorSupplier
      extends LicenseServiceBaseDescriptorSupplier {
    LicenseServiceFileDescriptorSupplier() {}
  }

  private static final class LicenseServiceMethodDescriptorSupplier
      extends LicenseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LicenseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LicenseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LicenseServiceFileDescriptorSupplier())
              .addMethod(getGetLicensesMethod())
              .addMethod(getAddLicenseMethod())
              .addMethod(getGetActiveLicenseExpirationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
