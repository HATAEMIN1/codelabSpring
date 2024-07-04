package com.study.spring.api;

import com.study.spring.service.TestService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestEntityApi {
//    @Autowired
    private final TestService testService;


    @PostMapping("/test/entity/create")
    public void testEntity(@RequestBody CreateTestEntityRequest request) {
        testService.create(request.getName(), request.getAge());
    }
    @Data
    @AllArgsConstructor
    public static class CreateTestEntityRequest{
        private String name;
        private int age;
    }


}
