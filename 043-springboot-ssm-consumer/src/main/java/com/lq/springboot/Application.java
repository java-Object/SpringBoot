package com.lq.springboot;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration   //开启dubbo
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
