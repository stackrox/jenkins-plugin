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
 * PolicyService APIs can be used to manage policies.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: api/v1/policy_service.proto")
public final class PolicyServiceGrpc {

  private PolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.PolicyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.PolicyOuterClass.Policy> getGetPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPolicy",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.storage.PolicyOuterClass.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.storage.PolicyOuterClass.Policy> getGetPolicyMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.PolicyOuterClass.Policy> getGetPolicyMethod;
    if ((getGetPolicyMethod = PolicyServiceGrpc.getGetPolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getGetPolicyMethod = PolicyServiceGrpc.getGetPolicyMethod) == null) {
          PolicyServiceGrpc.getGetPolicyMethod = getGetPolicyMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.storage.PolicyOuterClass.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "GetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.PolicyOuterClass.Policy.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("GetPolicy"))
                  .build();
          }
        }
     }
     return getGetPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse> getListPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPolicies",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.class,
      responseType = io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
      io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse> getListPoliciesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse> getListPoliciesMethod;
    if ((getListPoliciesMethod = PolicyServiceGrpc.getListPoliciesMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getListPoliciesMethod = PolicyServiceGrpc.getListPoliciesMethod) == null) {
          PolicyServiceGrpc.getListPoliciesMethod = getListPoliciesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery, io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "ListPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("ListPolicies"))
                  .build();
          }
        }
     }
     return getListPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.PolicyOuterClass.Policy,
      io.stackrox.proto.storage.PolicyOuterClass.Policy> getPostPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostPolicy",
      requestType = io.stackrox.proto.storage.PolicyOuterClass.Policy.class,
      responseType = io.stackrox.proto.storage.PolicyOuterClass.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.PolicyOuterClass.Policy,
      io.stackrox.proto.storage.PolicyOuterClass.Policy> getPostPolicyMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.PolicyOuterClass.Policy, io.stackrox.proto.storage.PolicyOuterClass.Policy> getPostPolicyMethod;
    if ((getPostPolicyMethod = PolicyServiceGrpc.getPostPolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getPostPolicyMethod = PolicyServiceGrpc.getPostPolicyMethod) == null) {
          PolicyServiceGrpc.getPostPolicyMethod = getPostPolicyMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.PolicyOuterClass.Policy, io.stackrox.proto.storage.PolicyOuterClass.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "PostPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.PolicyOuterClass.Policy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.PolicyOuterClass.Policy.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("PostPolicy"))
                  .build();
          }
        }
     }
     return getPostPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.PolicyOuterClass.Policy,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPutPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutPolicy",
      requestType = io.stackrox.proto.storage.PolicyOuterClass.Policy.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.PolicyOuterClass.Policy,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPutPolicyMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.PolicyOuterClass.Policy, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPutPolicyMethod;
    if ((getPutPolicyMethod = PolicyServiceGrpc.getPutPolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getPutPolicyMethod = PolicyServiceGrpc.getPutPolicyMethod) == null) {
          PolicyServiceGrpc.getPutPolicyMethod = getPutPolicyMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.PolicyOuterClass.Policy, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "PutPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.PolicyOuterClass.Policy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("PutPolicy"))
                  .build();
          }
        }
     }
     return getPutPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPatchPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchPolicy",
      requestType = io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPatchPolicyMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getPatchPolicyMethod;
    if ((getPatchPolicyMethod = PolicyServiceGrpc.getPatchPolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getPatchPolicyMethod = PolicyServiceGrpc.getPatchPolicyMethod) == null) {
          PolicyServiceGrpc.getPatchPolicyMethod = getPatchPolicyMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "PatchPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("PatchPolicy"))
                  .build();
          }
        }
     }
     return getPatchPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeletePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePolicy",
      requestType = io.stackrox.proto.api.v1.Common.ResourceByID.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeletePolicyMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeletePolicyMethod;
    if ((getDeletePolicyMethod = PolicyServiceGrpc.getDeletePolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getDeletePolicyMethod = PolicyServiceGrpc.getDeletePolicyMethod) == null) {
          PolicyServiceGrpc.getDeletePolicyMethod = getDeletePolicyMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.Common.ResourceByID, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "DeletePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.Common.ResourceByID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("DeletePolicy"))
                  .build();
          }
        }
     }
     return getDeletePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getEnableDisablePolicyNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableDisablePolicyNotification",
      requestType = io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getEnableDisablePolicyNotificationMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getEnableDisablePolicyNotificationMethod;
    if ((getEnableDisablePolicyNotificationMethod = PolicyServiceGrpc.getEnableDisablePolicyNotificationMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getEnableDisablePolicyNotificationMethod = PolicyServiceGrpc.getEnableDisablePolicyNotificationMethod) == null) {
          PolicyServiceGrpc.getEnableDisablePolicyNotificationMethod = getEnableDisablePolicyNotificationMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "EnableDisablePolicyNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("EnableDisablePolicyNotification"))
                  .build();
          }
        }
     }
     return getEnableDisablePolicyNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getReassessPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReassessPolicies",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getReassessPoliciesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getReassessPoliciesMethod;
    if ((getReassessPoliciesMethod = PolicyServiceGrpc.getReassessPoliciesMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getReassessPoliciesMethod = PolicyServiceGrpc.getReassessPoliciesMethod) == null) {
          PolicyServiceGrpc.getReassessPoliciesMethod = getReassessPoliciesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "ReassessPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("ReassessPolicies"))
                  .build();
          }
        }
     }
     return getReassessPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.storage.PolicyOuterClass.Policy,
      io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse> getDryRunPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DryRunPolicy",
      requestType = io.stackrox.proto.storage.PolicyOuterClass.Policy.class,
      responseType = io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.storage.PolicyOuterClass.Policy,
      io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse> getDryRunPolicyMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.storage.PolicyOuterClass.Policy, io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse> getDryRunPolicyMethod;
    if ((getDryRunPolicyMethod = PolicyServiceGrpc.getDryRunPolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getDryRunPolicyMethod = PolicyServiceGrpc.getDryRunPolicyMethod) == null) {
          PolicyServiceGrpc.getDryRunPolicyMethod = getDryRunPolicyMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.storage.PolicyOuterClass.Policy, io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "DryRunPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.storage.PolicyOuterClass.Policy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("DryRunPolicy"))
                  .build();
          }
        }
     }
     return getDryRunPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse> getGetPolicyCategoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPolicyCategories",
      requestType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      responseType = io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
      io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse> getGetPolicyCategoriesMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse> getGetPolicyCategoriesMethod;
    if ((getGetPolicyCategoriesMethod = PolicyServiceGrpc.getGetPolicyCategoriesMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getGetPolicyCategoriesMethod = PolicyServiceGrpc.getGetPolicyCategoriesMethod) == null) {
          PolicyServiceGrpc.getGetPolicyCategoriesMethod = getGetPolicyCategoriesMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.EmptyOuterClass.Empty, io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "GetPolicyCategories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("GetPolicyCategories"))
                  .build();
          }
        }
     }
     return getGetPolicyCategoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getRenamePolicyCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenamePolicyCategory",
      requestType = io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getRenamePolicyCategoryMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getRenamePolicyCategoryMethod;
    if ((getRenamePolicyCategoryMethod = PolicyServiceGrpc.getRenamePolicyCategoryMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getRenamePolicyCategoryMethod = PolicyServiceGrpc.getRenamePolicyCategoryMethod) == null) {
          PolicyServiceGrpc.getRenamePolicyCategoryMethod = getRenamePolicyCategoryMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "RenamePolicyCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("RenamePolicyCategory"))
                  .build();
          }
        }
     }
     return getRenamePolicyCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeletePolicyCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePolicyCategory",
      requestType = io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest.class,
      responseType = io.stackrox.proto.api.v1.EmptyOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest,
      io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeletePolicyCategoryMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty> getDeletePolicyCategoryMethod;
    if ((getDeletePolicyCategoryMethod = PolicyServiceGrpc.getDeletePolicyCategoryMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getDeletePolicyCategoryMethod = PolicyServiceGrpc.getDeletePolicyCategoryMethod) == null) {
          PolicyServiceGrpc.getDeletePolicyCategoryMethod = getDeletePolicyCategoryMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest, io.stackrox.proto.api.v1.EmptyOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.PolicyService", "DeletePolicyCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.EmptyOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("DeletePolicyCategory"))
                  .build();
          }
        }
     }
     return getDeletePolicyCategoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PolicyServiceStub newStub(io.grpc.Channel channel) {
    return new PolicyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PolicyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PolicyServiceFutureStub(channel);
  }

  /**
   * <pre>
   * PolicyService APIs can be used to manage policies.
   * </pre>
   */
  public static abstract class PolicyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetPolicy returns the requested policy by ID.
     * </pre>
     */
    public void getPolicy(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.PolicyOuterClass.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListPolicies returns the list of policies.
     * </pre>
     */
    public void listPolicies(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * PostPolicy creates a new policy.
     * </pre>
     */
    public void postPolicy(io.stackrox.proto.storage.PolicyOuterClass.Policy request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.PolicyOuterClass.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(getPostPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * PutPolicy modifies an existing policy.
     * </pre>
     */
    public void putPolicy(io.stackrox.proto.storage.PolicyOuterClass.Policy request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPutPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * PatchPolicy edits an existing policy.
     * </pre>
     */
    public void patchPolicy(io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeletePolicy removes a policy by ID.
     * </pre>
     */
    public void deletePolicy(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * EnableDisablePolicyNotification enables or disables notifications for a policy by ID.
     * </pre>
     */
    public void enableDisablePolicyNotification(io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEnableDisablePolicyNotificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReassessPolicies reevaluates all the policies.
     * </pre>
     */
    public void reassessPolicies(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getReassessPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DryRunPolicy evaluates the given policy and returns any alerts without creating the policy.
     * </pre>
     */
    public void dryRunPolicy(io.stackrox.proto.storage.PolicyOuterClass.Policy request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDryRunPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPolicyCategories returns the policy categories.
     * </pre>
     */
    public void getPolicyCategories(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPolicyCategoriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RenamePolicyCategory renames the given policy category.
     * </pre>
     */
    public void renamePolicyCategory(io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRenamePolicyCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeletePolicyCategory removes the given policy category.
     * </pre>
     */
    public void deletePolicyCategory(io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePolicyCategoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.storage.PolicyOuterClass.Policy>(
                  this, METHODID_GET_POLICY)))
          .addMethod(
            getListPoliciesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery,
                io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse>(
                  this, METHODID_LIST_POLICIES)))
          .addMethod(
            getPostPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.PolicyOuterClass.Policy,
                io.stackrox.proto.storage.PolicyOuterClass.Policy>(
                  this, METHODID_POST_POLICY)))
          .addMethod(
            getPutPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.PolicyOuterClass.Policy,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_PUT_POLICY)))
          .addMethod(
            getPatchPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_PATCH_POLICY)))
          .addMethod(
            getDeletePolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.Common.ResourceByID,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DELETE_POLICY)))
          .addMethod(
            getEnableDisablePolicyNotificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_ENABLE_DISABLE_POLICY_NOTIFICATION)))
          .addMethod(
            getReassessPoliciesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_REASSESS_POLICIES)))
          .addMethod(
            getDryRunPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.storage.PolicyOuterClass.Policy,
                io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse>(
                  this, METHODID_DRY_RUN_POLICY)))
          .addMethod(
            getGetPolicyCategoriesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty,
                io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse>(
                  this, METHODID_GET_POLICY_CATEGORIES)))
          .addMethod(
            getRenamePolicyCategoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_RENAME_POLICY_CATEGORY)))
          .addMethod(
            getDeletePolicyCategoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest,
                io.stackrox.proto.api.v1.EmptyOuterClass.Empty>(
                  this, METHODID_DELETE_POLICY_CATEGORY)))
          .build();
    }
  }

  /**
   * <pre>
   * PolicyService APIs can be used to manage policies.
   * </pre>
   */
  public static final class PolicyServiceStub extends io.grpc.stub.AbstractStub<PolicyServiceStub> {
    private PolicyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPolicy returns the requested policy by ID.
     * </pre>
     */
    public void getPolicy(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.PolicyOuterClass.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListPolicies returns the list of policies.
     * </pre>
     */
    public void listPolicies(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PostPolicy creates a new policy.
     * </pre>
     */
    public void postPolicy(io.stackrox.proto.storage.PolicyOuterClass.Policy request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.storage.PolicyOuterClass.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PutPolicy modifies an existing policy.
     * </pre>
     */
    public void putPolicy(io.stackrox.proto.storage.PolicyOuterClass.Policy request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PatchPolicy edits an existing policy.
     * </pre>
     */
    public void patchPolicy(io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeletePolicy removes a policy by ID.
     * </pre>
     */
    public void deletePolicy(io.stackrox.proto.api.v1.Common.ResourceByID request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EnableDisablePolicyNotification enables or disables notifications for a policy by ID.
     * </pre>
     */
    public void enableDisablePolicyNotification(io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnableDisablePolicyNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReassessPolicies reevaluates all the policies.
     * </pre>
     */
    public void reassessPolicies(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReassessPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DryRunPolicy evaluates the given policy and returns any alerts without creating the policy.
     * </pre>
     */
    public void dryRunPolicy(io.stackrox.proto.storage.PolicyOuterClass.Policy request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDryRunPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPolicyCategories returns the policy categories.
     * </pre>
     */
    public void getPolicyCategories(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPolicyCategoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RenamePolicyCategory renames the given policy category.
     * </pre>
     */
    public void renamePolicyCategory(io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRenamePolicyCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeletePolicyCategory removes the given policy category.
     * </pre>
     */
    public void deletePolicyCategory(io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePolicyCategoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * PolicyService APIs can be used to manage policies.
   * </pre>
   */
  public static final class PolicyServiceBlockingStub extends io.grpc.stub.AbstractStub<PolicyServiceBlockingStub> {
    private PolicyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPolicy returns the requested policy by ID.
     * </pre>
     */
    public io.stackrox.proto.storage.PolicyOuterClass.Policy getPolicy(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListPolicies returns the list of policies.
     * </pre>
     */
    public io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse listPolicies(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return blockingUnaryCall(
          getChannel(), getListPoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PostPolicy creates a new policy.
     * </pre>
     */
    public io.stackrox.proto.storage.PolicyOuterClass.Policy postPolicy(io.stackrox.proto.storage.PolicyOuterClass.Policy request) {
      return blockingUnaryCall(
          getChannel(), getPostPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PutPolicy modifies an existing policy.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty putPolicy(io.stackrox.proto.storage.PolicyOuterClass.Policy request) {
      return blockingUnaryCall(
          getChannel(), getPutPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PatchPolicy edits an existing policy.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty patchPolicy(io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeletePolicy removes a policy by ID.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty deletePolicy(io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return blockingUnaryCall(
          getChannel(), getDeletePolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EnableDisablePolicyNotification enables or disables notifications for a policy by ID.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty enableDisablePolicyNotification(io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest request) {
      return blockingUnaryCall(
          getChannel(), getEnableDisablePolicyNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReassessPolicies reevaluates all the policies.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty reassessPolicies(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getReassessPoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DryRunPolicy evaluates the given policy and returns any alerts without creating the policy.
     * </pre>
     */
    public io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse dryRunPolicy(io.stackrox.proto.storage.PolicyOuterClass.Policy request) {
      return blockingUnaryCall(
          getChannel(), getDryRunPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPolicyCategories returns the policy categories.
     * </pre>
     */
    public io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse getPolicyCategories(io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetPolicyCategoriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RenamePolicyCategory renames the given policy category.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty renamePolicyCategory(io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getRenamePolicyCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeletePolicyCategory removes the given policy category.
     * </pre>
     */
    public io.stackrox.proto.api.v1.EmptyOuterClass.Empty deletePolicyCategory(io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePolicyCategoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * PolicyService APIs can be used to manage policies.
   * </pre>
   */
  public static final class PolicyServiceFutureStub extends io.grpc.stub.AbstractStub<PolicyServiceFutureStub> {
    private PolicyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPolicy returns the requested policy by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.PolicyOuterClass.Policy> getPolicy(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListPolicies returns the list of policies.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse> listPolicies(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getListPoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PostPolicy creates a new policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.storage.PolicyOuterClass.Policy> postPolicy(
        io.stackrox.proto.storage.PolicyOuterClass.Policy request) {
      return futureUnaryCall(
          getChannel().newCall(getPostPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PutPolicy modifies an existing policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> putPolicy(
        io.stackrox.proto.storage.PolicyOuterClass.Policy request) {
      return futureUnaryCall(
          getChannel().newCall(getPutPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PatchPolicy edits an existing policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> patchPolicy(
        io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeletePolicy removes a policy by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> deletePolicy(
        io.stackrox.proto.api.v1.Common.ResourceByID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EnableDisablePolicyNotification enables or disables notifications for a policy by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> enableDisablePolicyNotification(
        io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEnableDisablePolicyNotificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReassessPolicies reevaluates all the policies.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> reassessPolicies(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getReassessPoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DryRunPolicy evaluates the given policy and returns any alerts without creating the policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse> dryRunPolicy(
        io.stackrox.proto.storage.PolicyOuterClass.Policy request) {
      return futureUnaryCall(
          getChannel().newCall(getDryRunPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPolicyCategories returns the policy categories.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse> getPolicyCategories(
        io.stackrox.proto.api.v1.EmptyOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPolicyCategoriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RenamePolicyCategory renames the given policy category.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> renamePolicyCategory(
        io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRenamePolicyCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeletePolicyCategory removes the given policy category.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.EmptyOuterClass.Empty> deletePolicyCategory(
        io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePolicyCategoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POLICY = 0;
  private static final int METHODID_LIST_POLICIES = 1;
  private static final int METHODID_POST_POLICY = 2;
  private static final int METHODID_PUT_POLICY = 3;
  private static final int METHODID_PATCH_POLICY = 4;
  private static final int METHODID_DELETE_POLICY = 5;
  private static final int METHODID_ENABLE_DISABLE_POLICY_NOTIFICATION = 6;
  private static final int METHODID_REASSESS_POLICIES = 7;
  private static final int METHODID_DRY_RUN_POLICY = 8;
  private static final int METHODID_GET_POLICY_CATEGORIES = 9;
  private static final int METHODID_RENAME_POLICY_CATEGORY = 10;
  private static final int METHODID_DELETE_POLICY_CATEGORY = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POLICY:
          serviceImpl.getPolicy((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.PolicyOuterClass.Policy>) responseObserver);
          break;
        case METHODID_LIST_POLICIES:
          serviceImpl.listPolicies((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.PolicyServiceOuterClass.ListPoliciesResponse>) responseObserver);
          break;
        case METHODID_POST_POLICY:
          serviceImpl.postPolicy((io.stackrox.proto.storage.PolicyOuterClass.Policy) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.storage.PolicyOuterClass.Policy>) responseObserver);
          break;
        case METHODID_PUT_POLICY:
          serviceImpl.putPolicy((io.stackrox.proto.storage.PolicyOuterClass.Policy) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_PATCH_POLICY:
          serviceImpl.patchPolicy((io.stackrox.proto.api.v1.PolicyServiceOuterClass.PatchPolicyRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_DELETE_POLICY:
          serviceImpl.deletePolicy((io.stackrox.proto.api.v1.Common.ResourceByID) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_ENABLE_DISABLE_POLICY_NOTIFICATION:
          serviceImpl.enableDisablePolicyNotification((io.stackrox.proto.api.v1.PolicyServiceOuterClass.EnableDisablePolicyNotificationRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_REASSESS_POLICIES:
          serviceImpl.reassessPolicies((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_DRY_RUN_POLICY:
          serviceImpl.dryRunPolicy((io.stackrox.proto.storage.PolicyOuterClass.Policy) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.PolicyServiceOuterClass.DryRunResponse>) responseObserver);
          break;
        case METHODID_GET_POLICY_CATEGORIES:
          serviceImpl.getPolicyCategories((io.stackrox.proto.api.v1.EmptyOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.PolicyServiceOuterClass.PolicyCategoriesResponse>) responseObserver);
          break;
        case METHODID_RENAME_POLICY_CATEGORY:
          serviceImpl.renamePolicyCategory((io.stackrox.proto.api.v1.PolicyServiceOuterClass.RenamePolicyCategoryRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
          break;
        case METHODID_DELETE_POLICY_CATEGORY:
          serviceImpl.deletePolicyCategory((io.stackrox.proto.api.v1.PolicyServiceOuterClass.DeletePolicyCategoryRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.EmptyOuterClass.Empty>) responseObserver);
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

  private static abstract class PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PolicyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.PolicyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PolicyService");
    }
  }

  private static final class PolicyServiceFileDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier {
    PolicyServiceFileDescriptorSupplier() {}
  }

  private static final class PolicyServiceMethodDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PolicyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PolicyServiceFileDescriptorSupplier())
              .addMethod(getGetPolicyMethod())
              .addMethod(getListPoliciesMethod())
              .addMethod(getPostPolicyMethod())
              .addMethod(getPutPolicyMethod())
              .addMethod(getPatchPolicyMethod())
              .addMethod(getDeletePolicyMethod())
              .addMethod(getEnableDisablePolicyNotificationMethod())
              .addMethod(getReassessPoliciesMethod())
              .addMethod(getDryRunPolicyMethod())
              .addMethod(getGetPolicyCategoriesMethod())
              .addMethod(getRenamePolicyCategoryMethod())
              .addMethod(getDeletePolicyCategoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
