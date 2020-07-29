package com.haiyang.springcloud.service.provider.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {


    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }
}
