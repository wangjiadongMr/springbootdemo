package com.example.demo.model;

import java.io.Serializable;

/**
 * @author li
 * @data on 2018/4/30
 */
public class BelongThree implements Serializable {

    private int teacherid;
    private int autid;
    private String recordTime;

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public int getAutid() {
        return autid;
    }

    public void setAutid(int autid) {
        this.autid = autid;
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String toString() {
        return "BelongThree{" +
                "teacherid=" + teacherid +
                ", autid=" + autid +
                ", recordTime='" + recordTime + '\'' +
                '}';
    }
}
