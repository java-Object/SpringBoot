package com.lq.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lq.dubbo.mapper.StudentMapper;
import com.lq.dubbo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 罗强
 * @create 2020-12-13 15:23
 * @class
 */
@Component
@Service(interfaceName = "com.lq.dubbo.service.StudentService",version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudent(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
