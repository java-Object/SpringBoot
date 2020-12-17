package com.lq.dubbo.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lq.dubbo.mapper.StudentMapper;
import com.lq.dubbo.model.Student;
import com.lq.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author 罗强
 * @create 2020-12-13 17:35
 * @class
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Autowired
    private StudentMapper studentMapper;

    /**
     *
     * 从redis中获取数据 以json格式显示
     * 根据传递过来的值在redis数据库中查询数据，返回到页面
     * @author Luo
     * @date 2020/12/13 17:35
     * @param [name]
     * @return java.lang.String
     */
    @Override
    public String getRedisData(String name) {
        redisTemplate.opsForValue().set("name",name);
        String value = (String) redisTemplate.opsForValue().get(name);
        return value;
    }

    /**
     *
     * 根据id到linux的mysql数据库中查询数据
     * @author Luo
     * @date 2020/12/13 18:25
     * @param [id]
     * @return com.lq.dubbo.model.Student
     */
    @Override
    public Student getBaID(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    /**
     *
     * 查询学生的数量 以json格式显示
     * @author Luo
     * @date 2020/12/13 18:38
     * @param []
     * @return java.lang.Integer
     */
    @Override
    public Integer getCount() {
        return studentMapper.getCount();
    }
}
