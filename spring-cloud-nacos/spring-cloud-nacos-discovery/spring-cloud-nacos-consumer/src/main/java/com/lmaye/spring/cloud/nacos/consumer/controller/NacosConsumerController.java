package com.lmaye.spring.cloud.nacos.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * -- Nacos 服务消费者Controller
 *
 * @author lmay.Zhou
 * @qq 379839355
 * @email lmay@lmaye.com
 * @since 2019/6/3 22:44 星期一
 */
@RestController
@RequestMapping("/consumer")
public class NacosConsumerController {
    private final RestTemplate restTemplate;

    public NacosConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * http://localhost:8081/consumer/echo/2019
     *
     * @param str 请求参数
     * @return String
     */
    @GetMapping("/echo/{str}")
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://nacos-provider/provider/echo/" + str, String.class);
    }
}
