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
 * ProcessService APIs can be used to list processes executed in deployments.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/process_service.proto")
public final class ProcessServiceGrpc {

  private ProcessServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ProcessService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest,
      io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse> getGetProcessesByDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProcessesByDeployment",
      requestType = io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest.class,
      responseType = io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest,
      io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse> getGetProcessesByDeploymentMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest, io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse> getGetProcessesByDeploymentMethod;
    if ((getGetProcessesByDeploymentMethod = ProcessServiceGrpc.getGetProcessesByDeploymentMethod) == null) {
      synchronized (ProcessServiceGrpc.class) {
        if ((getGetProcessesByDeploymentMethod = ProcessServiceGrpc.getGetProcessesByDeploymentMethod) == null) {
          ProcessServiceGrpc.getGetProcessesByDeploymentMethod = getGetProcessesByDeploymentMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest, io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProcessService", "GetProcessesByDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProcessServiceMethodDescriptorSupplier("GetProcessesByDeployment"))
                  .build();
          }
        }
     }
     return getGetProcessesByDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest,
      io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse> getGetGroupedProcessByDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGroupedProcessByDeployment",
      requestType = io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest.class,
      responseType = io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest,
      io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse> getGetGroupedProcessByDeploymentMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest, io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse> getGetGroupedProcessByDeploymentMethod;
    if ((getGetGroupedProcessByDeploymentMethod = ProcessServiceGrpc.getGetGroupedProcessByDeploymentMethod) == null) {
      synchronized (ProcessServiceGrpc.class) {
        if ((getGetGroupedProcessByDeploymentMethod = ProcessServiceGrpc.getGetGroupedProcessByDeploymentMethod) == null) {
          ProcessServiceGrpc.getGetGroupedProcessByDeploymentMethod = getGetGroupedProcessByDeploymentMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest, io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProcessService", "GetGroupedProcessByDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProcessServiceMethodDescriptorSupplier("GetGroupedProcessByDeployment"))
                  .build();
          }
        }
     }
     return getGetGroupedProcessByDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest,
      io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse> getGetGroupedProcessByDeploymentAndContainerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGroupedProcessByDeploymentAndContainer",
      requestType = io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest.class,
      responseType = io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest,
      io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse> getGetGroupedProcessByDeploymentAndContainerMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest, io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse> getGetGroupedProcessByDeploymentAndContainerMethod;
    if ((getGetGroupedProcessByDeploymentAndContainerMethod = ProcessServiceGrpc.getGetGroupedProcessByDeploymentAndContainerMethod) == null) {
      synchronized (ProcessServiceGrpc.class) {
        if ((getGetGroupedProcessByDeploymentAndContainerMethod = ProcessServiceGrpc.getGetGroupedProcessByDeploymentAndContainerMethod) == null) {
          ProcessServiceGrpc.getGetGroupedProcessByDeploymentAndContainerMethod = getGetGroupedProcessByDeploymentAndContainerMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest, io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProcessService", "GetGroupedProcessByDeploymentAndContainer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProcessServiceMethodDescriptorSupplier("GetGroupedProcessByDeploymentAndContainer"))
                  .build();
          }
        }
     }
     return getGetGroupedProcessByDeploymentAndContainerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProcessServiceStub newStub(io.grpc.Channel channel) {
    return new ProcessServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProcessServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProcessServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProcessServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProcessServiceFutureStub(channel);
  }

  /**
   * <pre>
   * ProcessService APIs can be used to list processes executed in deployments.
   * </pre>
   */
  public static abstract class ProcessServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetProcessesByDeployment returns the processes executed in the given deployment.
     * </pre>
     */
    public void getProcessesByDeployment(io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProcessesByDeploymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetGroupedProcessByDeployment returns all the processes executed grouped by deployment.
     * </pre>
     */
    public void getGroupedProcessByDeployment(io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupedProcessByDeploymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetGroupedProcessByDeploymentAndContainer returns all the processes executed grouped by deployment and container.
     * </pre>
     */
    public void getGroupedProcessByDeploymentAndContainer(io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupedProcessByDeploymentAndContainerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProcessesByDeploymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest,
                io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse>(
                  this, METHODID_GET_PROCESSES_BY_DEPLOYMENT)))
          .addMethod(
            getGetGroupedProcessByDeploymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest,
                io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse>(
                  this, METHODID_GET_GROUPED_PROCESS_BY_DEPLOYMENT)))
          .addMethod(
            getGetGroupedProcessByDeploymentAndContainerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest,
                io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse>(
                  this, METHODID_GET_GROUPED_PROCESS_BY_DEPLOYMENT_AND_CONTAINER)))
          .build();
    }
  }

  /**
   * <pre>
   * ProcessService APIs can be used to list processes executed in deployments.
   * </pre>
   */
  public static final class ProcessServiceStub extends io.grpc.stub.AbstractStub<ProcessServiceStub> {
    private ProcessServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProcessServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProcessServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetProcessesByDeployment returns the processes executed in the given deployment.
     * </pre>
     */
    public void getProcessesByDeployment(io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProcessesByDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetGroupedProcessByDeployment returns all the processes executed grouped by deployment.
     * </pre>
     */
    public void getGroupedProcessByDeployment(io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupedProcessByDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetGroupedProcessByDeploymentAndContainer returns all the processes executed grouped by deployment and container.
     * </pre>
     */
    public void getGroupedProcessByDeploymentAndContainer(io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupedProcessByDeploymentAndContainerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ProcessService APIs can be used to list processes executed in deployments.
   * </pre>
   */
  public static final class ProcessServiceBlockingStub extends io.grpc.stub.AbstractStub<ProcessServiceBlockingStub> {
    private ProcessServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProcessServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProcessServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetProcessesByDeployment returns the processes executed in the given deployment.
     * </pre>
     */
    public io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse getProcessesByDeployment(io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProcessesByDeploymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetGroupedProcessByDeployment returns all the processes executed grouped by deployment.
     * </pre>
     */
    public io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse getGroupedProcessByDeployment(io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupedProcessByDeploymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetGroupedProcessByDeploymentAndContainer returns all the processes executed grouped by deployment and container.
     * </pre>
     */
    public io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse getGroupedProcessByDeploymentAndContainer(io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupedProcessByDeploymentAndContainerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ProcessService APIs can be used to list processes executed in deployments.
   * </pre>
   */
  public static final class ProcessServiceFutureStub extends io.grpc.stub.AbstractStub<ProcessServiceFutureStub> {
    private ProcessServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProcessServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProcessServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetProcessesByDeployment returns the processes executed in the given deployment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse> getProcessesByDeployment(
        io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProcessesByDeploymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetGroupedProcessByDeployment returns all the processes executed grouped by deployment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse> getGroupedProcessByDeployment(
        io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupedProcessByDeploymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetGroupedProcessByDeploymentAndContainer returns all the processes executed grouped by deployment and container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse> getGroupedProcessByDeploymentAndContainer(
        io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupedProcessByDeploymentAndContainerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROCESSES_BY_DEPLOYMENT = 0;
  private static final int METHODID_GET_GROUPED_PROCESS_BY_DEPLOYMENT = 1;
  private static final int METHODID_GET_GROUPED_PROCESS_BY_DEPLOYMENT_AND_CONTAINER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProcessServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProcessServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROCESSES_BY_DEPLOYMENT:
          serviceImpl.getProcessesByDeployment((io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesResponse>) responseObserver);
          break;
        case METHODID_GET_GROUPED_PROCESS_BY_DEPLOYMENT:
          serviceImpl.getGroupedProcessByDeployment((io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesResponse>) responseObserver);
          break;
        case METHODID_GET_GROUPED_PROCESS_BY_DEPLOYMENT_AND_CONTAINER:
          serviceImpl.getGroupedProcessByDeploymentAndContainer((io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetProcessesByDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ProcessServiceOuterClass.GetGroupedProcessesWithContainerResponse>) responseObserver);
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

  private static abstract class ProcessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProcessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ProcessServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProcessService");
    }
  }

  private static final class ProcessServiceFileDescriptorSupplier
      extends ProcessServiceBaseDescriptorSupplier {
    ProcessServiceFileDescriptorSupplier() {}
  }

  private static final class ProcessServiceMethodDescriptorSupplier
      extends ProcessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProcessServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProcessServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProcessServiceFileDescriptorSupplier())
              .addMethod(getGetProcessesByDeploymentMethod())
              .addMethod(getGetGroupedProcessByDeploymentMethod())
              .addMethod(getGetGroupedProcessByDeploymentAndContainerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
