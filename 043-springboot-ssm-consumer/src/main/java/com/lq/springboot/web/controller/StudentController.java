package com.lq.springboot.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lq.springboot.model.Student;
import com.lq.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 罗强
 * @create 2020-12-16 9:45
 * @class
 */


@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false ,timeout = 15000)
    private StudentService studentService;

    /**
     *
     * 根据id查询学生详情
     * @author Luo
     * @date 2020/12/16 9:50
     * @param [model, id]
     * @return java.lang.String
     */
    @RequestMapping("/student/toId")
    public String toId(Model model,Integer id){
        Student student = studentService.toId(id);
        model.addAttribute("student",student);
        return "toIdUser";
    }
}
