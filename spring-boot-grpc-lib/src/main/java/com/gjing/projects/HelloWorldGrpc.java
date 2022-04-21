package com.gjing.projects;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: hello.proto")
public final class HelloWorldGrpc {

  private HelloWorldGrpc() {}

  public static final String SERVICE_NAME = "com.gjing.projects.HelloWorld";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.gjing.projects.Hello.ReqMsg,
      com.gjing.projects.Hello.RespMsg> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hello",
      requestType = com.gjing.projects.Hello.ReqMsg.class,
      responseType = com.gjing.projects.Hello.RespMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gjing.projects.Hello.ReqMsg,
      com.gjing.projects.Hello.RespMsg> getHelloMethod() {
    io.grpc.MethodDescriptor<com.gjing.projects.Hello.ReqMsg, com.gjing.projects.Hello.RespMsg> getHelloMethod;
    if ((getHelloMethod = HelloWorldGrpc.getHelloMethod) == null) {
      synchronized (HelloWorldGrpc.class) {
        if ((getHelloMethod = HelloWorldGrpc.getHelloMethod) == null) {
          HelloWorldGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<com.gjing.projects.Hello.ReqMsg, com.gjing.projects.Hello.RespMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gjing.projects.Hello.ReqMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gjing.projects.Hello.RespMsg.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldMethodDescriptorSupplier("Hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloWorldStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldStub>() {
        @java.lang.Override
        public HelloWorldStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldStub(channel, callOptions);
        }
      };
    return HelloWorldStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloWorldBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldBlockingStub>() {
        @java.lang.Override
        public HelloWorldBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldBlockingStub(channel, callOptions);
        }
      };
    return HelloWorldBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloWorldFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldFutureStub>() {
        @java.lang.Override
        public HelloWorldFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldFutureStub(channel, callOptions);
        }
      };
    return HelloWorldFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HelloWorldImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(com.gjing.projects.Hello.ReqMsg request,
        io.grpc.stub.StreamObserver<com.gjing.projects.Hello.RespMsg> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.gjing.projects.Hello.ReqMsg,
                com.gjing.projects.Hello.RespMsg>(
                  this, METHODID_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class HelloWorldStub extends io.grpc.stub.AbstractAsyncStub<HelloWorldStub> {
    private HelloWorldStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldStub(channel, callOptions);
    }

    /**
     */
    public void hello(com.gjing.projects.Hello.ReqMsg request,
        io.grpc.stub.StreamObserver<com.gjing.projects.Hello.RespMsg> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloWorldBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloWorldBlockingStub> {
    private HelloWorldBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gjing.projects.Hello.RespMsg hello(com.gjing.projects.Hello.ReqMsg request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloWorldFutureStub extends io.grpc.stub.AbstractFutureStub<HelloWorldFutureStub> {
    private HelloWorldFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gjing.projects.Hello.RespMsg> hello(
        com.gjing.projects.Hello.ReqMsg request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloWorldImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloWorldImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.gjing.projects.Hello.ReqMsg) request,
              (io.grpc.stub.StreamObserver<com.gjing.projects.Hello.RespMsg>) responseObserver);
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

  private static abstract class HelloWorldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloWorldBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.gjing.projects.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloWorld");
    }
  }

  private static final class HelloWorldFileDescriptorSupplier
      extends HelloWorldBaseDescriptorSupplier {
    HelloWorldFileDescriptorSupplier() {}
  }

  private static final class HelloWorldMethodDescriptorSupplier
      extends HelloWorldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloWorldMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloWorldGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloWorldFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
