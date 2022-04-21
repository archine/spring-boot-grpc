package com.gjing.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Gjing
 **/
@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
        var s = SpringApplication.run(ServerApplication.class, args);
    }
}
