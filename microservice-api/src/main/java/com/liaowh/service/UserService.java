package com.liaowh.service;

import com.liaowh.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(value = "MICROSERVICE-PROVIDER")
@FeignClient(value = "MICROSERVICE-PROVIDER",fallbackFactory = UserServiceFallBackFactory.class)
public interface UserService {

    @RequestMapping(value = "/provider/queryUser/{id}",method = RequestMethod.GET)
    public User queryUser(@PathVariable("id") Integer id);

}
