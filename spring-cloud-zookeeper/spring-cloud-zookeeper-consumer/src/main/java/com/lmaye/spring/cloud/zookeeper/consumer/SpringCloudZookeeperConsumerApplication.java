package com.lmaye.spring.cloud.zookeeper.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * -- Zookeeper 服务消费者Application
 *
 * @author lmay.Zhou
 * @date 2019/6/5 16:37 星期三
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@EnableCircuitBreaker
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudZookeeperConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZookeeperConsumerApplication.class, args);
    }
}
