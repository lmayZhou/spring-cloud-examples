package com.lmaye.spring.cloud.zookeeper.consumer.feign.fallback;

import com.lmaye.spring.cloud.zookeeper.consumer.feign.ZookeeperConsumerFeign;
import org.springframework.stereotype.Component;

/**
 * -- Zookeeper 服务消费者Feign Fallback
 *
 * @author lmay.Zhou
 * @date 2019/6/6 12:48 星期四
 * @qq 379839355
 * @email lmay@lmaye.com
 */
@Component
public class ZookeeperConsumerFeignFallback implements ZookeeperConsumerFeign {
    /**
     * 请求错误回调
     *
     * @param str 请求数据
     * @return String
     */
    @Override
    public String consumer(String str) {
        return "Feign - Request Error!" + str;
    }
}
