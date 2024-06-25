package com.study._07_jdbcmybbs;

import com.study._07_jdbcmybbs.dao.IMyBbsDao;
import com.study._07_jdbcmybbs.dto.MyBbsDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @Autowired
    IMyBbsDao dao;

    @RequestMapping("/")
    public String root(){
        return "redirect:list";
    }

    @RequestMapping("/list")
    public String listPage(Model model){
        model.addAttribute("lists",dao.listDao());
        return "index";
    }
    @RequestMapping("/view")
    public String view(HttpServletRequest request,Model model){
        int sId = Integer.parseInt(request.getParameter("id"));
        model.addAttribute("dto",dao.viewDao(sId));
        return "view";
    }
}
