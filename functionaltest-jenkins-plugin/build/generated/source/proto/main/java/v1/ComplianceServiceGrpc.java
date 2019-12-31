package v1;

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
    comments = "Source: api/v1/compliance_service.proto")
public final class ComplianceServiceGrpc {

  private ComplianceServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ComplianceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse> getGetStandardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStandards",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse> getGetStandardsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse> getGetStandardsMethod;
    if ((getGetStandardsMethod = ComplianceServiceGrpc.getGetStandardsMethod) == null) {
      synchronized (ComplianceServiceGrpc.class) {
        if ((getGetStandardsMethod = ComplianceServiceGrpc.getGetStandardsMethod) == null) {
          ComplianceServiceGrpc.getGetStandardsMethod = getGetStandardsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceService", "GetStandards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceServiceMethodDescriptorSupplier("GetStandards"))
                  .build();
          }
        }
     }
     return getGetStandardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      v1.ComplianceServiceOuterClass.GetComplianceStandardResponse> getGetStandardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStandard",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = v1.ComplianceServiceOuterClass.GetComplianceStandardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      v1.ComplianceServiceOuterClass.GetComplianceStandardResponse> getGetStandardMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, v1.ComplianceServiceOuterClass.GetComplianceStandardResponse> getGetStandardMethod;
    if ((getGetStandardMethod = ComplianceServiceGrpc.getGetStandardMethod) == null) {
      synchronized (ComplianceServiceGrpc.class) {
        if ((getGetStandardMethod = ComplianceServiceGrpc.getGetStandardMethod) == null) {
          ComplianceServiceGrpc.getGetStandardMethod = getGetStandardMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, v1.ComplianceServiceOuterClass.GetComplianceStandardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceService", "GetStandard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.ComplianceServiceOuterClass.GetComplianceStandardResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceServiceMethodDescriptorSupplier("GetStandard"))
                  .build();
          }
        }
     }
     return getGetStandardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse> getGetComplianceControlResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetComplianceControlResults",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse> getGetComplianceControlResultsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse> getGetComplianceControlResultsMethod;
    if ((getGetComplianceControlResultsMethod = ComplianceServiceGrpc.getGetComplianceControlResultsMethod) == null) {
      synchronized (ComplianceServiceGrpc.class) {
        if ((getGetComplianceControlResultsMethod = ComplianceServiceGrpc.getGetComplianceControlResultsMethod) == null) {
          ComplianceServiceGrpc.getGetComplianceControlResultsMethod = getGetComplianceControlResultsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceService", "GetComplianceControlResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceServiceMethodDescriptorSupplier("GetComplianceControlResults"))
                  .build();
          }
        }
     }
     return getGetComplianceControlResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest,
      v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse> getGetRunResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRunResults",
      requestType = v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest.class,
      responseType = v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest,
      v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse> getGetRunResultsMethod() {
    io.grpc.MethodDescriptor<v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest, v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse> getGetRunResultsMethod;
    if ((getGetRunResultsMethod = ComplianceServiceGrpc.getGetRunResultsMethod) == null) {
      synchronized (ComplianceServiceGrpc.class) {
        if ((getGetRunResultsMethod = ComplianceServiceGrpc.getGetRunResultsMethod) == null) {
          ComplianceServiceGrpc.getGetRunResultsMethod = getGetRunResultsMethod = 
              io.grpc.MethodDescriptor.<v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest, v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceService", "GetRunResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceServiceMethodDescriptorSupplier("GetRunResults"))
                  .build();
          }
        }
     }
     return getGetRunResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<v1.ComplianceServiceOuterClass.ComplianceAggregation.Request,
      v1.ComplianceServiceOuterClass.ComplianceAggregation.Response> getGetAggregatedResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAggregatedResults",
      requestType = v1.ComplianceServiceOuterClass.ComplianceAggregation.Request.class,
      responseType = v1.ComplianceServiceOuterClass.ComplianceAggregation.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<v1.ComplianceServiceOuterClass.ComplianceAggregation.Request,
      v1.ComplianceServiceOuterClass.ComplianceAggregation.Response> getGetAggregatedResultsMethod() {
    io.grpc.MethodDescriptor<v1.ComplianceServiceOuterClass.ComplianceAggregation.Request, v1.ComplianceServiceOuterClass.ComplianceAggregation.Response> getGetAggregatedResultsMethod;
    if ((getGetAggregatedResultsMethod = ComplianceServiceGrpc.getGetAggregatedResultsMethod) == null) {
      synchronized (ComplianceServiceGrpc.class) {
        if ((getGetAggregatedResultsMethod = ComplianceServiceGrpc.getGetAggregatedResultsMethod) == null) {
          ComplianceServiceGrpc.getGetAggregatedResultsMethod = getGetAggregatedResultsMethod = 
              io.grpc.MethodDescriptor.<v1.ComplianceServiceOuterClass.ComplianceAggregation.Request, v1.ComplianceServiceOuterClass.ComplianceAggregation.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceService", "GetAggregatedResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.ComplianceServiceOuterClass.ComplianceAggregation.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.ComplianceServiceOuterClass.ComplianceAggregation.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceServiceMethodDescriptorSupplier("GetAggregatedResults"))
                  .build();
          }
        }
     }
     return getGetAggregatedResultsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComplianceServiceStub newStub(io.grpc.Channel channel) {
    return new ComplianceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComplianceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ComplianceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComplianceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ComplianceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ComplianceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStandards(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStandardsMethod(), responseObserver);
    }

    /**
     */
    public void getStandard(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.GetComplianceStandardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStandardMethod(), responseObserver);
    }

    /**
     */
    public void getComplianceControlResults(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetComplianceControlResultsMethod(), responseObserver);
    }

    /**
     */
    public void getRunResults(v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest request,
        io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRunResultsMethod(), responseObserver);
    }

    /**
     */
    public void getAggregatedResults(v1.ComplianceServiceOuterClass.ComplianceAggregation.Request request,
        io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.ComplianceAggregation.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAggregatedResultsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStandardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse>(
                  this, METHODID_GET_STANDARDS)))
          .addMethod(
            getGetStandardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                v1.ComplianceServiceOuterClass.GetComplianceStandardResponse>(
                  this, METHODID_GET_STANDARD)))
          .addMethod(
            getGetComplianceControlResultsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse>(
                  this, METHODID_GET_COMPLIANCE_CONTROL_RESULTS)))
          .addMethod(
            getGetRunResultsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest,
                v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse>(
                  this, METHODID_GET_RUN_RESULTS)))
          .addMethod(
            getGetAggregatedResultsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.ComplianceServiceOuterClass.ComplianceAggregation.Request,
                v1.ComplianceServiceOuterClass.ComplianceAggregation.Response>(
                  this, METHODID_GET_AGGREGATED_RESULTS)))
          .build();
    }
  }

  /**
   */
  public static final class ComplianceServiceStub extends io.grpc.stub.AbstractStub<ComplianceServiceStub> {
    private ComplianceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStandards(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStandardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStandard(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.GetComplianceStandardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStandardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getComplianceControlResults(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetComplianceControlResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRunResults(v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest request,
        io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRunResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAggregatedResults(v1.ComplianceServiceOuterClass.ComplianceAggregation.Request request,
        io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.ComplianceAggregation.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAggregatedResultsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ComplianceServiceBlockingStub extends io.grpc.stub.AbstractStub<ComplianceServiceBlockingStub> {
    private ComplianceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse getStandards(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetStandardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public v1.ComplianceServiceOuterClass.GetComplianceStandardResponse getStandard(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetStandardMethod(), getCallOptions(), request);
    }

    /**
     */
    public v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse getComplianceControlResults(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getGetComplianceControlResultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse getRunResults(v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRunResultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public v1.ComplianceServiceOuterClass.ComplianceAggregation.Response getAggregatedResults(v1.ComplianceServiceOuterClass.ComplianceAggregation.Request request) {
      return blockingUnaryCall(
          getChannel(), getGetAggregatedResultsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ComplianceServiceFutureStub extends io.grpc.stub.AbstractStub<ComplianceServiceFutureStub> {
    private ComplianceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse> getStandards(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStandardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.ComplianceServiceOuterClass.GetComplianceStandardResponse> getStandard(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStandardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse> getComplianceControlResults(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getGetComplianceControlResultsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse> getRunResults(
        v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRunResultsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.ComplianceServiceOuterClass.ComplianceAggregation.Response> getAggregatedResults(
        v1.ComplianceServiceOuterClass.ComplianceAggregation.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAggregatedResultsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STANDARDS = 0;
  private static final int METHODID_GET_STANDARD = 1;
  private static final int METHODID_GET_COMPLIANCE_CONTROL_RESULTS = 2;
  private static final int METHODID_GET_RUN_RESULTS = 3;
  private static final int METHODID_GET_AGGREGATED_RESULTS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ComplianceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ComplianceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STANDARDS:
          serviceImpl.getStandards((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.GetComplianceStandardsResponse>) responseObserver);
          break;
        case METHODID_GET_STANDARD:
          serviceImpl.getStandard((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.GetComplianceStandardResponse>) responseObserver);
          break;
        case METHODID_GET_COMPLIANCE_CONTROL_RESULTS:
          serviceImpl.getComplianceControlResults((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.ComplianceControlResultsResponse>) responseObserver);
          break;
        case METHODID_GET_RUN_RESULTS:
          serviceImpl.getRunResults((v1.ComplianceServiceOuterClass.GetComplianceRunResultsRequest) request,
              (io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.GetComplianceRunResultsResponse>) responseObserver);
          break;
        case METHODID_GET_AGGREGATED_RESULTS:
          serviceImpl.getAggregatedResults((v1.ComplianceServiceOuterClass.ComplianceAggregation.Request) request,
              (io.grpc.stub.StreamObserver<v1.ComplianceServiceOuterClass.ComplianceAggregation.Response>) responseObserver);
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

  private static abstract class ComplianceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComplianceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return v1.ComplianceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComplianceService");
    }
  }

  private static final class ComplianceServiceFileDescriptorSupplier
      extends ComplianceServiceBaseDescriptorSupplier {
    ComplianceServiceFileDescriptorSupplier() {}
  }

  private static final class ComplianceServiceMethodDescriptorSupplier
      extends ComplianceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ComplianceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ComplianceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComplianceServiceFileDescriptorSupplier())
              .addMethod(getGetStandardsMethod())
              .addMethod(getGetStandardMethod())
              .addMethod(getGetComplianceControlResultsMethod())
              .addMethod(getGetRunResultsMethod())
              .addMethod(getGetAggregatedResultsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
