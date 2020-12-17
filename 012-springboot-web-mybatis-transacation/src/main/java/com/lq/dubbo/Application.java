package com.lq.dubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.lq.dubbo.mapper")
@EnableTransactionManagement    //开启事务支持（可选项，但@Transactional必须添加）
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
