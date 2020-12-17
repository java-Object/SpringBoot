package com.lq.dubbo.web.controller;

import com.lq.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 罗强
 * @create 2020-12-12 9:27
 * @class
 */

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("put")
    public Object putRedis(String key,String value){
        studentService.put(key,value);
        return "恭喜，数据已经成功保持到了redis中!";
    }

    @RequestMapping("get")
    public String getRedis(String key){
        String value = studentService.get(key);
        /**
         * 非空验证
         */
        if (value == null && value == ""){
            return "你好，未在数据库中找到你所需要的数据，请检查！";
        }else {
            return "找到了key：" + key + "value:" + value;
        }
    }


}
