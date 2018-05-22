package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class Reachaward implements Serializable {
    private int id;
    private String reachName;
    private String awardName;
    private String awardTime;
    private String awardPerson;
    private int state;
    private String awardLeve;
    private int insid;

    public Reachaward() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReachName() {
        return reachName;
    }

    public void setReachName(String reachName) {
        this.reachName = reachName;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAwardTime() {
        return awardTime;
    }

    public void setAwardTime(String awardTime) {
        this.awardTime = awardTime;
    }

    public String getAwardPerson() {
        return awardPerson;
    }

    public void setAwardPerson(String awardPerson) {
        this.awardPerson = awardPerson;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getAwardLeve() {
        return awardLeve;
    }

    public void setAwardLeve(String awardLeve) {
        this.awardLeve = awardLeve;
    }

    public int getInsid() {
        return insid;
    }

    public void setInsid(int insid) {
        this.insid = insid;
    }

    @Override
    public String toString() {
        return "Reachaward{" +
                "id=" + id +
                ", reachName='" + reachName + '\'' +
                ", awardName='" + awardName + '\'' +
                ", awardTime='" + awardTime + '\'' +
                ", awardPerson='" + awardPerson + '\'' +
                ", state=" + state +
                ", awardLeve='" + awardLeve + '\'' +
                ", insid=" + insid +
                '}';
    }
}
