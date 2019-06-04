package com.lmaye.sc.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring Boot Eureka Server 应用启动类
 *
 * @author lmay.Zhou
 * @date 2017/10/19 18:29
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@EnableEurekaServer
@SpringBootApplication
public class ScEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaServerApplication.class, args);
    }
}
