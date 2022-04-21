package com.gjing.projects.controller;

import com.gjing.projects.service.GrpcClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gjing
 **/
@RestController
@RequiredArgsConstructor
public class TestController {
    private final GrpcClientService grpcClientService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello(String name) {
        String s = grpcClientService.sendMessage(name);
        return ResponseEntity.ok(s);
    }
}
