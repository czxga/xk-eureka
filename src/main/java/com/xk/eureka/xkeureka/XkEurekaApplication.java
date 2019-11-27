package com.xk.eureka.xkeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class XkEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(XkEurekaApplication.class, args);
    }

}
