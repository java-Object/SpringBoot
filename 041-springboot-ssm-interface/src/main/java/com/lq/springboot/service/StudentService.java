package com.lq.springboot.service;

import com.lq.springboot.model.Student;

/**
 * @author 罗强
 * @create 2020-12-16 9:50
 * @class
 */
public interface StudentService {
    /**
     *
     * 根据学生id查询学生详情
     * @author Luo
     * @date 2020/12/16 9:50
     * @param [id]
     * @return com.lq.springboot.model.Student
     */
    Student toId(Integer id);
}
