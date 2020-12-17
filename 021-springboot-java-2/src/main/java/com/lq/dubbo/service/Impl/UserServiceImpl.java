package com.lq.dubbo.service.Impl;

import com.lq.dubbo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 罗强
 * @create 2020-12-13 22:01
 * @class
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String get() {
        return "今天又是咸鱼的一天，希望以后的日子会很美好！希望！";
    }
}
