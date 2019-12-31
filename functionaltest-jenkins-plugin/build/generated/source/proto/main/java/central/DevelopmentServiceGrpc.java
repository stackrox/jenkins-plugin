package central;

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
    comments = "Source: internalapi/central/development_service.proto")
public final class DevelopmentServiceGrpc {

  private DevelopmentServiceGrpc() {}

  public static final String SERVICE_NAME = "central.DevelopmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<central.DevelopmentServiceOuterClass.URLHasValidCertRequest,
      central.DevelopmentServiceOuterClass.URLHasValidCertResponse> getURLHasValidCertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "URLHasValidCert",
      requestType = central.DevelopmentServiceOuterClass.URLHasValidCertRequest.class,
      responseType = central.DevelopmentServiceOuterClass.URLHasValidCertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<central.DevelopmentServiceOuterClass.URLHasValidCertRequest,
      central.DevelopmentServiceOuterClass.URLHasValidCertResponse> getURLHasValidCertMethod() {
    io.grpc.MethodDescriptor<central.DevelopmentServiceOuterClass.URLHasValidCertRequest, central.DevelopmentServiceOuterClass.URLHasValidCertResponse> getURLHasValidCertMethod;
    if ((getURLHasValidCertMethod = DevelopmentServiceGrpc.getURLHasValidCertMethod) == null) {
      synchronized (DevelopmentServiceGrpc.class) {
        if ((getURLHasValidCertMethod = DevelopmentServiceGrpc.getURLHasValidCertMethod) == null) {
          DevelopmentServiceGrpc.getURLHasValidCertMethod = getURLHasValidCertMethod = 
              io.grpc.MethodDescriptor.<central.DevelopmentServiceOuterClass.URLHasValidCertRequest, central.DevelopmentServiceOuterClass.URLHasValidCertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "central.DevelopmentService", "URLHasValidCert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  central.DevelopmentServiceOuterClass.URLHasValidCertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  central.DevelopmentServiceOuterClass.URLHasValidCertResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DevelopmentServiceMethodDescriptorSupplier("URLHasValidCert"))
                  .build();
          }
        }
     }
     return getURLHasValidCertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<central.DevelopmentServiceOuterClass.RandomDataRequest,
      central.DevelopmentServiceOuterClass.RandomDataResponse> getRandomDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RandomData",
      requestType = central.DevelopmentServiceOuterClass.RandomDataRequest.class,
      responseType = central.DevelopmentServiceOuterClass.RandomDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<central.DevelopmentServiceOuterClass.RandomDataRequest,
      central.DevelopmentServiceOuterClass.RandomDataResponse> getRandomDataMethod() {
    io.grpc.MethodDescriptor<central.DevelopmentServiceOuterClass.RandomDataRequest, central.DevelopmentServiceOuterClass.RandomDataResponse> getRandomDataMethod;
    if ((getRandomDataMethod = DevelopmentServiceGrpc.getRandomDataMethod) == null) {
      synchronized (DevelopmentServiceGrpc.class) {
        if ((getRandomDataMethod = DevelopmentServiceGrpc.getRandomDataMethod) == null) {
          DevelopmentServiceGrpc.getRandomDataMethod = getRandomDataMethod = 
              io.grpc.MethodDescriptor.<central.DevelopmentServiceOuterClass.RandomDataRequest, central.DevelopmentServiceOuterClass.RandomDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "central.DevelopmentService", "RandomData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  central.DevelopmentServiceOuterClass.RandomDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  central.DevelopmentServiceOuterClass.RandomDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DevelopmentServiceMethodDescriptorSupplier("RandomData"))
                  .build();
          }
        }
     }
     return getRandomDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DevelopmentServiceStub newStub(io.grpc.Channel channel) {
    return new DevelopmentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DevelopmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DevelopmentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DevelopmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DevelopmentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DevelopmentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void uRLHasValidCert(central.DevelopmentServiceOuterClass.URLHasValidCertRequest request,
        io.grpc.stub.StreamObserver<central.DevelopmentServiceOuterClass.URLHasValidCertResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getURLHasValidCertMethod(), responseObserver);
    }

    /**
     */
    public void randomData(central.DevelopmentServiceOuterClass.RandomDataRequest request,
        io.grpc.stub.StreamObserver<central.DevelopmentServiceOuterClass.RandomDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRandomDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getURLHasValidCertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                central.DevelopmentServiceOuterClass.URLHasValidCertRequest,
                central.DevelopmentServiceOuterClass.URLHasValidCertResponse>(
                  this, METHODID_URLHAS_VALID_CERT)))
          .addMethod(
            getRandomDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                central.DevelopmentServiceOuterClass.RandomDataRequest,
                central.DevelopmentServiceOuterClass.RandomDataResponse>(
                  this, METHODID_RANDOM_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class DevelopmentServiceStub extends io.grpc.stub.AbstractStub<DevelopmentServiceStub> {
    private DevelopmentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevelopmentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevelopmentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevelopmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void uRLHasValidCert(central.DevelopmentServiceOuterClass.URLHasValidCertRequest request,
        io.grpc.stub.StreamObserver<central.DevelopmentServiceOuterClass.URLHasValidCertResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getURLHasValidCertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void randomData(central.DevelopmentServiceOuterClass.RandomDataRequest request,
        io.grpc.stub.StreamObserver<central.DevelopmentServiceOuterClass.RandomDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRandomDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DevelopmentServiceBlockingStub extends io.grpc.stub.AbstractStub<DevelopmentServiceBlockingStub> {
    private DevelopmentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevelopmentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevelopmentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevelopmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public central.DevelopmentServiceOuterClass.URLHasValidCertResponse uRLHasValidCert(central.DevelopmentServiceOuterClass.URLHasValidCertRequest request) {
      return blockingUnaryCall(
          getChannel(), getURLHasValidCertMethod(), getCallOptions(), request);
    }

    /**
     */
    public central.DevelopmentServiceOuterClass.RandomDataResponse randomData(central.DevelopmentServiceOuterClass.RandomDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getRandomDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DevelopmentServiceFutureStub extends io.grpc.stub.AbstractStub<DevelopmentServiceFutureStub> {
    private DevelopmentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevelopmentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevelopmentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevelopmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<central.DevelopmentServiceOuterClass.URLHasValidCertResponse> uRLHasValidCert(
        central.DevelopmentServiceOuterClass.URLHasValidCertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getURLHasValidCertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<central.DevelopmentServiceOuterClass.RandomDataResponse> randomData(
        central.DevelopmentServiceOuterClass.RandomDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRandomDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_URLHAS_VALID_CERT = 0;
  private static final int METHODID_RANDOM_DATA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DevelopmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DevelopmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_URLHAS_VALID_CERT:
          serviceImpl.uRLHasValidCert((central.DevelopmentServiceOuterClass.URLHasValidCertRequest) request,
              (io.grpc.stub.StreamObserver<central.DevelopmentServiceOuterClass.URLHasValidCertResponse>) responseObserver);
          break;
        case METHODID_RANDOM_DATA:
          serviceImpl.randomData((central.DevelopmentServiceOuterClass.RandomDataRequest) request,
              (io.grpc.stub.StreamObserver<central.DevelopmentServiceOuterClass.RandomDataResponse>) responseObserver);
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

  private static abstract class DevelopmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DevelopmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return central.DevelopmentServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DevelopmentService");
    }
  }

  private static final class DevelopmentServiceFileDescriptorSupplier
      extends DevelopmentServiceBaseDescriptorSupplier {
    DevelopmentServiceFileDescriptorSupplier() {}
  }

  private static final class DevelopmentServiceMethodDescriptorSupplier
      extends DevelopmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DevelopmentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DevelopmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DevelopmentServiceFileDescriptorSupplier())
              .addMethod(getURLHasValidCertMethod())
              .addMethod(getRandomDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
