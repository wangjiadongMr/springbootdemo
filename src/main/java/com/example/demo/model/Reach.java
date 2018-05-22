package com.example.demo.model;

import java.io.Serializable;


public class Reach implements Serializable{
    private int treid;
    private String treTitle;
    private String treTime;
    private String treFaut;
    private String allAut;
    private int inspectorid;

    public Reach() {
    }

    public int getTreid() {
        return treid;
    }

    public void setTreid(int treid) {
        this.treid = treid;
    }

    public String getTreTitle() {
        return treTitle;
    }

    public void setTreTitle(String treTitle) {
        this.treTitle = treTitle;
    }

    public String getTreTime() {
        return treTime;
    }

    public void setTreTime(String treTime) {
        this.treTime = treTime;
    }

    public String getTreFaut() {
        return treFaut;
    }

    public void setTreFaut(String treFaut) {
        this.treFaut = treFaut;
    }

    public String getAllAut() {
        return allAut;
    }

    public void setAllAut(String allAut) {
        this.allAut = allAut;
    }

    public int getInspectorid() {
        return inspectorid;
    }

    public void setInspectorid(int inspectorid) {
        this.inspectorid = inspectorid;
    }

    @Override
    public String toString() {
        return "Reach{" +
                "treid=" + treid +
                ", treTitle='" + treTitle + '\'' +
                ", treTime='" + treTime + '\'' +
                ", treFaut='" + treFaut + '\'' +
                ", allAut='" + allAut + '\'' +
                ", inspectorid=" + inspectorid +
                '}';
    }
}
