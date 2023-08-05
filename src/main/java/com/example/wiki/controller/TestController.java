package com.example.wiki.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){

        return "Hello World!";
    }
        @PostMapping("/hello/post")
        public String helloPost(String name) {

            return "Hello World! Post" + name;
        }
}
