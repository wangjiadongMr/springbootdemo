package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class Workplace implements Serializable {
    private int wid;
    private String wName;

    public Workplace() {
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    @Override
    public String toString() {
        return "Workplace{" +
                "wid=" + wid +
                ", wName='" + wName + '\'' +
                '}';
    }
}
