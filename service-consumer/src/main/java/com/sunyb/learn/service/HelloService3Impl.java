package com.sunyb.learn.service;

import com.sunyb.learn.common.service.HelloService3;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author yb.Sun
 * @date 2023/7/18 14:51
 */
@DubboService(interfaceClass = HelloService3.class, version = "1.0.0")
public class HelloService3Impl implements HelloService3 {

    @Override
    public String sayHello3(String name) {
        return "hello";
    }
}
