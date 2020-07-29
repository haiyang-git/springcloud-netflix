package com.haiyang.springcloud.service.provider.feign;

import com.haiyang.springcloud.service.provider.fallBack.FallBackService;
import com.haiyang.springcloud.service.provider.service.IHelloService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-provider",fallback = FallBackService.class)
public interface ServiceFeignClient extends IHelloService {

}
