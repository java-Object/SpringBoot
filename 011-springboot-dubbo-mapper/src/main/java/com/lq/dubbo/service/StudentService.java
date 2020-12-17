package com.lq.dubbo.service;

import com.lq.dubbo.model.Student;

/**
 * @author 罗强
 * @create 2020-12-11 21:47
 * @class
 */
public interface StudentService {
    Student queryStudentById(Integer id);

    int modifyStudentById(Student student);
}
