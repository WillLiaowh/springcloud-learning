package com.liaowh.controller;

import com.liaowh.mapper.UserMapper;

import com.liaowh.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController_provider {

    @Autowired
    public UserMapper userMapper;

    @RequestMapping(value = "/provider/queryUser/{id}")
    @HystrixCommand(fallbackMethod = "hystrix_get")
    public User queryUser(@PathVariable("id") Integer id){
        System.out.println(userMapper.getUserById(id));
        User user = userMapper.getUserById(id);
        if(user == null){
            throw new RuntimeException("error");
        }
        return user;
    }

    public User hystrix_get(@PathVariable("id") Integer id){
        return new User().setID(String.valueOf(id)).setDB_NAME("不存在");
    }
}
