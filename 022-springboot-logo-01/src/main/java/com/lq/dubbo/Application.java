package com.lq.dubbo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 * 关闭SpringBoot Logo图标及启动日志
 * @author Luo
 * @date 2020/12/13 22:10
 * @param
 * @return
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        SpringApplication springApplication = new SpringApplication(Application.class);

        //关闭启动 logo 的输出

        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);

    }

}
