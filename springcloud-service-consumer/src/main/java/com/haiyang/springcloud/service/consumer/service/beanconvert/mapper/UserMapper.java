package com.haiyang.springcloud.service.consumer.service.beanconvert.mapper;


import com.haiyang.springcloud.service.consumer.service.beanconvert.bean.User;
import com.haiyang.springcloud.service.consumer.service.beanconvert.bean.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface UserMapper {

    @Mapping(source = "note",target = "noteMessage")
    UserDTO user2UserDTO(User user);
}
