package com.lq.dubbo.web.controller;

import com.lq.dubbo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 罗强
 * @create 2020-12-14 20:55
 * @class
 */
@Slf4j
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    /**
     *
     * 查询学生数量
     * @author Luo
     * @date 2020/12/14 21:02
     * @param []
     * @return java.lang.Object
     */
    @RequestMapping("/student/count")
    public Object allStudentCount(){
        System.out.println("------------查询开始----------");
        Long num =  studentService.getCount();
        System.out.println("------------查询结束----------");
        return "学生的总人数为："+ num;

    }

}
