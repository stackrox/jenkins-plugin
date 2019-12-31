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
    comments = "Source: api/v1/compliance_management_service.proto")
public final class ComplianceManagementServiceGrpc {

  private ComplianceManagementServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ComplianceManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse> getGetRunSchedulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRunSchedules",
      requestType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest.class,
      responseType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse> getGetRunSchedulesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse> getGetRunSchedulesMethod;
    if ((getGetRunSchedulesMethod = ComplianceManagementServiceGrpc.getGetRunSchedulesMethod) == null) {
      synchronized (ComplianceManagementServiceGrpc.class) {
        if ((getGetRunSchedulesMethod = ComplianceManagementServiceGrpc.getGetRunSchedulesMethod) == null) {
          ComplianceManagementServiceGrpc.getGetRunSchedulesMethod = getGetRunSchedulesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceManagementService", "GetRunSchedules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceManagementServiceMethodDescriptorSupplier("GetRunSchedules"))
                  .build();
          }
        }
     }
     return getGetRunSchedulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse> getAddRunScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRunSchedule",
      requestType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest.class,
      responseType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse> getAddRunScheduleMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse> getAddRunScheduleMethod;
    if ((getAddRunScheduleMethod = ComplianceManagementServiceGrpc.getAddRunScheduleMethod) == null) {
      synchronized (ComplianceManagementServiceGrpc.class) {
        if ((getAddRunScheduleMethod = ComplianceManagementServiceGrpc.getAddRunScheduleMethod) == null) {
          ComplianceManagementServiceGrpc.getAddRunScheduleMethod = getAddRunScheduleMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceManagementService", "AddRunSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceManagementServiceMethodDescriptorSupplier("AddRunSchedule"))
                  .build();
          }
        }
     }
     return getAddRunScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse> getUpdateRunScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRunSchedule",
      requestType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest.class,
      responseType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse> getUpdateRunScheduleMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse> getUpdateRunScheduleMethod;
    if ((getUpdateRunScheduleMethod = ComplianceManagementServiceGrpc.getUpdateRunScheduleMethod) == null) {
      synchronized (ComplianceManagementServiceGrpc.class) {
        if ((getUpdateRunScheduleMethod = ComplianceManagementServiceGrpc.getUpdateRunScheduleMethod) == null) {
          ComplianceManagementServiceGrpc.getUpdateRunScheduleMethod = getUpdateRunScheduleMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceManagementService", "UpdateRunSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceManagementServiceMethodDescriptorSupplier("UpdateRunSchedule"))
                  .build();
          }
        }
     }
     return getUpdateRunScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteRunScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRunSchedule",
      requestType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteRunScheduleMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeleteRunScheduleMethod;
    if ((getDeleteRunScheduleMethod = ComplianceManagementServiceGrpc.getDeleteRunScheduleMethod) == null) {
      synchronized (ComplianceManagementServiceGrpc.class) {
        if ((getDeleteRunScheduleMethod = ComplianceManagementServiceGrpc.getDeleteRunScheduleMethod) == null) {
          ComplianceManagementServiceGrpc.getDeleteRunScheduleMethod = getDeleteRunScheduleMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceManagementService", "DeleteRunSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceManagementServiceMethodDescriptorSupplier("DeleteRunSchedule"))
                  .build();
          }
        }
     }
     return getDeleteRunScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse> getGetRecentRunsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecentRuns",
      requestType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest.class,
      responseType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse> getGetRecentRunsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse> getGetRecentRunsMethod;
    if ((getGetRecentRunsMethod = ComplianceManagementServiceGrpc.getGetRecentRunsMethod) == null) {
      synchronized (ComplianceManagementServiceGrpc.class) {
        if ((getGetRecentRunsMethod = ComplianceManagementServiceGrpc.getGetRecentRunsMethod) == null) {
          ComplianceManagementServiceGrpc.getGetRecentRunsMethod = getGetRecentRunsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceManagementService", "GetRecentRuns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceManagementServiceMethodDescriptorSupplier("GetRecentRuns"))
                  .build();
          }
        }
     }
     return getGetRecentRunsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse> getTriggerRunsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerRuns",
      requestType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest.class,
      responseType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse> getTriggerRunsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse> getTriggerRunsMethod;
    if ((getTriggerRunsMethod = ComplianceManagementServiceGrpc.getTriggerRunsMethod) == null) {
      synchronized (ComplianceManagementServiceGrpc.class) {
        if ((getTriggerRunsMethod = ComplianceManagementServiceGrpc.getTriggerRunsMethod) == null) {
          ComplianceManagementServiceGrpc.getTriggerRunsMethod = getTriggerRunsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceManagementService", "TriggerRuns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceManagementServiceMethodDescriptorSupplier("TriggerRuns"))
                  .build();
          }
        }
     }
     return getTriggerRunsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse> getGetRunStatusesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRunStatuses",
      requestType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest.class,
      responseType = io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest,
      io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse> getGetRunStatusesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse> getGetRunStatusesMethod;
    if ((getGetRunStatusesMethod = ComplianceManagementServiceGrpc.getGetRunStatusesMethod) == null) {
      synchronized (ComplianceManagementServiceGrpc.class) {
        if ((getGetRunStatusesMethod = ComplianceManagementServiceGrpc.getGetRunStatusesMethod) == null) {
          ComplianceManagementServiceGrpc.getGetRunStatusesMethod = getGetRunStatusesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest, io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ComplianceManagementService", "GetRunStatuses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceManagementServiceMethodDescriptorSupplier("GetRunStatuses"))
                  .build();
          }
        }
     }
     return getGetRunStatusesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComplianceManagementServiceStub newStub(io.grpc.Channel channel) {
    return new ComplianceManagementServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComplianceManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ComplianceManagementServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComplianceManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ComplianceManagementServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ComplianceManagementServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRunSchedules(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRunSchedulesMethod(), responseObserver);
    }

    /**
     */
    public void addRunSchedule(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRunScheduleMethod(), responseObserver);
    }

    /**
     */
    public void updateRunSchedule(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRunScheduleMethod(), responseObserver);
    }

    /**
     */
    public void deleteRunSchedule(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRunScheduleMethod(), responseObserver);
    }

    /**
     */
    public void getRecentRuns(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRecentRunsMethod(), responseObserver);
    }

    /**
     */
    public void triggerRuns(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerRunsMethod(), responseObserver);
    }

    /**
     */
    public void getRunStatuses(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRunStatusesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRunSchedulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest,
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse>(
                  this, METHODID_GET_RUN_SCHEDULES)))
          .addMethod(
            getAddRunScheduleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest,
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse>(
                  this, METHODID_ADD_RUN_SCHEDULE)))
          .addMethod(
            getUpdateRunScheduleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest,
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse>(
                  this, METHODID_UPDATE_RUN_SCHEDULE)))
          .addMethod(
            getDeleteRunScheduleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DELETE_RUN_SCHEDULE)))
          .addMethod(
            getGetRecentRunsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest,
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse>(
                  this, METHODID_GET_RECENT_RUNS)))
          .addMethod(
            getTriggerRunsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest,
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse>(
                  this, METHODID_TRIGGER_RUNS)))
          .addMethod(
            getGetRunStatusesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest,
                io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse>(
                  this, METHODID_GET_RUN_STATUSES)))
          .build();
    }
  }

  /**
   */
  public static final class ComplianceManagementServiceStub extends io.grpc.stub.AbstractStub<ComplianceManagementServiceStub> {
    private ComplianceManagementServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceManagementServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceManagementServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceManagementServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRunSchedules(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRunSchedulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRunSchedule(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRunScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRunSchedule(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRunScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRunSchedule(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRunScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRecentRuns(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRecentRunsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerRuns(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTriggerRunsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRunStatuses(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRunStatusesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ComplianceManagementServiceBlockingStub extends io.grpc.stub.AbstractStub<ComplianceManagementServiceBlockingStub> {
    private ComplianceManagementServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceManagementServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceManagementServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse getRunSchedules(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRunSchedulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse addRunSchedule(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddRunScheduleMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse updateRunSchedule(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRunScheduleMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty deleteRunSchedule(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRunScheduleMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse getRecentRuns(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRecentRunsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse triggerRuns(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest request) {
      return blockingUnaryCall(
          getChannel(), getTriggerRunsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse getRunStatuses(io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRunStatusesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ComplianceManagementServiceFutureStub extends io.grpc.stub.AbstractStub<ComplianceManagementServiceFutureStub> {
    private ComplianceManagementServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceManagementServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceManagementServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceManagementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse> getRunSchedules(
        io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRunSchedulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse> addRunSchedule(
        io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRunScheduleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse> updateRunSchedule(
        io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRunScheduleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> deleteRunSchedule(
        io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRunScheduleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse> getRecentRuns(
        io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRecentRunsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse> triggerRuns(
        io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTriggerRunsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse> getRunStatuses(
        io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRunStatusesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RUN_SCHEDULES = 0;
  private static final int METHODID_ADD_RUN_SCHEDULE = 1;
  private static final int METHODID_UPDATE_RUN_SCHEDULE = 2;
  private static final int METHODID_DELETE_RUN_SCHEDULE = 3;
  private static final int METHODID_GET_RECENT_RUNS = 4;
  private static final int METHODID_TRIGGER_RUNS = 5;
  private static final int METHODID_GET_RUN_STATUSES = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ComplianceManagementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ComplianceManagementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RUN_SCHEDULES:
          serviceImpl.getRunSchedules((io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunSchedulesResponse>) responseObserver);
          break;
        case METHODID_ADD_RUN_SCHEDULE:
          serviceImpl.addRunSchedule((io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.AddComplianceRunScheduleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RUN_SCHEDULE:
          serviceImpl.updateRunSchedule((io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.UpdateComplianceRunScheduleResponse>) responseObserver);
          break;
        case METHODID_DELETE_RUN_SCHEDULE:
          serviceImpl.deleteRunSchedule((io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.DeleteComplianceRunScheduleRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GET_RECENT_RUNS:
          serviceImpl.getRecentRuns((io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetRecentComplianceRunsResponse>) responseObserver);
          break;
        case METHODID_TRIGGER_RUNS:
          serviceImpl.triggerRuns((io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.TriggerComplianceRunsResponse>) responseObserver);
          break;
        case METHODID_GET_RUN_STATUSES:
          serviceImpl.getRunStatuses((io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.GetComplianceRunStatusesResponse>) responseObserver);
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

  private static abstract class ComplianceManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComplianceManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.ComplianceManagementServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComplianceManagementService");
    }
  }

  private static final class ComplianceManagementServiceFileDescriptorSupplier
      extends ComplianceManagementServiceBaseDescriptorSupplier {
    ComplianceManagementServiceFileDescriptorSupplier() {}
  }

  private static final class ComplianceManagementServiceMethodDescriptorSupplier
      extends ComplianceManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ComplianceManagementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ComplianceManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComplianceManagementServiceFileDescriptorSupplier())
              .addMethod(getGetRunSchedulesMethod())
              .addMethod(getAddRunScheduleMethod())
              .addMethod(getUpdateRunScheduleMethod())
              .addMethod(getDeleteRunScheduleMethod())
              .addMethod(getGetRecentRunsMethod())
              .addMethod(getTriggerRunsMethod())
              .addMethod(getGetRunStatusesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
