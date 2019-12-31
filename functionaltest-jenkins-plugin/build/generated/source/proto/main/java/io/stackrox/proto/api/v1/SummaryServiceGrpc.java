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
    comments = "Source: api/v1/summary_service.proto")
public final class SummaryServiceGrpc {

  private SummaryServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.SummaryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse> getGetSummaryCountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSummaryCounts",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse> getGetSummaryCountsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse> getGetSummaryCountsMethod;
    if ((getGetSummaryCountsMethod = SummaryServiceGrpc.getGetSummaryCountsMethod) == null) {
      synchronized (SummaryServiceGrpc.class) {
        if ((getGetSummaryCountsMethod = SummaryServiceGrpc.getGetSummaryCountsMethod) == null) {
          SummaryServiceGrpc.getGetSummaryCountsMethod = getGetSummaryCountsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.SummaryService", "GetSummaryCounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SummaryServiceMethodDescriptorSupplier("GetSummaryCounts"))
                  .build();
          }
        }
     }
     return getGetSummaryCountsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SummaryServiceStub newStub(io.grpc.Channel channel) {
    return new SummaryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SummaryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SummaryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SummaryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SummaryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SummaryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSummaryCounts(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSummaryCountsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSummaryCountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse>(
                  this, METHODID_GET_SUMMARY_COUNTS)))
          .build();
    }
  }

  /**
   */
  public static final class SummaryServiceStub extends io.grpc.stub.AbstractStub<SummaryServiceStub> {
    private SummaryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummaryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummaryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummaryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSummaryCounts(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSummaryCountsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SummaryServiceBlockingStub extends io.grpc.stub.AbstractStub<SummaryServiceBlockingStub> {
    private SummaryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummaryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummaryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummaryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse getSummaryCounts(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetSummaryCountsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SummaryServiceFutureStub extends io.grpc.stub.AbstractStub<SummaryServiceFutureStub> {
    private SummaryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummaryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummaryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummaryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse> getSummaryCounts(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSummaryCountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SUMMARY_COUNTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SummaryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SummaryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SUMMARY_COUNTS:
          serviceImpl.getSummaryCounts((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SummaryServiceOuterClass.SummaryCountsResponse>) responseObserver);
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

  private static abstract class SummaryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SummaryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.SummaryServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SummaryService");
    }
  }

  private static final class SummaryServiceFileDescriptorSupplier
      extends SummaryServiceBaseDescriptorSupplier {
    SummaryServiceFileDescriptorSupplier() {}
  }

  private static final class SummaryServiceMethodDescriptorSupplier
      extends SummaryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SummaryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SummaryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SummaryServiceFileDescriptorSupplier())
              .addMethod(getGetSummaryCountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
