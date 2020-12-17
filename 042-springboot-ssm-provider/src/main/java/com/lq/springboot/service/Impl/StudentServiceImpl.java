package com.lq.springboot.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lq.springboot.mapper.StudentMapper;
import com.lq.springboot.model.Student;
import com.lq.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 罗强
 * @create 2020-12-16 9:51
 * @class
 */
@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student toId(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
