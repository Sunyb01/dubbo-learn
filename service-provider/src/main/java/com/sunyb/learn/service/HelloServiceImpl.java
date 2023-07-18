package com.sunyb.learn.service;

import com.sunyb.learn.common.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author yb.Sun
 * @date 2023/7/18 10:12
 */
@DubboService(interfaceClass = HelloService.class, version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String namePrefix) {
        return String.format("Hello %s, this is provider!", namePrefix);
    }
}
