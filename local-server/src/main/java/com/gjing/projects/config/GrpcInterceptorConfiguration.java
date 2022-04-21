package com.gjing.projects.config;

import com.gjing.projects.config.grpc.LogGrpcInterceptor;
import io.grpc.ServerInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Configuration;

/**
 * @author Gjing
 **/
@Configuration(proxyBeanMethods = false)
public class GrpcInterceptorConfiguration {
    @GrpcGlobalServerInterceptor
    ServerInterceptor logInterceptor() {
        return new LogGrpcInterceptor();
    }
}
