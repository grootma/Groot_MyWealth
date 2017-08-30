package com.groot.pojo;

public class User {
    private String userid;

    private String username;

    private Integer age;

    public User(String userid, String username, Integer age) {
        this.userid = userid;
        this.username = username;
        this.age = age;
    }

    public User() {
        super();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}