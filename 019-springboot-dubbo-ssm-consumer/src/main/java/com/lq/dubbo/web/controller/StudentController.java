package com.lq.dubbo.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lq.dubbo.model.Student;
import com.lq.dubbo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 罗强
 * @create 2020-12-12 13:54
 * @class
 */

/**
 * Controller中提供两个方法
 * 1. 从redis中获取数据 以json格式显示
 * 2. 根据ID从mysql中查询数据 使用的方法是mapper自动生成的,在jsp页面显示
 * 3. 查询学生的数量 以json格式显示
 */

@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false,timeout = 15000)
    private StudentService studentService;

    /**
     *
     * 从redis中获取数据 以json格式显示
     * 根据传递过来的值在redis数据库中查询数据，返回到页面
     * @author Luo
     * @date 2020/12/13 17:35
     * @param [name]
     * @return java.lang.String
     */
    @RequestMapping("getRedisData")
    public @ResponseBody String getRedisData(String name){
        String value = studentService.getRedisData(name);
        if (value != null && value != ""){
            return "恭喜，根据您提供的信息，我们扫描到：" + value;
        }else {
            return "抱歉，没有查找到任何信息！";
        }
    }


    /**
     *
     * 根据id到linux的mysql数据库中查询数据
     * @author Luo
     * @date 2020/12/13 18:24
     * @param [model, id]
     * @return java.lang.String
     */
    @RequestMapping("getBaId")
    public String getBaId(Model model ,Integer id){
        Student student = studentService.getBaID(id);
        model.addAttribute("student",student);
        return "student";
    }

    /**
     *
     * 查询学生的数量 以json格式显示
     * @author Luo
     * @date 2020/12/13 18:38
     * @param []
     * @return java.lang.String
     */
    @RequestMapping("getCount")
    public @ResponseBody String getCount(){
        Integer count = studentService.getCount();
        return "学生总人数共："+ count +"个";
    }

}
