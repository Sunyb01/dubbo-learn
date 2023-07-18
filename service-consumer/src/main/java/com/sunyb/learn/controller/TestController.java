package com.sunyb.learn.controller;

import com.sunyb.learn.common.service.HelloService;
import com.sunyb.learn.common.service.HelloService2;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yb.Sun
 * @date 2023/7/18 10:17
 */
@RestController
public class TestController {

    @DubboReference(interfaceClass = HelloService.class, version = "1.0.0")
    private HelloService helloService;

    @DubboReference(interfaceClass = HelloService2.class, version = "1.0.0")
    private HelloService2 helloService2;


    @GetMapping("/getName")
    public String getName(@RequestParam String name) {
        return helloService.sayHello(name);
    }

    @GetMapping("/getName2")
    public String getName2(@RequestParam String name) {
        return helloService2.sayHello(name);
    }
}

