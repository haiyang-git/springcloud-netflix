package com.haiyang.springcloud.service.consumer.contrller;

import com.alibaba.fastjson.JSONObject;
import com.haiyang.springcloud.service.consumer.service.beanconvert.bean.User;
import com.haiyang.springcloud.service.consumer.service.beanconvert.bean.UserDTO;
import com.haiyang.springcloud.service.consumer.service.beanconvert.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;

@RestController
public class ConvertController {

    @GetMapping("/get")
    public String get(){
        return "get";
    }

    @Resource
    private UserMapper userMapper;

    @GetMapping("user")
    public String user(){
        User user = new User();
        user.setName("zhangsan");
        user.setNote("notes");
        user.setFriend(Arrays.asList("xiaoming","xiaohong"));
        User.Hobby hobby = new User.Hobby();
        hobby.setHob1("ho1");
        user.setHobby(hobby);
        UserDTO userDTO1 = userMapper.user2UserDTO(user);
        return JSONObject.toJSONString(userDTO1);
    }
}
