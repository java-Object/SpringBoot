package com.lq.dubbo;

import com.lq.dubbo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        /**
         * springBoot程序启动之后，返回值是ConfigurableApplicationContext，它也是一个spring容器对象
         * 它相当于原来Spring中启动容器的ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
         */

        //获取SpringBoot程序启动后的Spring容器
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        //从Spring容器中获取指定bean的对象
        UserService userService = (UserService)context.getBean("userServiceImpl");

        //调用业务bean的方法
        String hello = userService.sayHello();

        System.out.println(hello);


    }

}
