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
    comments = "Source: api/v1/network_policy_service.proto")
public final class NetworkPolicyServiceGrpc {

  private NetworkPolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.NetworkPolicyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy> getGetNetworkPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNetworkPolicy",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy> getGetNetworkPolicyMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy> getGetNetworkPolicyMethod;
    if ((getGetNetworkPolicyMethod = NetworkPolicyServiceGrpc.getGetNetworkPolicyMethod) == null) {
      synchronized (NetworkPolicyServiceGrpc.class) {
        if ((getGetNetworkPolicyMethod = NetworkPolicyServiceGrpc.getGetNetworkPolicyMethod) == null) {
          NetworkPolicyServiceGrpc.getGetNetworkPolicyMethod = getGetNetworkPolicyMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NetworkPolicyService", "GetNetworkPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkPolicyServiceMethodDescriptorSupplier("GetNetworkPolicy"))
                  .build();
          }
        }
     }
     return getGetNetworkPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest,
      io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse> getGetNetworkPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNetworkPolicies",
      requestType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest.class,
      responseType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest,
      io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse> getGetNetworkPoliciesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest, io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse> getGetNetworkPoliciesMethod;
    if ((getGetNetworkPoliciesMethod = NetworkPolicyServiceGrpc.getGetNetworkPoliciesMethod) == null) {
      synchronized (NetworkPolicyServiceGrpc.class) {
        if ((getGetNetworkPoliciesMethod = NetworkPolicyServiceGrpc.getGetNetworkPoliciesMethod) == null) {
          NetworkPolicyServiceGrpc.getGetNetworkPoliciesMethod = getGetNetworkPoliciesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest, io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NetworkPolicyService", "GetNetworkPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkPolicyServiceMethodDescriptorSupplier("GetNetworkPolicies"))
                  .build();
          }
        }
     }
     return getGetNetworkPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest,
      io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> getGetNetworkGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNetworkGraph",
      requestType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest.class,
      responseType = io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest,
      io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> getGetNetworkGraphMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest, io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> getGetNetworkGraphMethod;
    if ((getGetNetworkGraphMethod = NetworkPolicyServiceGrpc.getGetNetworkGraphMethod) == null) {
      synchronized (NetworkPolicyServiceGrpc.class) {
        if ((getGetNetworkGraphMethod = NetworkPolicyServiceGrpc.getGetNetworkGraphMethod) == null) {
          NetworkPolicyServiceGrpc.getGetNetworkGraphMethod = getGetNetworkGraphMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest, io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NetworkPolicyService", "GetNetworkGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkPolicyServiceMethodDescriptorSupplier("GetNetworkGraph"))
                  .build();
          }
        }
     }
     return getGetNetworkGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest,
      io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch> getGetNetworkGraphEpochMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNetworkGraphEpoch",
      requestType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest.class,
      responseType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest,
      io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch> getGetNetworkGraphEpochMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest, io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch> getGetNetworkGraphEpochMethod;
    if ((getGetNetworkGraphEpochMethod = NetworkPolicyServiceGrpc.getGetNetworkGraphEpochMethod) == null) {
      synchronized (NetworkPolicyServiceGrpc.class) {
        if ((getGetNetworkGraphEpochMethod = NetworkPolicyServiceGrpc.getGetNetworkGraphEpochMethod) == null) {
          NetworkPolicyServiceGrpc.getGetNetworkGraphEpochMethod = getGetNetworkGraphEpochMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest, io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NetworkPolicyService", "GetNetworkGraphEpoch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkPolicyServiceMethodDescriptorSupplier("GetNetworkGraphEpoch"))
                  .build();
          }
        }
     }
     return getGetNetworkGraphEpochMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getApplyNetworkPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyNetworkPolicy",
      requestType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getApplyNetworkPolicyMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getApplyNetworkPolicyMethod;
    if ((getApplyNetworkPolicyMethod = NetworkPolicyServiceGrpc.getApplyNetworkPolicyMethod) == null) {
      synchronized (NetworkPolicyServiceGrpc.class) {
        if ((getApplyNetworkPolicyMethod = NetworkPolicyServiceGrpc.getApplyNetworkPolicyMethod) == null) {
          NetworkPolicyServiceGrpc.getApplyNetworkPolicyMethod = getApplyNetworkPolicyMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NetworkPolicyService", "ApplyNetworkPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkPolicyServiceMethodDescriptorSupplier("ApplyNetworkPolicy"))
                  .build();
          }
        }
     }
     return getApplyNetworkPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest,
      io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse> getGetUndoModificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUndoModification",
      requestType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest.class,
      responseType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest,
      io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse> getGetUndoModificationMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest, io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse> getGetUndoModificationMethod;
    if ((getGetUndoModificationMethod = NetworkPolicyServiceGrpc.getGetUndoModificationMethod) == null) {
      synchronized (NetworkPolicyServiceGrpc.class) {
        if ((getGetUndoModificationMethod = NetworkPolicyServiceGrpc.getGetUndoModificationMethod) == null) {
          NetworkPolicyServiceGrpc.getGetUndoModificationMethod = getGetUndoModificationMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest, io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NetworkPolicyService", "GetUndoModification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkPolicyServiceMethodDescriptorSupplier("GetUndoModification"))
                  .build();
          }
        }
     }
     return getGetUndoModificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest,
      io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse> getSimulateNetworkGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimulateNetworkGraph",
      requestType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest.class,
      responseType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest,
      io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse> getSimulateNetworkGraphMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest, io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse> getSimulateNetworkGraphMethod;
    if ((getSimulateNetworkGraphMethod = NetworkPolicyServiceGrpc.getSimulateNetworkGraphMethod) == null) {
      synchronized (NetworkPolicyServiceGrpc.class) {
        if ((getSimulateNetworkGraphMethod = NetworkPolicyServiceGrpc.getSimulateNetworkGraphMethod) == null) {
          NetworkPolicyServiceGrpc.getSimulateNetworkGraphMethod = getSimulateNetworkGraphMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest, io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NetworkPolicyService", "SimulateNetworkGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkPolicyServiceMethodDescriptorSupplier("SimulateNetworkGraph"))
                  .build();
          }
        }
     }
     return getSimulateNetworkGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getSendNetworkPolicyYAMLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendNetworkPolicyYAML",
      requestType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getSendNetworkPolicyYAMLMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getSendNetworkPolicyYAMLMethod;
    if ((getSendNetworkPolicyYAMLMethod = NetworkPolicyServiceGrpc.getSendNetworkPolicyYAMLMethod) == null) {
      synchronized (NetworkPolicyServiceGrpc.class) {
        if ((getSendNetworkPolicyYAMLMethod = NetworkPolicyServiceGrpc.getSendNetworkPolicyYAMLMethod) == null) {
          NetworkPolicyServiceGrpc.getSendNetworkPolicyYAMLMethod = getSendNetworkPolicyYAMLMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NetworkPolicyService", "SendNetworkPolicyYAML"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkPolicyServiceMethodDescriptorSupplier("SendNetworkPolicyYAML"))
                  .build();
          }
        }
     }
     return getSendNetworkPolicyYAMLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest,
      io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse> getGenerateNetworkPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateNetworkPolicies",
      requestType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest.class,
      responseType = io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest,
      io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse> getGenerateNetworkPoliciesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest, io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse> getGenerateNetworkPoliciesMethod;
    if ((getGenerateNetworkPoliciesMethod = NetworkPolicyServiceGrpc.getGenerateNetworkPoliciesMethod) == null) {
      synchronized (NetworkPolicyServiceGrpc.class) {
        if ((getGenerateNetworkPoliciesMethod = NetworkPolicyServiceGrpc.getGenerateNetworkPoliciesMethod) == null) {
          NetworkPolicyServiceGrpc.getGenerateNetworkPoliciesMethod = getGenerateNetworkPoliciesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest, io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.NetworkPolicyService", "GenerateNetworkPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkPolicyServiceMethodDescriptorSupplier("GenerateNetworkPolicies"))
                  .build();
          }
        }
     }
     return getGenerateNetworkPoliciesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkPolicyServiceStub newStub(io.grpc.Channel channel) {
    return new NetworkPolicyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkPolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NetworkPolicyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkPolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NetworkPolicyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NetworkPolicyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNetworkPolicy(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNetworkPolicyMethod(), responseObserver);
    }

    /**
     */
    public void getNetworkPolicies(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNetworkPoliciesMethod(), responseObserver);
    }

    /**
     */
    public void getNetworkGraph(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNetworkGraphMethod(), responseObserver);
    }

    /**
     */
    public void getNetworkGraphEpoch(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNetworkGraphEpochMethod(), responseObserver);
    }

    /**
     */
    public void applyNetworkPolicy(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getApplyNetworkPolicyMethod(), responseObserver);
    }

    /**
     */
    public void getUndoModification(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUndoModificationMethod(), responseObserver);
    }

    /**
     */
    public void simulateNetworkGraph(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSimulateNetworkGraphMethod(), responseObserver);
    }

    /**
     */
    public void sendNetworkPolicyYAML(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSendNetworkPolicyYAMLMethod(), responseObserver);
    }

    /**
     */
    public void generateNetworkPolicies(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateNetworkPoliciesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNetworkPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy>(
                  this, METHODID_GET_NETWORK_POLICY)))
          .addMethod(
            getGetNetworkPoliciesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest,
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse>(
                  this, METHODID_GET_NETWORK_POLICIES)))
          .addMethod(
            getGetNetworkGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest,
                io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph>(
                  this, METHODID_GET_NETWORK_GRAPH)))
          .addMethod(
            getGetNetworkGraphEpochMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest,
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch>(
                  this, METHODID_GET_NETWORK_GRAPH_EPOCH)))
          .addMethod(
            getApplyNetworkPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_APPLY_NETWORK_POLICY)))
          .addMethod(
            getGetUndoModificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest,
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse>(
                  this, METHODID_GET_UNDO_MODIFICATION)))
          .addMethod(
            getSimulateNetworkGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest,
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse>(
                  this, METHODID_SIMULATE_NETWORK_GRAPH)))
          .addMethod(
            getSendNetworkPolicyYAMLMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_SEND_NETWORK_POLICY_YAML)))
          .addMethod(
            getGenerateNetworkPoliciesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest,
                io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse>(
                  this, METHODID_GENERATE_NETWORK_POLICIES)))
          .build();
    }
  }

  /**
   */
  public static final class NetworkPolicyServiceStub extends io.grpc.stub.AbstractStub<NetworkPolicyServiceStub> {
    private NetworkPolicyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkPolicyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkPolicyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkPolicyServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNetworkPolicy(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNetworkPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNetworkPolicies(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNetworkPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNetworkGraph(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNetworkGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNetworkGraphEpoch(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNetworkGraphEpochMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void applyNetworkPolicy(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApplyNetworkPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUndoModification(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUndoModificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void simulateNetworkGraph(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSimulateNetworkGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendNetworkPolicyYAML(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendNetworkPolicyYAMLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateNetworkPolicies(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateNetworkPoliciesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NetworkPolicyServiceBlockingStub extends io.grpc.stub.AbstractStub<NetworkPolicyServiceBlockingStub> {
    private NetworkPolicyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkPolicyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkPolicyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkPolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy getNetworkPolicy(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetNetworkPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse getNetworkPolicies(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNetworkPoliciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph getNetworkGraph(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNetworkGraphMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch getNetworkGraphEpoch(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNetworkGraphEpochMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty applyNetworkPolicy(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest request) {
      return blockingUnaryCall(
          getChannel(), getApplyNetworkPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse getUndoModification(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUndoModificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse simulateNetworkGraph(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getSimulateNetworkGraphMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty sendNetworkPolicyYAML(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendNetworkPolicyYAMLMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse generateNetworkPolicies(io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateNetworkPoliciesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NetworkPolicyServiceFutureStub extends io.grpc.stub.AbstractStub<NetworkPolicyServiceFutureStub> {
    private NetworkPolicyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkPolicyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkPolicyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkPolicyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy> getNetworkPolicy(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNetworkPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse> getNetworkPolicies(
        io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNetworkPoliciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph> getNetworkGraph(
        io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNetworkGraphMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch> getNetworkGraphEpoch(
        io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNetworkGraphEpochMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> applyNetworkPolicy(
        io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getApplyNetworkPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse> getUndoModification(
        io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUndoModificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse> simulateNetworkGraph(
        io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSimulateNetworkGraphMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> sendNetworkPolicyYAML(
        io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendNetworkPolicyYAMLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse> generateNetworkPolicies(
        io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateNetworkPoliciesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NETWORK_POLICY = 0;
  private static final int METHODID_GET_NETWORK_POLICIES = 1;
  private static final int METHODID_GET_NETWORK_GRAPH = 2;
  private static final int METHODID_GET_NETWORK_GRAPH_EPOCH = 3;
  private static final int METHODID_APPLY_NETWORK_POLICY = 4;
  private static final int METHODID_GET_UNDO_MODIFICATION = 5;
  private static final int METHODID_SIMULATE_NETWORK_GRAPH = 6;
  private static final int METHODID_SEND_NETWORK_POLICY_YAML = 7;
  private static final int METHODID_GENERATE_NETWORK_POLICIES = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkPolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkPolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NETWORK_POLICY:
          serviceImpl.getNetworkPolicy((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.NetworkPolicyOuterClass.NetworkPolicy>) responseObserver);
          break;
        case METHODID_GET_NETWORK_POLICIES:
          serviceImpl.getNetworkPolicies((io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkPoliciesResponse>) responseObserver);
          break;
        case METHODID_GET_NETWORK_GRAPH:
          serviceImpl.getNetworkGraph((io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkGraphOuterClass.NetworkGraph>) responseObserver);
          break;
        case METHODID_GET_NETWORK_GRAPH_EPOCH:
          serviceImpl.getNetworkGraphEpoch((io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetNetworkGraphEpochRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.NetworkGraphEpoch>) responseObserver);
          break;
        case METHODID_APPLY_NETWORK_POLICY:
          serviceImpl.applyNetworkPolicy((io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.ApplyNetworkPolicyYamlRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GET_UNDO_MODIFICATION:
          serviceImpl.getUndoModification((io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GetUndoModificationResponse>) responseObserver);
          break;
        case METHODID_SIMULATE_NETWORK_GRAPH:
          serviceImpl.simulateNetworkGraph((io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SimulateNetworkGraphResponse>) responseObserver);
          break;
        case METHODID_SEND_NETWORK_POLICY_YAML:
          serviceImpl.sendNetworkPolicyYAML((io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.SendNetworkPolicyYamlRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GENERATE_NETWORK_POLICIES:
          serviceImpl.generateNetworkPolicies((io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.GenerateNetworkPoliciesResponse>) responseObserver);
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

  private static abstract class NetworkPolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkPolicyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.NetworkPolicyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkPolicyService");
    }
  }

  private static final class NetworkPolicyServiceFileDescriptorSupplier
      extends NetworkPolicyServiceBaseDescriptorSupplier {
    NetworkPolicyServiceFileDescriptorSupplier() {}
  }

  private static final class NetworkPolicyServiceMethodDescriptorSupplier
      extends NetworkPolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkPolicyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkPolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkPolicyServiceFileDescriptorSupplier())
              .addMethod(getGetNetworkPolicyMethod())
              .addMethod(getGetNetworkPoliciesMethod())
              .addMethod(getGetNetworkGraphMethod())
              .addMethod(getGetNetworkGraphEpochMethod())
              .addMethod(getApplyNetworkPolicyMethod())
              .addMethod(getGetUndoModificationMethod())
              .addMethod(getSimulateNetworkGraphMethod())
              .addMethod(getSendNetworkPolicyYAMLMethod())
              .addMethod(getGenerateNetworkPoliciesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
