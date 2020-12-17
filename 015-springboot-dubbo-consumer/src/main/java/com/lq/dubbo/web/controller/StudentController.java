package com.lq.dubbo.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lq.dubbo.model.Student;
import com.lq.dubbo.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 罗强
 * @create 2020-12-13 15:51
 * @class
 */

@RestController
public class StudentController {

    @Reference(interfaceName = "com.lq.dubbo.service.StudentService",version = "1.0.0",timeout = 15000)
    private StudentService studentService;

    @RequestMapping("student")
    public Student queryStudent(Integer id){
        Student student = studentService.queryStudent(id);
        return student;
    }


}
