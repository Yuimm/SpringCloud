package com.hct.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: HCT
 * @create: 2021/04/30 16:30
 * @VVVersion 1.0
 **/

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机策略
    }
}