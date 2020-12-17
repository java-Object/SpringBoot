package com.lq.dubbo.model;

import java.io.Serializable;

/**
 * @author 罗强
 * @create 2020-12-14 9:14
 * @class
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
