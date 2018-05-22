package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class Project implements Serializable {
    private int id;
    private String proName;
    private String pTime;
    private String bat;
    private int pState;
    private int tid;
    private int insid;
    private int proclaId;

    public Project() {
    }
    public int getProclaId() {
        return proclaId;
    }
    public void setProclaId(int proclaId) {
        this.proclaId = proclaId;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime;
    }

    public String getBat() {
        return bat;
    }

    public void setBat(String bat) {
        this.bat = bat;
    }

    public int getpState() {
        return pState;
    }

    public void setpState(int pState) {
        this.pState = pState;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getInsid() {
        return insid;
    }

    public void setInsid(int insid) {
        this.insid = insid;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", proName='" + proName + '\'' +
                ", pTime='" + pTime + '\'' +
                ", bat='" + bat + '\'' +
                ", pState=" + pState +
                ", tid=" + tid +
                ", insid=" + insid +
                ", proclaId=" + proclaId +
                '}';
    }
}
