package com.haiyang.springcloud.service.consumer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceConsumerAppliaction {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerAppliaction.class);
        System.out.println("service consumer server start");
    }
}
