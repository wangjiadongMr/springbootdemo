package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class DessertationCla implements Serializable{
    private int id;
    private String className;
    private int cluid;
    private int preid;

    public DessertationCla() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getCluid() {
        return cluid;
    }

    public void setCluid(int cluid) {
        this.cluid = cluid;
    }

    public int getPreid() {
        return preid;
    }

    public void setPreid(int preid) {
        this.preid = preid;
    }

    @Override
    public String toString() {
        return "DessertationCla{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", cluid=" + cluid +
                ", preid=" + preid +
                '}';
    }
}
