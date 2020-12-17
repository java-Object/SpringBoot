package com.lq.springboot.web;

import com.lq.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗强
 * @create 2020-12-15 15:13
 * @class
 */
@Controller
public class UserController {

    @RequestMapping("/user/list")
    public String uList(Model model){
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i+1);
            user.setName("张三"+(i+1)+"号");
            user.setAddr("东莞"+(i+1)+"号");
            users.add(user);
        }
        model.addAttribute("users",users);
        return "list";
    }


    @RequestMapping("/user/map")
    public String uMap(Model model){
        Map<Integer , User> userMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("张三"+(i+1)+"号");
            user.setAddr("东莞"+(i+1)+"号");
            userMap.put(i,user);
        }
        model.addAttribute("userMap",userMap);
        return "map";
    }


}
