package com.haiyang.springcloud.service.provider.fallBack;

import com.haiyang.springcloud.service.provider.service.IHelloService;
import org.springframework.stereotype.Component;

@Component
public class FallBackService implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "fall back";
    }
}
