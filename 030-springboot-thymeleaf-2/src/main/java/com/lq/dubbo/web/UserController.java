package com.lq.dubbo.web;

import com.lq.dubbo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 罗强
 * @create 2020-12-15 9:55
 * @class
 */
@Controller
public class UserController {

    @RequestMapping("index")
    public String toIndex(Model model){
        User user = new User(666,"张三","abc123");
        model.addAttribute("user",user);
        return "index";
    }

}
