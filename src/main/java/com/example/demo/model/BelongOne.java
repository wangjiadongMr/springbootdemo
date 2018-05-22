package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class BelongOne implements Serializable {

    private int teacherid;
    private int disid;
    private String recordTime;


    public BelongOne() {
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public int getDisid() {
        return disid;
    }

    public void setDisid(int disid) {
        this.disid = disid;
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String toString() {
        return "BelongOne{" +
                "teacherid=" + teacherid +
                ", disid=" + disid +
                ", recordTime='" + recordTime + '\'' +
                '}';
    }
}
