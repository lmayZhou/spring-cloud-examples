package com.lmaye.spring.cloud.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * -- Nacos 服务提供者Controller
 *
 * @author lmay.Zhou
 * @qq 379839355
 * @email lmay@lmaye.com
 * @since 2019/6/3 22:32 星期一
 */
@RestController
@RequestMapping("/provider")
public class NacosProviderController {
    /**
     * http://localhost:8082/provider/echo/2019
     *
     * @param str 请求参数
     * @return String
     */
    @GetMapping("/echo/{str}")
    public String echo(@PathVariable String str) {
        return "Hello Nacos Discovery " + str;
    }
}
