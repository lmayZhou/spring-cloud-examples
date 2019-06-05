package com.lmaye.spring.cloud.zookeeper.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * -- Zookeeper 服务提供者Controller
 *
 * @author lmay.Zhou
 * @date 2019/6/5 16:37 星期三
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@Slf4j
@RestController
@RequestMapping("/zookeeper")
public class ZookeeperProviderController {
    /**
     * http://localhost:8092/zookeeper/provider/2019
     *
     * @param str 请求参数
     * @return String
     */
    @GetMapping("/provider/{str}")
    public String provider(@PathVariable String str) {
        return "Hello Zookeeper Discovery: " + str;
    }
}