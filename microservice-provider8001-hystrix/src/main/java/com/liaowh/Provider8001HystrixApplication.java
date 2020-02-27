package com.liaowh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@MapperScan(basePackages = "com.liaowh.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class Provider8001HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001HystrixApplication.class,args);
    }
}
