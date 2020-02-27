package com.liaowh.controller;

import com.liaowh.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController_consumer {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";

    private static final String REST_URL_PREFIX = "http://microservice-provider";

    Logger logger = LoggerFactory.getLogger(UserController_consumer.class);

    @Autowired
    public RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/queryUser/{id}")
    public User queryUser(@PathVariable("id") Integer id){

        logger.error("???");

        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/queryUser/" + id,User.class);
    }

}
