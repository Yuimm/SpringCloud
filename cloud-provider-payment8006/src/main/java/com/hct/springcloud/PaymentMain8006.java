package com.hct.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: HCT
 * @create: 2021/04/30 15:44
 * @VVVersion 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class, args);
    }
}