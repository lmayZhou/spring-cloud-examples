package com.lmaye.sc.eureka.client.customer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * -- 客户端服务消费者 Controller
 *
 * @author lmay.Zhou
 * @date 2019/6/4 15:06 星期二
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@Slf4j
@RestController
@RequestMapping("/client")
public class ClientCustomerController {
    /**
     * HTTP 访问操作类
     */
    private RestTemplate restTemplate;

    public ClientCustomerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * http://localhost:8072/client/customer
     * - HystrixCommand 注解来指定回调方法
     *
     * @return String
     */
    @GetMapping("/customer")
    @HystrixCommand(fallbackMethod = "customerFallback")
    public String customer() {
        String providerMsg = restTemplate.getForEntity("http://PROVIDER-SERVICE/client/provider", String.class).getBody();
        log.info("Client Customer: -----------> {}", providerMsg);
        return "Hello, Customer! msg from provider : <br/><br/> " + providerMsg;
    }

    /**
     * 回调方法
     *
     * @return String
     */
    public String customerFallback() {
        return "Request Error!";
    }
}