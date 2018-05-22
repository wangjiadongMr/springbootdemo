package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class Teacher implements Serializable {

    private int id;
    private String name;
    private String sex;
    private String educational;
    private String age;
    private String title;
    private String pwd;
    private int workid;
    private String wName;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getWorkid() {
        return workid;
    }

    public void setWorkid(int workid) {
        this.workid = workid;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", educational='" + educational + '\'' +
                ", age='" + age + '\'' +
                ", title='" + title + '\'' +
                ", pwd='" + pwd + '\'' +
                ", workid=" + workid +
                ", wName='" + wName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
