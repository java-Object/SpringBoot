package com.lq.dubbo.service.Impl;

import com.lq.dubbo.mapper.StudentMapper;
import com.lq.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 罗强
 * @create 2020-12-14 21:02
 * @class
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    /**
     *
     * 查询学生总人数
     * @author Luo
     * @date 2020/12/14 21:05
     * @param []
     * @return java.lang.Long
     */
    @Override
    public Long getCount() {
        return studentMapper.getCount();
    }
}
