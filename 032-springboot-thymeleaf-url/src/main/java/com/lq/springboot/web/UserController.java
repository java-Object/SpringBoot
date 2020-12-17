package com.lq.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 罗强
 * @create 2020-12-15 9:55
 * @class
 */
@Controller
public class UserController {

    @RequestMapping("/toUrl")
    public String toUrl(Model model){
        return "toUrl";
    }

    @RequestMapping("/toUrl2")
    public String toUrl2(Integer id ,String name ,Model model){
        model.addAttribute("id",id);
        model.addAttribute("name",name);
        return "toUrl";
    }

    @RequestMapping("/toIndex")
    public @ResponseBody String toIndex(Integer id,String name){
        return "<h2>页面传递来的参数:id="+id+"----name="+name+"</h2>";
    }

}
