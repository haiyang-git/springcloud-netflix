package com.haiyang.springcloud.netflix.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication

public class NetflixEureKaServerApplication {
    public static void main(String[] args) {
       SpringApplication.run(NetflixEureKaServerApplication.class);

        System.out.println("eureka server start");
    }

}
