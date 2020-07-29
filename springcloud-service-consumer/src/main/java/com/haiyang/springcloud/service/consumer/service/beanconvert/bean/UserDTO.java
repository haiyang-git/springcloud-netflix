package com.haiyang.springcloud.service.consumer.service.beanconvert.bean;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private String name;
    private List<String> friend;
    private HobbyDTO hobby;
    private String noteMessage;

    @Data
    public static  class HobbyDTO {
        private String hob1;
    }

}
