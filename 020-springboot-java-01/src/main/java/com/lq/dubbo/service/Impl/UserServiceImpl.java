package com.lq.dubbo.service.Impl;

import com.lq.dubbo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 罗强
 * @create 2020-12-13 21:45
 * @class
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello() {
        return "Hello Word";
    }
}
