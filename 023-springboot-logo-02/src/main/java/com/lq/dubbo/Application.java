package com.lq.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * 修改 springboot 的启动 logo
 * 在 src/main/resources 放入 banner.txt 文件，该文件名字不能随意，文
 * 件中的内容就是要输出的 logo ；
 * @author Luo
 * @date 2020/12/13 22:15
 * @param
 * @return
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
