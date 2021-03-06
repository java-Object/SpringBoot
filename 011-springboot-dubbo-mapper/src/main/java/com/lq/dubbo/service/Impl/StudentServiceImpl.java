package com.lq.dubbo.service.Impl;

import com.lq.dubbo.mapper.StudentMapper;
import com.lq.dubbo.model.Student;
import com.lq.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 罗强
 * @create 2020-12-11 21:48
 * @class
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int modifyStudentById(Student student) {
        int updateCount = studentMapper.updateByPrimaryKeySelective(student);
        System.out.println("更新结果：" + updateCount);
        //在此构造一个除数为 0 的异常，测试事务是否起作用
//        int a = 10/0;
        return updateCount;
    }
}
