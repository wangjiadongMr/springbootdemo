package com.example.demo.model;

import java.io.Serializable;

/**
 * @author li
 * @data on 2018/4/30
 */
public class BelongTwo implements Serializable {

    private int teacherid;
    private String award;
    private String awardTime;

    public BelongTwo() {
    }


    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getAwardTime() {
        return awardTime;
    }

    public void setAwardTime(String awardTime) {
        this.awardTime = awardTime;
    }

    @Override
    public String toString() {
        return "BelongTwo{" +
                "teacherid=" + teacherid +
                ", award='" + award + '\'' +
                ", awardTime='" + awardTime + '\'' +
                '}';
    }
}
