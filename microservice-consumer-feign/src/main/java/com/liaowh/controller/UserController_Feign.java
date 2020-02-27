package com.liaowh.controller;

import com.liaowh.model.User;

import com.liaowh.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController_Feign {

    @Autowired
    public UserService userService;

    Logger logger = LoggerFactory.getLogger(UserController_Feign.class);

    @RequestMapping(value = "/consumer/queryUser/{id}")
    public User queryUser(@PathVariable("id") Integer id){
        logger.error("???");
        return userService.queryUser(id);
    }

}
