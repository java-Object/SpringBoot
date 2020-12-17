package com.lq.dubbo;

import com.lq.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application2 implements CommandLineRunner {

    //第二步：通过容器获取bean，并注入给userService
    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        //第一步：SpringBoot的启动程序，会初始化Spring容器
        SpringApplication.run(Application2.class, args);
    }

    //覆盖接口中的run方法
    @Override
    public void run(String... args) throws Exception {
        //第三步：容器启动后调用run方法，在方法中调用业务方法
        String get = userService.get();
        System.out.println(get);
    }
}
