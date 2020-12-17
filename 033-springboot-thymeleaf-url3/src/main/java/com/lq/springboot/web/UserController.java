package com.lq.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 罗强
 * @create 2020-12-15 11:28
 * @class
 */

@Controller
public class UserController {

    @RequestMapping("/user/index")
    public String toIndex(Model model){
        model.addAttribute("id",666);
        model.addAttribute("name","王炸");
        model.addAttribute("age",19);
        return "index";
    }

    @RequestMapping("/test3")
    public @ResponseBody String test3(Integer id){
        return "id=" + id;
    }

    @RequestMapping("/test/{id}")
    public @ResponseBody String test(@PathVariable("id")Integer id){
        return "id=" + id;
    }

    @RequestMapping("/test2/{id}/{name}/{age}")
    @ResponseBody
    public String text2(@PathVariable("id") Integer id,
                        @PathVariable("name") String name,
                        @PathVariable("age") Integer age
                        ){
        return "id=" + id + "---name=" + name + "----age=" + age ;

    }

}
