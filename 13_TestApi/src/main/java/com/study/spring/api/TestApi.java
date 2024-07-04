package com.study.spring.api;


import org.springframework.web.bind.annotation.*;

@RestController
public class TestApi {

    @GetMapping("/hello/world")
    public String getHello() {
        return "get hello world";
    }

    @PostMapping("/hello/world")
    public String postHello() {
        return "post hello world";
    }

    @PutMapping("/hello/world")
    public String putHello() {
        return "put hello world";
    }
    @DeleteMapping("/hello/world")
    public String deleteHello() {
        return "delete hello world";
    }
}
