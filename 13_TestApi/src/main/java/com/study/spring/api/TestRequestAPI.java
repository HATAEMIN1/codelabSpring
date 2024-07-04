package com.study.spring.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestRequestAPI {

    //param
    @GetMapping("/test/param")  // test/param?name=hong&age=50
    public String requestParam(@RequestParam("name") String name,@RequestParam("age") int age) {
        return "requestParam name : "+ name + " age : "+ age;
    }

    @GetMapping("/test/path/{name}/{age}")
    public String requestPath(@PathVariable("name") String name, @PathVariable("age") int age) {
        return "requestPath name : "+ name + " age : "+ age;
    }

    @PostMapping("/test/body")
    public String requestBody(@RequestBody TestRequestDto request) {
        return "requestBody name : "+ request.name + " age : "+ request.age;
    }



    //request body
//    @PostMapping("/test/body")
//    public String requestBody(@RequestBody TestRequestBody request) {
//        return "requestBody name : "+ request.name + " age : "+ request.age;
//    }
//
//    public static class TestRequestBody {
//        String name;
//        int age;
//
//        public TestRequestBody(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//    }
}
