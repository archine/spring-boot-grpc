package com.gjing.projects.service;

import com.gjing.projects.Hello;
import com.gjing.projects.HelloWorldGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author Gjing
 **/
@GrpcService
public class GrpcServerService extends HelloWorldGrpc.HelloWorldImplBase {
    @Override
    public void hello(Hello.ReqMsg request, StreamObserver<Hello.RespMsg> responseObserver) {
        Hello.RespMsg msg = Hello.RespMsg.newBuilder().setMsg("hello: " + request.getName()).build();
        responseObserver.onNext(msg);
        responseObserver.onCompleted();
    }
}
