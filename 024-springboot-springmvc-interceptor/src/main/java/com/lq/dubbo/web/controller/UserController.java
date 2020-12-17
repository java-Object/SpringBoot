package com.lq.dubbo.web.controller;

import com.lq.dubbo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 罗强
 * @create 2020-12-14 9:12
 * @class
 */
@RestController
public class UserController {

    @RequestMapping("user/login")
    public String toLogin(){
        return "登录界面！";
    }

    @RequestMapping("/user/loginsucess")
    public String toLogin(HttpServletRequest request){
        User user = new User(666,"张三","88888888");
        request.getSession().setAttribute("user",user);
        return "登录成功！";
    }

    @RequestMapping("/user/url")
    public String toUrl(){
        return "欢迎来到url界面！！！";
    }

    @RequestMapping("/user/center")
    public String toCenter(){
        return "欢迎来到个人中心！！！";
    }

    @RequestMapping("/err")
    public String toErr(){
        return "错误！！";
    }

}
