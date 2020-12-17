package com.lq.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 罗强
 * @create 2020-12-11 9:31
 * @class
 */
@Controller
public class UserController {

    @RequestMapping("/user/detail")
    public String detail(Model model) {
        model.addAttribute("id","66");
        model.addAttribute("name","张三");
        model.addAttribute("addr","地球");
        return "detail";
    }


}
