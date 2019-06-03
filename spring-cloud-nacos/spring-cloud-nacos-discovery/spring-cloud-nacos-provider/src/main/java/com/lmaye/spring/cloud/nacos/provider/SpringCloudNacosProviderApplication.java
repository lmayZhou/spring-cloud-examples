package com.lmaye.spring.cloud.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * -- Nacos 服务提供者Application
 *
 * @author lmay.Zhou
 * @qq 379839355
 * @email lmay@lmaye.com
 * @since 2019/6/3 22:32 星期一
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudNacosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNacosProviderApplication.class, args);
    }

}
