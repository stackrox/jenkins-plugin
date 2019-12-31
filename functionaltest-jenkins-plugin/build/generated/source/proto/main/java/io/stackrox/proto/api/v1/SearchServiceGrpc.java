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
    comments = "Source: api/v1/search_service.proto")
public final class SearchServiceGrpc {

  private SearchServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.SearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest,
      io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest.class,
      responseType = io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest,
      io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest, io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse> getSearchMethod;
    if ((getSearchMethod = SearchServiceGrpc.getSearchMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchMethod = SearchServiceGrpc.getSearchMethod) == null) {
          SearchServiceGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest, io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.SearchService", "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("Search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest,
      io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse> getOptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Options",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest.class,
      responseType = io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest,
      io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse> getOptionsMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest, io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse> getOptionsMethod;
    if ((getOptionsMethod = SearchServiceGrpc.getOptionsMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getOptionsMethod = SearchServiceGrpc.getOptionsMethod) == null) {
          SearchServiceGrpc.getOptionsMethod = getOptionsMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest, io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.SearchService", "Options"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("Options"))
                  .build();
          }
        }
     }
     return getOptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest,
      io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse> getAutocompleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Autocomplete",
      requestType = io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest.class,
      responseType = io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest,
      io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse> getAutocompleteMethod() {
    io.grpc.MethodDescriptor<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest, io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse> getAutocompleteMethod;
    if ((getAutocompleteMethod = SearchServiceGrpc.getAutocompleteMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getAutocompleteMethod = SearchServiceGrpc.getAutocompleteMethod) == null) {
          SearchServiceGrpc.getAutocompleteMethod = getAutocompleteMethod = 
              io.grpc.MethodDescriptor.<io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest, io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.SearchService", "Autocomplete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("Autocomplete"))
                  .build();
          }
        }
     }
     return getAutocompleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchServiceStub newStub(io.grpc.Channel channel) {
    return new SearchServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SearchServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SearchServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void options(io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOptionsMethod(), responseObserver);
    }

    /**
     */
    public void autocomplete(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAutocompleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest,
                io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getOptionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest,
                io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse>(
                  this, METHODID_OPTIONS)))
          .addMethod(
            getAutocompleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest,
                io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse>(
                  this, METHODID_AUTOCOMPLETE)))
          .build();
    }
  }

  /**
   */
  public static final class SearchServiceStub extends io.grpc.stub.AbstractStub<SearchServiceStub> {
    private SearchServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void search(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void options(io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void autocomplete(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest request,
        io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAutocompleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchServiceBlockingStub extends io.grpc.stub.AbstractStub<SearchServiceBlockingStub> {
    private SearchServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse search(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse options(io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getOptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse autocomplete(io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getAutocompleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchServiceFutureStub extends io.grpc.stub.AbstractStub<SearchServiceFutureStub> {
    private SearchServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse> search(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse> options(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOptionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse> autocomplete(
        io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAutocompleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_OPTIONS = 1;
  private static final int METHODID_AUTOCOMPLETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchResponse>) responseObserver);
          break;
        case METHODID_OPTIONS:
          serviceImpl.options((io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SearchServiceOuterClass.SearchOptionsResponse>) responseObserver);
          break;
        case METHODID_AUTOCOMPLETE:
          serviceImpl.autocomplete((io.stackrox.proto.api.v1.SearchServiceOuterClass.RawSearchRequest) request,
              (io.grpc.stub.StreamObserver<io.stackrox.proto.api.v1.SearchServiceOuterClass.AutocompleteResponse>) responseObserver);
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

  private static abstract class SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.stackrox.proto.api.v1.SearchServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchService");
    }
  }

  private static final class SearchServiceFileDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier {
    SearchServiceFileDescriptorSupplier() {}
  }

  private static final class SearchServiceMethodDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchServiceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getOptionsMethod())
              .addMethod(getAutocompleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
