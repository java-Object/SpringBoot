package com.lq.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 打 War 包
 * 程序入口类需扩展继承 SpringBootServletInitializer类，并覆盖 configure 方法
 * @author Luo
 * @date 2020/12/14 15:47
 * @param
 * @return
 */

@SpringBootApplication
public class Application extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //参数为当前 SpringBoot 启动类
        return builder.sources(Application.class);
    }

}
