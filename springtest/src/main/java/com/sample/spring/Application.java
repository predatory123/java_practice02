package com.sample.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: wenyongjie
 * @date: 2021/7/6 23:56
 */
@SpringBootApplication(scanBasePackages = "com.sample.spring")
@MapperScan("com.sample.spring.dao.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
