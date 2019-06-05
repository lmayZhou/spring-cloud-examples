package com.lmaye.spring.cloud.zookeeper.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * -- Zookeeper 服务提供者Application
 *
 * @author lmay.Zhou
 * @date 2019/6/5 16:37 星期三
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudZookeeperProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZookeeperProviderApplication.class, args);
    }
}
