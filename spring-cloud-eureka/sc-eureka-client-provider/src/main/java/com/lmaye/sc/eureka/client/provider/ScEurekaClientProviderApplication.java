package com.lmaye.sc.eureka.client.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Spring Boot Eureka Client Provider 应用启动类
 *
 * @author lmay.Zhou
 * @date 2017/10/23 17:12
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@EnableEurekaClient
@SpringBootApplication
public class ScEurekaClientProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaClientProviderApplication.class, args);
    }
}