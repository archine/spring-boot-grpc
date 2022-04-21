package com.gjing.projects.service;

import com.gjing.projects.Hello;
import com.gjing.projects.HelloWorldGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @author Gjing
 **/
@Service
public class GrpcClientService {
    @GrpcClient("local-grpc-server")
    private HelloWorldGrpc.HelloWorldBlockingStub helloWorldBlockingStub;

    public String sendMessage(final String name) {
        try {
            final Hello.RespMsg response = this.helloWorldBlockingStub.hello(Hello.ReqMsg.newBuilder().setName(name).build());
            return response.getMsg();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }
}
