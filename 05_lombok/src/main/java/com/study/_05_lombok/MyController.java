package com.study._05_lombok;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @RequestMapping("/")
    @ResponseBody
    public String root() {
        return "lombok";
    }

    @RequestMapping("/test")
    public String test(Member member, Model model){
        return "test";
    }
}
