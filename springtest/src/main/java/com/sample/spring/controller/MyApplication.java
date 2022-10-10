package com.sample.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wenyongjie
 * @date: 2021/7/6 23:54
 */
@RestController
public class MyApplication {

    @RequestMapping("/hello")
    String hello() {
        return "Hello spring boot";
    }
}
