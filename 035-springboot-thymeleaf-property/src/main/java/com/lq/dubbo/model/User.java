package com.lq.dubbo.model;

/**
 * @author 罗强
 * @create 2020-12-16 11:57
 * @class
 */
public class User {
    private Integer id;
    private String name;
    private String phone;
    private String address;

    public User() {
    }

    public User(Integer id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
