package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/5/14
 */
public class User implements Serializable{


    private Integer id;
    private String name;
    private String pwd;
    private String mail;
    private String title;


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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", mail='" + mail + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
