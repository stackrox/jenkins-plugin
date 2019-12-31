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
    comments = "Source: api/v1/probe_upload_service.proto")
public final class ProbeUploadServiceGrpc {

  private ProbeUploadServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ProbeUploadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest,
      io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse> getGetExistingProbesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExistingProbes",
      requestType = io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest.class,
      responseType = io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest,
      io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse> getGetExistingProbesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest, io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse> getGetExistingProbesMethod;
    if ((getGetExistingProbesMethod = ProbeUploadServiceGrpc.getGetExistingProbesMethod) == null) {
      synchronized (ProbeUploadServiceGrpc.class) {
        if ((getGetExistingProbesMethod = ProbeUploadServiceGrpc.getGetExistingProbesMethod) == null) {
          ProbeUploadServiceGrpc.getGetExistingProbesMethod = getGetExistingProbesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest, io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProbeUploadService", "GetExistingProbes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProbeUploadServiceMethodDescriptorSupplier("GetExistingProbes"))
                  .build();
          }
        }
     }
     return getGetExistingProbesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProbeUploadServiceStub newStub(io.grpc.Channel channel) {
    return new ProbeUploadServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProbeUploadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProbeUploadServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProbeUploadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProbeUploadServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProbeUploadServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getExistingProbes(io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExistingProbesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetExistingProbesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest,
                io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse>(
                  this, METHODID_GET_EXISTING_PROBES)))
          .build();
    }
  }

  /**
   */
  public static final class ProbeUploadServiceStub extends io.grpc.stub.AbstractStub<ProbeUploadServiceStub> {
    private ProbeUploadServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProbeUploadServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProbeUploadServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProbeUploadServiceStub(channel, callOptions);
    }

    /**
     */
    public void getExistingProbes(io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExistingProbesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProbeUploadServiceBlockingStub extends io.grpc.stub.AbstractStub<ProbeUploadServiceBlockingStub> {
    private ProbeUploadServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProbeUploadServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProbeUploadServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProbeUploadServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse getExistingProbes(io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetExistingProbesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProbeUploadServiceFutureStub extends io.grpc.stub.AbstractStub<ProbeUploadServiceFutureStub> {
    private ProbeUploadServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProbeUploadServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProbeUploadServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProbeUploadServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse> getExistingProbes(
        io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExistingProbesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EXISTING_PROBES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProbeUploadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProbeUploadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EXISTING_PROBES:
          serviceImpl.getExistingProbes((io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.GetExistingProbesResponse>) responseObserver);
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

  private static abstract class ProbeUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProbeUploadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ProbeUploadServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProbeUploadService");
    }
  }

  private static final class ProbeUploadServiceFileDescriptorSupplier
      extends ProbeUploadServiceBaseDescriptorSupplier {
    ProbeUploadServiceFileDescriptorSupplier() {}
  }

  private static final class ProbeUploadServiceMethodDescriptorSupplier
      extends ProbeUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProbeUploadServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProbeUploadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProbeUploadServiceFileDescriptorSupplier())
              .addMethod(getGetExistingProbesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
