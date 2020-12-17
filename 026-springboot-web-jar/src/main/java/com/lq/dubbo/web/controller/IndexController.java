package com.lq.dubbo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗强
 * @create 2020-12-14 19:33
 * @class
 */
@Controller
public class IndexController {

    @RequestMapping("/abc")
    public String abc(Model model){
        model.addAttribute("data","springBoot框架打jar运行");
        return "abc";
    }

    @RequestMapping("/abc/json")
    public @ResponseBody Map<String, Object> json(){
        Map<String,Object> map = new HashMap<>();
        map.put("code","10000");
        return map;

    }


}
