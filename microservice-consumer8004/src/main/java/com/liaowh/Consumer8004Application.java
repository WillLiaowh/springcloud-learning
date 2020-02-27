package com.liaowh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class Consumer8004Application {
    public static void main(String[] args) {
        SpringApplication.run(Consumer8004Application.class,args);
    }
}
