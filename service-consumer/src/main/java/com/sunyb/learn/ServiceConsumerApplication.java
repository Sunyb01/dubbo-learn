package com.sunyb.learn;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author yb.Sun
 * @date 2023/7/18 10:16
 */
@EnableDubbo
@SpringBootApplication
public class ServiceConsumerApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ServiceConsumerApplication.class, args);
    }
}
