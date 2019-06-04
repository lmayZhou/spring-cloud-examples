package com.lmaye.sc.eureka.client.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Spring Boot Eureka Client Customer 应用启动类
 *
 * @author lmay.Zhou
 * @date 2017/10/23 17:12
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class ScEurekaClientCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaClientCustomerApplication.class, args);
    }
}
