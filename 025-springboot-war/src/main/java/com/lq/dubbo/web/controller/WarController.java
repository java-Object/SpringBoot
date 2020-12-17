package com.lq.dubbo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 罗强
 * @create 2020-12-14 15:43
 * @class
 */
@Controller
public class WarController {

    @RequestMapping("war")
    public String index(Model model){
        model.addAttribute("data","spring-Boot");
        return "war";
    }

}
