package com.example.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@RestController
public class TestController {
    @Value("${test.hello:Hello}")
    private String testHello;
    @RequestMapping("/hello")
    public String hello(){

        return "Hello World!"+testHello;
    }
        @PostMapping("/hello/post")
        public String helloPost(String name) {

            return "Hello World! Post" + name;
        }
}
