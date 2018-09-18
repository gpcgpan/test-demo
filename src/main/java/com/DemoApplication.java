package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: 小殊
 * create: 2018/9/13 上午9:10
 */
@RestController
@SpringBootApplication
public class DemoApplication {
    public static void main(String args[]) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello world1 oo";
    }
}


