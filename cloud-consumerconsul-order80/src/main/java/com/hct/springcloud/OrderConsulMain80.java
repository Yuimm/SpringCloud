package com.hct.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: HCT
 * @create: 2021/04/30 15:57
 * @VVVersion 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class OrderConsulMain80
{
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class, args);
    }
}
