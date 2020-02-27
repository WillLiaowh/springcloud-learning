package com.liaowh.controller;

import com.liaowh.mapper.UserMapper;

import com.liaowh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController_provider {

    @Autowired
    public UserMapper userMapper;

    @RequestMapping(value = "/provider/queryUser/{id}")
    public User queryUser(@PathVariable("id") Integer id){
        System.out.println(userMapper.getUserById(id));
        return userMapper.getUserById(id);
    }
}
