package com.haiyang.springcloud.service.provider.controller;

import com.haiyang.springcloud.service.provider.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    IHelloService service;

    @GetMapping("/sayHello/{name}")
    public String say(@PathVariable("name") String name) {
        return service.sayHello(name);
    }
}
