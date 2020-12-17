package com.lq.dubbo.mapper;

import com.lq.dubbo.model.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /**
     *
     * 查询学生总人数
     * @author Luo
     * @date 2020/12/14 21:05
     * @param []
     * @return java.lang.Long
     */
    Long getCount();
}