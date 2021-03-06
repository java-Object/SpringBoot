package com.lq.dubbo.web.controller;

import com.lq.dubbo.model.Student;
import com.lq.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 罗强
 * @create 2020-12-12 0:49
 * @class
 */

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/springboot/modify")
    public @ResponseBody Object modifyStudent() {
        int count = 0;
        try {
            Student student = new Student();
            student.setId(1);
            student.setName("Jack");
            student.setAge(31);
            count = studentService.modifyStudentById(student);
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
        return count;
    }

}
