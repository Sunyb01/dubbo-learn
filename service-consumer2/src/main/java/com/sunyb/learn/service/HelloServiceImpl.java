package com.sunyb.learn.service;

import com.sunyb.learn.common.service.HelloService;
import com.sunyb.learn.common.service.HelloService2;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author yb.Sun
 * @date 2023/7/18 10:55
 */
@DubboService(interfaceClass = HelloService2.class, version = "1.0.0")
public class HelloServiceImpl implements HelloService2 {

    @DubboReference(interfaceClass = HelloService.class, version = "1.0.0")
    private HelloService helloService;

    @Override
    public String sayHello(String namePrefix) {
        return helloService.sayHello("<-module-consumer1");
    }
}
