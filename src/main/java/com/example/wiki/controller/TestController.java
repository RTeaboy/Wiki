package com.example.wiki.controller;

import com.example.wiki.domain.Test;
import com.example.wiki.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class TestController {
    @Value("${test.hello}")
    private String testHello;
    @Resource
    private TestService testService;
    @RequestMapping("/hello")
    public String hello(){

        return "Hello World!"+testHello;
    }
        @PostMapping("/hello/post")
        public String helloPost(String name) {

            return "Hello World! Post" + name;
        }
    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
