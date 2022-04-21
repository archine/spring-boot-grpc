package com.gjing.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Gjing
 **/
@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) {
        var run = SpringApplication.run(ClientApplication.class, args);
    }
}
