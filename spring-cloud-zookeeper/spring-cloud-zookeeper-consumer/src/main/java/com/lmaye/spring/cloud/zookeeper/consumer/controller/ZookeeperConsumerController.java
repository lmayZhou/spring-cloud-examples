package com.lmaye.spring.cloud.zookeeper.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * -- Zookeeper 服务消费者Controller
 *
 * @author lmay.Zhou
 * @date 2019/6/5 17:10 星期三
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@RestController
@RequestMapping("/zookeeper")
public class ZookeeperConsumerController {
    /**
     * 请求模版
     */
    private RestTemplate restTemplate;

    public ZookeeperConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * http://localhost:8091/zookeeper/consumer/2019
     *
     * @param str 请求数据
     * @return String
     */
    @GetMapping("/consumer/{str}")
    @HystrixCommand(fallbackMethod = "customerFallback")
    public String consumer(@PathVariable String str) {
        return restTemplate.getForObject("http://zookeeper-provider/zookeeper/provider/" + str, String.class);
    }

    /**
     * 回调方法
     *
     * @return String
     */
    public String customerFallback(String str) {
        return "Request Error! " + str;
    }
}
