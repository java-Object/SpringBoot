package com.lq.dubbo.service.Impl;

import com.lq.dubbo.mapper.StudentMapper;
import com.lq.dubbo.model.Student;
import com.lq.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 罗强
 * @create 2020-12-12 0:53
 * @class
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional //添加此注解说明该方法添加的事务管理
    public int modifyStudentById(Student student) {
        int updateCount = studentMapper.updateByPrimaryKeySelective(student);
        System.out.println("更新结果：" + updateCount);
        //在此构造一个除数为 0 的异常，测试事务是否起作用
//        int a = 10/0;
        return updateCount;
    }

}
