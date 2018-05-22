package com.example.demo.model;

import java.io.Serializable;

public class Dissertation implements Serializable {
    private int id;
    private int insid;
    private String title;
    private String first;
    private String publishTime;
    private String bat;
    private String perCla;
    private int state;
    private String allWriter;
    private int clusterId;



    public Dissertation() {
    }

    public int getClusterId() {
        return clusterId;
    }

    public void setClusterId(int clusterId) {
        this.clusterId = clusterId;
    }

    public String getAllWriter() {
        return allWriter;
    }

    public void setAllWriter(String allWriter) {
        this.allWriter = allWriter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInsid() {
        return insid;
    }

    public void setInsid(int insid) {
        this.insid = insid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getBat() {
        return bat;
    }

    public void setBat(String bat) {
        this.bat = bat;
    }

    public String getPerCla() {
        return perCla;
    }

    public void setPerCla(String perCla) {
        this.perCla = perCla;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Dissertation{" +
                "id=" + id +
                ", insid=" + insid +
                ", title='" + title + '\'' +
                ", first='" + first + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", bat='" + bat + '\'' +
                ", perCla='" + perCla + '\'' +
                ", state=" + state +
                ", allWriter='" + allWriter + '\'' +
                ", clusterId=" + clusterId +
                '}';
    }


}
