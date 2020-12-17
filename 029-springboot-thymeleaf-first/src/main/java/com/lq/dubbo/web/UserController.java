package com.lq.dubbo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 罗强
 * @create 2020-12-15 9:19
 * @class
 */

@Controller
public class UserController {

    @RequestMapping("/toIndex")
    public String toIndex(Model model){
        model.addAttribute("data","嗨！thymeleaf...");
        return "index";
    }
}
