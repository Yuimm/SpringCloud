package com.hct.springcloud;

import com.hct.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @description:
 * @author: HCT
 * @create: 2021/04/30 00:24
 * @VVVersion 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PROVIDER-SERVICE", configuration = MySelfRule.class)
public class OrderMain80
{
    public static void main( String[] args ){
        SpringApplication.run(OrderMain80.class, args);
    }
}
