package com.gjing.projects.config;

import io.grpc.ClientInterceptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import org.springframework.context.annotation.Configuration;

/**
 * @author Gjing
 **/
@Configuration(proxyBeanMethods = false)
public class GrpcConfiguration {
    @GrpcGlobalClientInterceptor
    ClientInterceptor logClientInterceptor() {
        return new LogGrpcInterceptor();
    }
}
