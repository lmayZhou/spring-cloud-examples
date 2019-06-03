package com.lmaye.spring.cloud.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * -- Nacos 服务配置Controller
 *
 * @author lmay.Zhou
 * @date 2019/6/3 18:28 星期一
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@RefreshScope
@RestController
@RequestMapping("/config")
public class NacosConfigController {
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    /**
     * http://localhost:8080/config/get
     *
     * @return boolean
     */
    @GetMapping("/get")
    public boolean get() {
        return useLocalCache;
    }
}
