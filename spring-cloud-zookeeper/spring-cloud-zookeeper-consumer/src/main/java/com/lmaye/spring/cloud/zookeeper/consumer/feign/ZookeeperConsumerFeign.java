package com.lmaye.spring.cloud.zookeeper.consumer.feign;

import com.lmaye.spring.cloud.zookeeper.consumer.feign.fallback.ZookeeperConsumerFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * -- Zookeeper 消费者Feign
 *
 * @author lmay.Zhou
 * @date 2019/6/6 12:46 星期四
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@FeignClient(value = "zookeeper-provider", fallback = ZookeeperConsumerFeignFallback.class)
public interface ZookeeperConsumerFeign {
    /**
     * Feign Test
     *
     * @param str 请求数据
     * @return String
     */
    @GetMapping("/zookeeper/provider/{str}")
    String consumer(@PathVariable String str);
}
