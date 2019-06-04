package com.lmaye.sc.eureka.client.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * -- 客户端服务提供者 Controller
 *
 * @author lmay.Zhou
 * @date 2019/6/4 14:57 星期二
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@Slf4j
@RestController
@RequestMapping("/client")
public class ClientProviderController {
    /**
     * 服务注册
     */
    @Resource
    private Registration registration;

    /**
     * 服务发现客户端
     */
    private DiscoveryClient discoveryClient;

    public ClientProviderController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    /**
     * http://localhost:8071/client/provider
     *
     * @return String
     */
    @RequestMapping("/provider")
    public String provider() {
        ServiceInstance instance = serviceInstance();
        log.info("-----------> provider service, host = {}, service_id = {}", instance.getHost(), instance.getServiceId());
        return "Hello,Provider!";
    }

    /**
     * 获取当前服务的服务实例
     *
     * @return ServiceInstance
     */
    private ServiceInstance serviceInstance() {
        List<ServiceInstance> list = discoveryClient.getInstances(registration.getServiceId());
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}