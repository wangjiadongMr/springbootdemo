package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class PeriodiCla implements Serializable {
    private  int perid;
    private String perclassName;
    public PeriodiCla() {
    }

    public int getPerid() {
        return perid;
    }

    public void setPerid(int perid) {
        this.perid = perid;
    }

    public String getPerclassName() {
        return perclassName;
    }

    public void setPerclassName(String perclassName) {
        this.perclassName = perclassName;
    }

    @Override
    public String toString() {
        return "PeriodiCla{" +
                "perid=" + perid +
                ", perclassName='" + perclassName + '\'' +
                '}';
    }
}
