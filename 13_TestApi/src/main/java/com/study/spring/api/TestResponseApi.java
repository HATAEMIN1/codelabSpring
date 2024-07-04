package com.study.spring.api;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResponseApi {

    @GetMapping("/test/response/string")
    public String response() {
        return "Hello World";
    }

//    @GetMapping("/test/response/json")
//    public String jsonResponse() {
//        return "{\"message\":\"Hello World\"}";
//    }

    @GetMapping("/test/response/json")
    public TestResponseBody responseJson() {
        return new TestResponseBody("hato",26);
    }
//    @Data
//    public static class TestResponseBody {
//        public String name;
//        public int age;
//        public TestResponseBody(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//    }




}
