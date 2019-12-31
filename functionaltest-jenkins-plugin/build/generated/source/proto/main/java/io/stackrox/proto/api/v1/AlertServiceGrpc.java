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
 * AlertService APIs can be used to manage alerts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/alert_service.proto")
public final class AlertServiceGrpc {

  private AlertServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.AlertService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.AlertOuterClass.Alert> getGetAlertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlert",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.AlertOuterClass.Alert.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.AlertOuterClass.Alert> getGetAlertMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.AlertOuterClass.Alert> getGetAlertMethod;
    if ((getGetAlertMethod = AlertServiceGrpc.getGetAlertMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getGetAlertMethod = AlertServiceGrpc.getGetAlertMethod) == null) {
          AlertServiceGrpc.getGetAlertMethod = getGetAlertMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.AlertOuterClass.Alert>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AlertService", "GetAlert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.AlertOuterClass.Alert.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("GetAlert"))
                  .build();
          }
        }
     }
     return getGetAlertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse> getCountAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountAlerts",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse> getCountAlertsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse> getCountAlertsMethod;
    if ((getCountAlertsMethod = AlertServiceGrpc.getCountAlertsMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getCountAlertsMethod = AlertServiceGrpc.getCountAlertsMethod) == null) {
          AlertServiceGrpc.getCountAlertsMethod = getCountAlertsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AlertService", "CountAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("CountAlerts"))
                  .build();
          }
        }
     }
     return getCountAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse> getListAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAlerts",
      requestType = io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest.class,
      responseType = io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse> getListAlertsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest, io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse> getListAlertsMethod;
    if ((getListAlertsMethod = AlertServiceGrpc.getListAlertsMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getListAlertsMethod = AlertServiceGrpc.getListAlertsMethod) == null) {
          AlertServiceGrpc.getListAlertsMethod = getListAlertsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest, io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AlertService", "ListAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("ListAlerts"))
                  .build();
          }
        }
     }
     return getListAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse> getGetAlertsGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlertsGroup",
      requestType = io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest.class,
      responseType = io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse> getGetAlertsGroupMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest, io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse> getGetAlertsGroupMethod;
    if ((getGetAlertsGroupMethod = AlertServiceGrpc.getGetAlertsGroupMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getGetAlertsGroupMethod = AlertServiceGrpc.getGetAlertsGroupMethod) == null) {
          AlertServiceGrpc.getGetAlertsGroupMethod = getGetAlertsGroupMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest, io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AlertService", "GetAlertsGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("GetAlertsGroup"))
                  .build();
          }
        }
     }
     return getGetAlertsGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse> getGetAlertsCountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlertsCounts",
      requestType = io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest.class,
      responseType = io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse> getGetAlertsCountsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest, io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse> getGetAlertsCountsMethod;
    if ((getGetAlertsCountsMethod = AlertServiceGrpc.getGetAlertsCountsMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getGetAlertsCountsMethod = AlertServiceGrpc.getGetAlertsCountsMethod) == null) {
          AlertServiceGrpc.getGetAlertsCountsMethod = getGetAlertsCountsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest, io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AlertService", "GetAlertsCounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("GetAlertsCounts"))
                  .build();
          }
        }
     }
     return getGetAlertsCountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse> getGetAlertTimeseriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlertTimeseries",
      requestType = io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest.class,
      responseType = io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse> getGetAlertTimeseriesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest, io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse> getGetAlertTimeseriesMethod;
    if ((getGetAlertTimeseriesMethod = AlertServiceGrpc.getGetAlertTimeseriesMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getGetAlertTimeseriesMethod = AlertServiceGrpc.getGetAlertTimeseriesMethod) == null) {
          AlertServiceGrpc.getGetAlertTimeseriesMethod = getGetAlertTimeseriesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest, io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AlertService", "GetAlertTimeseries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("GetAlertTimeseries"))
                  .build();
          }
        }
     }
     return getGetAlertTimeseriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getResolveAlertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveAlert",
      requestType = io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getResolveAlertMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getResolveAlertMethod;
    if ((getResolveAlertMethod = AlertServiceGrpc.getResolveAlertMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getResolveAlertMethod = AlertServiceGrpc.getResolveAlertMethod) == null) {
          AlertServiceGrpc.getResolveAlertMethod = getResolveAlertMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AlertService", "ResolveAlert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("ResolveAlert"))
                  .build();
          }
        }
     }
     return getResolveAlertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getResolveAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveAlerts",
      requestType = io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getResolveAlertsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getResolveAlertsMethod;
    if ((getResolveAlertsMethod = AlertServiceGrpc.getResolveAlertsMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getResolveAlertsMethod = AlertServiceGrpc.getResolveAlertsMethod) == null) {
          AlertServiceGrpc.getResolveAlertsMethod = getResolveAlertsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AlertService", "ResolveAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("ResolveAlerts"))
                  .build();
          }
        }
     }
     return getResolveAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getSnoozeAlertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SnoozeAlert",
      requestType = io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getSnoozeAlertMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getSnoozeAlertMethod;
    if ((getSnoozeAlertMethod = AlertServiceGrpc.getSnoozeAlertMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getSnoozeAlertMethod = AlertServiceGrpc.getSnoozeAlertMethod) == null) {
          AlertServiceGrpc.getSnoozeAlertMethod = getSnoozeAlertMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AlertService", "SnoozeAlert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("SnoozeAlert"))
                  .build();
          }
        }
     }
     return getSnoozeAlertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse> getDeleteAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAlerts",
      requestType = io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest.class,
      responseType = io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest,
      io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse> getDeleteAlertsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest, io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse> getDeleteAlertsMethod;
    if ((getDeleteAlertsMethod = AlertServiceGrpc.getDeleteAlertsMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getDeleteAlertsMethod = AlertServiceGrpc.getDeleteAlertsMethod) == null) {
          AlertServiceGrpc.getDeleteAlertsMethod = getDeleteAlertsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest, io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.AlertService", "DeleteAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("DeleteAlerts"))
                  .build();
          }
        }
     }
     return getDeleteAlertsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlertServiceStub newStub(io.grpc.Channel channel) {
    return new AlertServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlertServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AlertServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlertServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AlertServiceFutureStub(channel);
  }

  /**
   * <pre>
   * AlertService APIs can be used to manage alerts.
   * </pre>
   */
  public static abstract class AlertServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetAlert returns the alert given its id.
     * </pre>
     */
    public void getAlert(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AlertOuterClass.Alert> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAlertMethod(), responseObserver);
    }

    /**
     * <pre>
     * CountAlerts counts how many alerts match the get request.
     * </pre>
     */
    public void countAlerts(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountAlertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List returns the slim list version of the alerts.
     * </pre>
     */
    public void listAlerts(io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAlertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAlertsGroup returns alerts grouped by policy.
     * </pre>
     */
    public void getAlertsGroup(io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAlertsGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAlertsCounts returns the number of alerts in the requested cluster or category.
     * </pre>
     */
    public void getAlertsCounts(io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAlertsCountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAlertTimeseries returns the alerts sorted by time.
     * </pre>
     */
    public void getAlertTimeseries(io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAlertTimeseriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResolveAlert marks the given alert (by ID) as resolved.
     * </pre>
     */
    public void resolveAlert(io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getResolveAlertMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResolveAlertsByQuery marks alerts matching search query as resolved.
     * </pre>
     */
    public void resolveAlerts(io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getResolveAlertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SnoozeAlert is deprecated.
     * </pre>
     */
    public void snoozeAlert(io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSnoozeAlertMethod(), responseObserver);
    }

    /**
     */
    public void deleteAlerts(io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAlertsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAlertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.AlertOuterClass.Alert>(
                  this, METHODID_GET_ALERT)))
          .addMethod(
            getCountAlertsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse>(
                  this, METHODID_COUNT_ALERTS)))
          .addMethod(
            getListAlertsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest,
                io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse>(
                  this, METHODID_LIST_ALERTS)))
          .addMethod(
            getGetAlertsGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest,
                io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse>(
                  this, METHODID_GET_ALERTS_GROUP)))
          .addMethod(
            getGetAlertsCountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest,
                io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse>(
                  this, METHODID_GET_ALERTS_COUNTS)))
          .addMethod(
            getGetAlertTimeseriesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest,
                io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse>(
                  this, METHODID_GET_ALERT_TIMESERIES)))
          .addMethod(
            getResolveAlertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_RESOLVE_ALERT)))
          .addMethod(
            getResolveAlertsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_RESOLVE_ALERTS)))
          .addMethod(
            getSnoozeAlertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_SNOOZE_ALERT)))
          .addMethod(
            getDeleteAlertsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest,
                io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse>(
                  this, METHODID_DELETE_ALERTS)))
          .build();
    }
  }

  /**
   * <pre>
   * AlertService APIs can be used to manage alerts.
   * </pre>
   */
  public static final class AlertServiceStub extends io.grpc.stub.AbstractStub<AlertServiceStub> {
    private AlertServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlertServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlertServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAlert returns the alert given its id.
     * </pre>
     */
    public void getAlert(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AlertOuterClass.Alert> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAlertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CountAlerts counts how many alerts match the get request.
     * </pre>
     */
    public void countAlerts(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List returns the slim list version of the alerts.
     * </pre>
     */
    public void listAlerts(io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAlertsGroup returns alerts grouped by policy.
     * </pre>
     */
    public void getAlertsGroup(io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAlertsGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAlertsCounts returns the number of alerts in the requested cluster or category.
     * </pre>
     */
    public void getAlertsCounts(io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAlertsCountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAlertTimeseries returns the alerts sorted by time.
     * </pre>
     */
    public void getAlertTimeseries(io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAlertTimeseriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResolveAlert marks the given alert (by ID) as resolved.
     * </pre>
     */
    public void resolveAlert(io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResolveAlertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResolveAlertsByQuery marks alerts matching search query as resolved.
     * </pre>
     */
    public void resolveAlerts(io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResolveAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SnoozeAlert is deprecated.
     * </pre>
     */
    public void snoozeAlert(io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSnoozeAlertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAlerts(io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAlertsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AlertService APIs can be used to manage alerts.
   * </pre>
   */
  public static final class AlertServiceBlockingStub extends io.grpc.stub.AbstractStub<AlertServiceBlockingStub> {
    private AlertServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlertServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlertServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAlert returns the alert given its id.
     * </pre>
     */
    public io.stackrox.proto.storage.AlertOuterClass.Alert getAlert(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetAlertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CountAlerts counts how many alerts match the get request.
     * </pre>
     */
    public io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse countAlerts(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getCountAlertsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List returns the slim list version of the alerts.
     * </pre>
     */
    public io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse listAlerts(io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAlertsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAlertsGroup returns alerts grouped by policy.
     * </pre>
     */
    public io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse getAlertsGroup(io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAlertsGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAlertsCounts returns the number of alerts in the requested cluster or category.
     * </pre>
     */
    public io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse getAlertsCounts(io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAlertsCountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAlertTimeseries returns the alerts sorted by time.
     * </pre>
     */
    public io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse getAlertTimeseries(io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAlertTimeseriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResolveAlert marks the given alert (by ID) as resolved.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty resolveAlert(io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest request) {
      return blockingUnaryCall(
          getChannel(), getResolveAlertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResolveAlertsByQuery marks alerts matching search query as resolved.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty resolveAlerts(io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest request) {
      return blockingUnaryCall(
          getChannel(), getResolveAlertsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SnoozeAlert is deprecated.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty snoozeAlert(io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest request) {
      return blockingUnaryCall(
          getChannel(), getSnoozeAlertMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse deleteAlerts(io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAlertsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AlertService APIs can be used to manage alerts.
   * </pre>
   */
  public static final class AlertServiceFutureStub extends io.grpc.stub.AbstractStub<AlertServiceFutureStub> {
    private AlertServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlertServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlertServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAlert returns the alert given its id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.AlertOuterClass.Alert> getAlert(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAlertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CountAlerts counts how many alerts match the get request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse> countAlerts(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getCountAlertsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List returns the slim list version of the alerts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse> listAlerts(
        io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAlertsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAlertsGroup returns alerts grouped by policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse> getAlertsGroup(
        io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAlertsGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAlertsCounts returns the number of alerts in the requested cluster or category.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse> getAlertsCounts(
        io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAlertsCountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAlertTimeseries returns the alerts sorted by time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse> getAlertTimeseries(
        io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAlertTimeseriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResolveAlert marks the given alert (by ID) as resolved.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> resolveAlert(
        io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResolveAlertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResolveAlertsByQuery marks alerts matching search query as resolved.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> resolveAlerts(
        io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResolveAlertsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SnoozeAlert is deprecated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> snoozeAlert(
        io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSnoozeAlertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse> deleteAlerts(
        io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAlertsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALERT = 0;
  private static final int METHODID_COUNT_ALERTS = 1;
  private static final int METHODID_LIST_ALERTS = 2;
  private static final int METHODID_GET_ALERTS_GROUP = 3;
  private static final int METHODID_GET_ALERTS_COUNTS = 4;
  private static final int METHODID_GET_ALERT_TIMESERIES = 5;
  private static final int METHODID_RESOLVE_ALERT = 6;
  private static final int METHODID_RESOLVE_ALERTS = 7;
  private static final int METHODID_SNOOZE_ALERT = 8;
  private static final int METHODID_DELETE_ALERTS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlertServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlertServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALERT:
          serviceImpl.getAlert((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.AlertOuterClass.Alert>) responseObserver);
          break;
        case METHODID_COUNT_ALERTS:
          serviceImpl.countAlerts((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.CountAlertsResponse>) responseObserver);
          break;
        case METHODID_LIST_ALERTS:
          serviceImpl.listAlerts((io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsResponse>) responseObserver);
          break;
        case METHODID_GET_ALERTS_GROUP:
          serviceImpl.getAlertsGroup((io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsGroupResponse>) responseObserver);
          break;
        case METHODID_GET_ALERTS_COUNTS:
          serviceImpl.getAlertsCounts((io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertsCountsResponse>) responseObserver);
          break;
        case METHODID_GET_ALERT_TIMESERIES:
          serviceImpl.getAlertTimeseries((io.stackrox.proto.api.v1.AlertServiceOuterClass.ListAlertsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.GetAlertTimeseriesResponse>) responseObserver);
          break;
        case METHODID_RESOLVE_ALERT:
          serviceImpl.resolveAlert((io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_RESOLVE_ALERTS:
          serviceImpl.resolveAlerts((io.stackrox.proto.api.v1.AlertServiceOuterClass.ResolveAlertsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_SNOOZE_ALERT:
          serviceImpl.snoozeAlert((io.stackrox.proto.api.v1.AlertServiceOuterClass.SnoozeAlertRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_DELETE_ALERTS:
          serviceImpl.deleteAlerts((io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.AlertServiceOuterClass.DeleteAlertsResponse>) responseObserver);
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

  private static abstract class AlertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlertServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.AlertServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlertService");
    }
  }

  private static final class AlertServiceFileDescriptorSupplier
      extends AlertServiceBaseDescriptorSupplier {
    AlertServiceFileDescriptorSupplier() {}
  }

  private static final class AlertServiceMethodDescriptorSupplier
      extends AlertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlertServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AlertServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlertServiceFileDescriptorSupplier())
              .addMethod(getGetAlertMethod())
              .addMethod(getCountAlertsMethod())
              .addMethod(getListAlertsMethod())
              .addMethod(getGetAlertsGroupMethod())
              .addMethod(getGetAlertsCountsMethod())
              .addMethod(getGetAlertTimeseriesMethod())
              .addMethod(getResolveAlertMethod())
              .addMethod(getResolveAlertsMethod())
              .addMethod(getSnoozeAlertMethod())
              .addMethod(getDeleteAlertsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
