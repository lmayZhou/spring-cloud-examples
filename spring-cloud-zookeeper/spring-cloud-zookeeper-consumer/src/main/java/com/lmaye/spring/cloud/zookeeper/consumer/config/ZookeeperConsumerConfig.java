package com.lmaye.spring.cloud.zookeeper.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * -- Zookeeper 服务消费者配置
 *
 * @author lmay.Zhou
 * @date 2019/6/5 17:12 星期三
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@Configuration
public class ZookeeperConsumerConfig {
    /**
     * 请求模版
     *
     * @return RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}