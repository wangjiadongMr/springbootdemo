package com.example.demo.model;

import java.io.Serializable;

/**
 * @author li
 * @data on 2018/4/30
 */
public class Claim implements Serializable {
    private int id;
    private String title;
    private String perName;
    private String publishTime;
    private String recordName;
    private String personName;
    private String claimTime;
    private int state;
    private String type;

    public Claim() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getClaimTime() {
        return claimTime;
    }

    public void setClaimTime(String claimTime) {
        this.claimTime = claimTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", perName='" + perName + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", recordName='" + recordName + '\'' +
                ", personName='" + personName + '\'' +
                ", claimTime='" + claimTime + '\'' +
                ", state=" + state +
                ", type='" + type + '\'' +
                '}';
    }
}
