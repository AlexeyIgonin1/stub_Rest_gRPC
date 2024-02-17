package com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio;

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
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: methodSearchByF.proto")
public final class AbcPrivateBankingChatxSearchGatewayServiceGrpc {

  private AbcPrivateBankingChatxSearchGatewayServiceGrpc() {}

  public static final String SERVICE_NAME = "AbcPrivateBankingChatxSearchGatewayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest,
      com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse> getSearchByFMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchByF",
      requestType = com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest.class,
      responseType = com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest,
      com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse> getSearchByFMethod() {
    io.grpc.MethodDescriptor<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse> getSearchByFMethod;
    if ((getSearchByFMethod = AbcPrivateBankingChatxSearchGatewayServiceGrpc.getSearchByFMethod) == null) {
      synchronized (AbcPrivateBankingChatxSearchGatewayServiceGrpc.class) {
        if ((getSearchByFMethod = AbcPrivateBankingChatxSearchGatewayServiceGrpc.getSearchByFMethod) == null) {
          AbcPrivateBankingChatxSearchGatewayServiceGrpc.getSearchByFMethod = getSearchByFMethod =
              io.grpc.MethodDescriptor.<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchByF"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AbcPrivateBankingChatxSearchGatewayServiceMethodDescriptorSupplier("SearchByF"))
              .build();
        }
      }
    }
    return getSearchByFMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest,
      com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse> getSearchByFioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchByFio",
      requestType = com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest.class,
      responseType = com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest,
      com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse> getSearchByFioMethod() {
    io.grpc.MethodDescriptor<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse> getSearchByFioMethod;
    if ((getSearchByFioMethod = AbcPrivateBankingChatxSearchGatewayServiceGrpc.getSearchByFioMethod) == null) {
      synchronized (AbcPrivateBankingChatxSearchGatewayServiceGrpc.class) {
        if ((getSearchByFioMethod = AbcPrivateBankingChatxSearchGatewayServiceGrpc.getSearchByFioMethod) == null) {
          AbcPrivateBankingChatxSearchGatewayServiceGrpc.getSearchByFioMethod = getSearchByFioMethod =
              io.grpc.MethodDescriptor.<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest, com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchByFio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AbcPrivateBankingChatxSearchGatewayServiceMethodDescriptorSupplier("SearchByFio"))
              .build();
        }
      }
    }
    return getSearchByFioMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AbcPrivateBankingChatxSearchGatewayServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AbcPrivateBankingChatxSearchGatewayServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AbcPrivateBankingChatxSearchGatewayServiceStub>() {
        @java.lang.Override
        public AbcPrivateBankingChatxSearchGatewayServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AbcPrivateBankingChatxSearchGatewayServiceStub(channel, callOptions);
        }
      };
    return AbcPrivateBankingChatxSearchGatewayServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AbcPrivateBankingChatxSearchGatewayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AbcPrivateBankingChatxSearchGatewayServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AbcPrivateBankingChatxSearchGatewayServiceBlockingStub>() {
        @java.lang.Override
        public AbcPrivateBankingChatxSearchGatewayServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AbcPrivateBankingChatxSearchGatewayServiceBlockingStub(channel, callOptions);
        }
      };
    return AbcPrivateBankingChatxSearchGatewayServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AbcPrivateBankingChatxSearchGatewayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AbcPrivateBankingChatxSearchGatewayServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AbcPrivateBankingChatxSearchGatewayServiceFutureStub>() {
        @java.lang.Override
        public AbcPrivateBankingChatxSearchGatewayServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AbcPrivateBankingChatxSearchGatewayServiceFutureStub(channel, callOptions);
        }
      };
    return AbcPrivateBankingChatxSearchGatewayServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AbcPrivateBankingChatxSearchGatewayServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchByF(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest request,
        io.grpc.stub.StreamObserver<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByFMethod(), responseObserver);
    }

    /**
     */
    public void searchByFio(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest request,
        io.grpc.stub.StreamObserver<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByFioMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchByFMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest,
                com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse>(
                  this, METHODID_SEARCH_BY_F)))
          .addMethod(
            getSearchByFioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest,
                com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse>(
                  this, METHODID_SEARCH_BY_FIO)))
          .build();
    }
  }

  /**
   */
  public static final class AbcPrivateBankingChatxSearchGatewayServiceStub extends io.grpc.stub.AbstractAsyncStub<AbcPrivateBankingChatxSearchGatewayServiceStub> {
    private AbcPrivateBankingChatxSearchGatewayServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AbcPrivateBankingChatxSearchGatewayServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AbcPrivateBankingChatxSearchGatewayServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchByF(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest request,
        io.grpc.stub.StreamObserver<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchByFMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByFio(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest request,
        io.grpc.stub.StreamObserver<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchByFioMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AbcPrivateBankingChatxSearchGatewayServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AbcPrivateBankingChatxSearchGatewayServiceBlockingStub> {
    private AbcPrivateBankingChatxSearchGatewayServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AbcPrivateBankingChatxSearchGatewayServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AbcPrivateBankingChatxSearchGatewayServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse searchByF(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchByFMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse searchByFio(com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchByFioMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AbcPrivateBankingChatxSearchGatewayServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AbcPrivateBankingChatxSearchGatewayServiceFutureStub> {
    private AbcPrivateBankingChatxSearchGatewayServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AbcPrivateBankingChatxSearchGatewayServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AbcPrivateBankingChatxSearchGatewayServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse> searchByF(
        com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchByFMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse> searchByFio(
        com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchByFioMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_BY_F = 0;
  private static final int METHODID_SEARCH_BY_FIO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AbcPrivateBankingChatxSearchGatewayServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AbcPrivateBankingChatxSearchGatewayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_BY_F:
          serviceImpl.searchByF((com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFRequest) request,
              (io.grpc.stub.StreamObserver<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BY_FIO:
          serviceImpl.searchByFio((com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioRequest) request,
              (io.grpc.stub.StreamObserver<com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.IndividualByFioResponse>) responseObserver);
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

  private static abstract class AbcPrivateBankingChatxSearchGatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AbcPrivateBankingChatxSearchGatewayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.MethodSearchByF.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AbcPrivateBankingChatxSearchGatewayService");
    }
  }

  private static final class AbcPrivateBankingChatxSearchGatewayServiceFileDescriptorSupplier
      extends AbcPrivateBankingChatxSearchGatewayServiceBaseDescriptorSupplier {
    AbcPrivateBankingChatxSearchGatewayServiceFileDescriptorSupplier() {}
  }

  private static final class AbcPrivateBankingChatxSearchGatewayServiceMethodDescriptorSupplier
      extends AbcPrivateBankingChatxSearchGatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AbcPrivateBankingChatxSearchGatewayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AbcPrivateBankingChatxSearchGatewayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AbcPrivateBankingChatxSearchGatewayServiceFileDescriptorSupplier())
              .addMethod(getSearchByFMethod())
              .addMethod(getSearchByFioMethod())
              .build();
        }
      }
    }
    return result;
  }
}
