package com.lq.springboot.model;

/**
 * @author 罗强
 * @create 2020-12-15 9:54
 * @class
 */
public class User {
    private Integer id;
    private String name;
    private String addr;

    public User() {
    }

    public Integer getId() {
        return id;
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public User(Integer id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }
}
