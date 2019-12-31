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
 * <pre>
 * DeploymentService APIs can be used to manage deployments.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/deployment_service.proto")
public final class DeploymentServiceGrpc {

  private DeploymentServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.DeploymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.DeploymentOuterClass.Deployment> getGetDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeployment",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.DeploymentOuterClass.Deployment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.DeploymentOuterClass.Deployment> getGetDeploymentMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.DeploymentOuterClass.Deployment> getGetDeploymentMethod;
    if ((getGetDeploymentMethod = DeploymentServiceGrpc.getGetDeploymentMethod) == null) {
      synchronized (DeploymentServiceGrpc.class) {
        if ((getGetDeploymentMethod = DeploymentServiceGrpc.getGetDeploymentMethod) == null) {
          DeploymentServiceGrpc.getGetDeploymentMethod = getGetDeploymentMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.DeploymentOuterClass.Deployment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DeploymentService", "GetDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.DeploymentOuterClass.Deployment.getDefaultInstance()))
                  .setSchemaDescriptor(new DeploymentServiceMethodDescriptorSupplier("GetDeployment"))
                  .build();
          }
        }
     }
     return getGetDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse> getGetDeploymentWithRiskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeploymentWithRisk",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse> getGetDeploymentWithRiskMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse> getGetDeploymentWithRiskMethod;
    if ((getGetDeploymentWithRiskMethod = DeploymentServiceGrpc.getGetDeploymentWithRiskMethod) == null) {
      synchronized (DeploymentServiceGrpc.class) {
        if ((getGetDeploymentWithRiskMethod = DeploymentServiceGrpc.getGetDeploymentWithRiskMethod) == null) {
          DeploymentServiceGrpc.getGetDeploymentWithRiskMethod = getGetDeploymentWithRiskMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DeploymentService", "GetDeploymentWithRisk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DeploymentServiceMethodDescriptorSupplier("GetDeploymentWithRisk"))
                  .build();
          }
        }
     }
     return getGetDeploymentWithRiskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse> getCountDeploymentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountDeployments",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse> getCountDeploymentsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse> getCountDeploymentsMethod;
    if ((getCountDeploymentsMethod = DeploymentServiceGrpc.getCountDeploymentsMethod) == null) {
      synchronized (DeploymentServiceGrpc.class) {
        if ((getCountDeploymentsMethod = DeploymentServiceGrpc.getCountDeploymentsMethod) == null) {
          DeploymentServiceGrpc.getCountDeploymentsMethod = getCountDeploymentsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DeploymentService", "CountDeployments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DeploymentServiceMethodDescriptorSupplier("CountDeployments"))
                  .build();
          }
        }
     }
     return getCountDeploymentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse> getListDeploymentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeployments",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse> getListDeploymentsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse> getListDeploymentsMethod;
    if ((getListDeploymentsMethod = DeploymentServiceGrpc.getListDeploymentsMethod) == null) {
      synchronized (DeploymentServiceGrpc.class) {
        if ((getListDeploymentsMethod = DeploymentServiceGrpc.getListDeploymentsMethod) == null) {
          DeploymentServiceGrpc.getListDeploymentsMethod = getListDeploymentsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DeploymentService", "ListDeployments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DeploymentServiceMethodDescriptorSupplier("ListDeployments"))
                  .build();
          }
        }
     }
     return getListDeploymentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse> getListDeploymentsWithProcessInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeploymentsWithProcessInfo",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse> getListDeploymentsWithProcessInfoMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse> getListDeploymentsWithProcessInfoMethod;
    if ((getListDeploymentsWithProcessInfoMethod = DeploymentServiceGrpc.getListDeploymentsWithProcessInfoMethod) == null) {
      synchronized (DeploymentServiceGrpc.class) {
        if ((getListDeploymentsWithProcessInfoMethod = DeploymentServiceGrpc.getListDeploymentsWithProcessInfoMethod) == null) {
          DeploymentServiceGrpc.getListDeploymentsWithProcessInfoMethod = getListDeploymentsWithProcessInfoMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DeploymentService", "ListDeploymentsWithProcessInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DeploymentServiceMethodDescriptorSupplier("ListDeploymentsWithProcessInfo"))
                  .build();
          }
        }
     }
     return getListDeploymentsWithProcessInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse> getGetLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLabels",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse> getGetLabelsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse> getGetLabelsMethod;
    if ((getGetLabelsMethod = DeploymentServiceGrpc.getGetLabelsMethod) == null) {
      synchronized (DeploymentServiceGrpc.class) {
        if ((getGetLabelsMethod = DeploymentServiceGrpc.getGetLabelsMethod) == null) {
          DeploymentServiceGrpc.getGetLabelsMethod = getGetLabelsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.DeploymentService", "GetLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DeploymentServiceMethodDescriptorSupplier("GetLabels"))
                  .build();
          }
        }
     }
     return getGetLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeploymentServiceStub newStub(io.grpc.Channel channel) {
    return new DeploymentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeploymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeploymentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeploymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeploymentServiceFutureStub(channel);
  }

  /**
   * <pre>
   * DeploymentService APIs can be used to manage deployments.
   * </pre>
   */
  public static abstract class DeploymentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetDeployment returns a deployment given its ID.
     * </pre>
     */
    public void getDeployment(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.DeploymentOuterClass.Deployment> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDeploymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDeploymentWithRisk returns a deployment and its risk given its ID.
     * </pre>
     */
    public void getDeploymentWithRisk(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDeploymentWithRiskMethod(), responseObserver);
    }

    /**
     * <pre>
     * CountDeployments returns the list of deployments.
     * </pre>
     */
    public void countDeployments(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountDeploymentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDeployments returns the list of deployments.
     * </pre>
     */
    public void listDeployments(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDeploymentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDeploymentsWithProcessInfo returns the list of deployments with process information.
     * </pre>
     */
    public void listDeploymentsWithProcessInfo(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDeploymentsWithProcessInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLabels returns the labels used by deployments.
     * </pre>
     */
    public void getLabels(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLabelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDeploymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.DeploymentOuterClass.Deployment>(
                  this, METHODID_GET_DEPLOYMENT)))
          .addMethod(
            getGetDeploymentWithRiskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse>(
                  this, METHODID_GET_DEPLOYMENT_WITH_RISK)))
          .addMethod(
            getCountDeploymentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse>(
                  this, METHODID_COUNT_DEPLOYMENTS)))
          .addMethod(
            getListDeploymentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse>(
                  this, METHODID_LIST_DEPLOYMENTS)))
          .addMethod(
            getListDeploymentsWithProcessInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse>(
                  this, METHODID_LIST_DEPLOYMENTS_WITH_PROCESS_INFO)))
          .addMethod(
            getGetLabelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse>(
                  this, METHODID_GET_LABELS)))
          .build();
    }
  }

  /**
   * <pre>
   * DeploymentService APIs can be used to manage deployments.
   * </pre>
   */
  public static final class DeploymentServiceStub extends io.grpc.stub.AbstractStub<DeploymentServiceStub> {
    private DeploymentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeploymentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeploymentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeploymentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDeployment returns a deployment given its ID.
     * </pre>
     */
    public void getDeployment(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.DeploymentOuterClass.Deployment> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDeploymentWithRisk returns a deployment and its risk given its ID.
     * </pre>
     */
    public void getDeploymentWithRisk(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDeploymentWithRiskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CountDeployments returns the list of deployments.
     * </pre>
     */
    public void countDeployments(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountDeploymentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDeployments returns the list of deployments.
     * </pre>
     */
    public void listDeployments(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDeploymentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDeploymentsWithProcessInfo returns the list of deployments with process information.
     * </pre>
     */
    public void listDeploymentsWithProcessInfo(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDeploymentsWithProcessInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLabels returns the labels used by deployments.
     * </pre>
     */
    public void getLabels(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLabelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * DeploymentService APIs can be used to manage deployments.
   * </pre>
   */
  public static final class DeploymentServiceBlockingStub extends io.grpc.stub.AbstractStub<DeploymentServiceBlockingStub> {
    private DeploymentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeploymentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeploymentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeploymentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDeployment returns a deployment given its ID.
     * </pre>
     */
    public io.stackrox.proto.storage.DeploymentOuterClass.Deployment getDeployment(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetDeploymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDeploymentWithRisk returns a deployment and its risk given its ID.
     * </pre>
     */
    public io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse getDeploymentWithRisk(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetDeploymentWithRiskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CountDeployments returns the list of deployments.
     * </pre>
     */
    public io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse countDeployments(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getCountDeploymentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDeployments returns the list of deployments.
     * </pre>
     */
    public io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse listDeployments(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getListDeploymentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDeploymentsWithProcessInfo returns the list of deployments with process information.
     * </pre>
     */
    public io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse listDeploymentsWithProcessInfo(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getListDeploymentsWithProcessInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLabels returns the labels used by deployments.
     * </pre>
     */
    public io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse getLabels(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * DeploymentService APIs can be used to manage deployments.
   * </pre>
   */
  public static final class DeploymentServiceFutureStub extends io.grpc.stub.AbstractStub<DeploymentServiceFutureStub> {
    private DeploymentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeploymentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeploymentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeploymentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDeployment returns a deployment given its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.DeploymentOuterClass.Deployment> getDeployment(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDeploymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDeploymentWithRisk returns a deployment and its risk given its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse> getDeploymentWithRisk(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDeploymentWithRiskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CountDeployments returns the list of deployments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse> countDeployments(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getCountDeploymentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDeployments returns the list of deployments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse> listDeployments(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getListDeploymentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDeploymentsWithProcessInfo returns the list of deployments with process information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse> listDeploymentsWithProcessInfo(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getListDeploymentsWithProcessInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLabels returns the labels used by deployments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse> getLabels(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLabelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEPLOYMENT = 0;
  private static final int METHODID_GET_DEPLOYMENT_WITH_RISK = 1;
  private static final int METHODID_COUNT_DEPLOYMENTS = 2;
  private static final int METHODID_LIST_DEPLOYMENTS = 3;
  private static final int METHODID_LIST_DEPLOYMENTS_WITH_PROCESS_INFO = 4;
  private static final int METHODID_GET_LABELS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeploymentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeploymentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEPLOYMENT:
          serviceImpl.getDeployment((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.DeploymentOuterClass.Deployment>) responseObserver);
          break;
        case METHODID_GET_DEPLOYMENT_WITH_RISK:
          serviceImpl.getDeploymentWithRisk((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.GetDeploymentWithRiskResponse>) responseObserver);
          break;
        case METHODID_COUNT_DEPLOYMENTS:
          serviceImpl.countDeployments((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.CountDeploymentsResponse>) responseObserver);
          break;
        case METHODID_LIST_DEPLOYMENTS:
          serviceImpl.listDeployments((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsResponse>) responseObserver);
          break;
        case METHODID_LIST_DEPLOYMENTS_WITH_PROCESS_INFO:
          serviceImpl.listDeploymentsWithProcessInfo((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.ListDeploymentsWithProcessInfoResponse>) responseObserver);
          break;
        case METHODID_GET_LABELS:
          serviceImpl.getLabels((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.DeploymentServiceOuterClass.DeploymentLabelsResponse>) responseObserver);
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

  private static abstract class DeploymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeploymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.DeploymentServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeploymentService");
    }
  }

  private static final class DeploymentServiceFileDescriptorSupplier
      extends DeploymentServiceBaseDescriptorSupplier {
    DeploymentServiceFileDescriptorSupplier() {}
  }

  private static final class DeploymentServiceMethodDescriptorSupplier
      extends DeploymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeploymentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeploymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeploymentServiceFileDescriptorSupplier())
              .addMethod(getGetDeploymentMethod())
              .addMethod(getGetDeploymentWithRiskMethod())
              .addMethod(getCountDeploymentsMethod())
              .addMethod(getListDeploymentsMethod())
              .addMethod(getListDeploymentsWithProcessInfoMethod())
              .addMethod(getGetLabelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
