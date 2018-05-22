package com.example.demo.model;

import java.io.Serializable;

/**
 * @author li
 * @data on 2018/5/4
 */
public class CrossProject implements Serializable {


    private int id;
    private String name;
    private String personName;
    private String publishTime;
    private String award;
    private int insptId;
    private int tId;

    public CrossProject() {
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

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getInsptId() {
        return insptId;
    }

    public void setInsptId(int insptId) {
        this.insptId = insptId;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    @Override
    public String toString() {
        return "CrossProject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", personName='" + personName + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", award='" + award + '\'' +
                ", insptId=" + insptId +
                ", tId=" + tId +
                '}';
    }
}
