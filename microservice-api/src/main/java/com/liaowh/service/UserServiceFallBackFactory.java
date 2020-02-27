package com.liaowh.service;

import com.liaowh.model.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallBackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User queryUser(Integer id) {
                return new User().setID(String.valueOf(id)).setDB_NAME("服务关闭");
            }
        };
    }
}
