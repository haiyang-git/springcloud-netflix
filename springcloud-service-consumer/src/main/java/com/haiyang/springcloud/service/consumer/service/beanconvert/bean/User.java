package com.haiyang.springcloud.service.consumer.service.beanconvert.bean;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String name;
    private List<String> friend;
    private Hobby hobby;
    private String note;

    @Data
    public static class Hobby {
        private String hob1;
    }

}
