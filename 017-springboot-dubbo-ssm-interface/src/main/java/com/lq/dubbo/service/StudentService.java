package com.lq.dubbo.service;

import com.lq.dubbo.model.Student;

/**
 * @author 罗强
 * @create 2020-12-12 13:42
 * @class
 */
public interface StudentService {
    /**
     *
     * 从redis中获取数据 以json格式显示
     * 根据传递过来的值在redis数据库中查询数据，返回到页面
     * @author Luo
     * @date 2020/12/13 17:37
     * @param [name]
     * @return java.lang.String
     */
    String getRedisData(String name);

    /**
     *
     * 根据id到linux的mysql数据库中查询数据
     * @author Luo
     * @date 2020/12/13 18:24
     * @param [id]
     * @return com.lq.dubbo.model.Student
     */
    Student getBaID(Integer id);


    /**
     *
     * 查询学生的数量 以json格式显示
     * @author Luo
     * @date 2020/12/13 18:39
     * @param []
     * @return java.lang.Integer
     */
    Integer getCount();

}
