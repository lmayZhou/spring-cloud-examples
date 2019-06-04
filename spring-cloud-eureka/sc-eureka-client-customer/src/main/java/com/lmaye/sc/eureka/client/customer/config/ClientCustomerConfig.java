package com.lmaye.sc.eureka.client.customer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * -- 客户端服务消费者配置
 *
 * @author lmay.Zhou
 * @date 2019/6/4 15:02 星期二
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@Configuration
public class ClientCustomerConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
