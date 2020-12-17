package com.lq.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.lq.dubbo.web")    //扫描web层
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
