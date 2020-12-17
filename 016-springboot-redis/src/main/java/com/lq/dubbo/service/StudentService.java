package com.lq.dubbo.service;

/**
 * @author 罗强
 * @create 2020-12-12 9:30
 * @class
 */
public interface StudentService {
    void put(String key, String value);

    String get(String key);
}
