package com.lq.dubbo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 罗强
 * @create 2020-12-16 11:59
 * @class
 */
@Controller
public class ThymeleafController {

    @RequestMapping("index")
    public String index(Model model){
        model.addAttribute("data","Hello Word , Thymeleaf模板-----》助我前途似锦！！！");
        return "index";
    }

    @RequestMapping("/action")
    public String action(Model model){
        model.addAttribute("action","1");
        return "action";
    }

}
