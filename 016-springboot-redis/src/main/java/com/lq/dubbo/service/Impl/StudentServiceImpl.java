package com.lq.dubbo.service.Impl;

import com.lq.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author 罗强
 * @create 2020-12-12 9:31
 * @class
 */

@Service
public class StudentServiceImpl implements StudentService {

    /**
     * redis的模板对象
     */
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public void put(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
    }

    @Override
    public String get(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }
}
