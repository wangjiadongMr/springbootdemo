package com.example.demo.model;

import java.io.Serializable;


public class ResearchDetail implements Serializable {

    private int id;
    private String name;
    private String aName;
    private String aTime;
    private int inspState;
    private int teacherId;
    private String aLevel;

    public ResearchDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaTime() {
        return aTime;
    }

    public void setaTime(String aTime) {
        this.aTime = aTime;
    }

    public int getInspState() {
        return inspState;
    }

    public void setInspState(int inspState) {
        this.inspState = inspState;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getaLevel() {
        return aLevel;
    }

    public void setaLevel(String aLevel) {
        this.aLevel = aLevel;
    }


    @Override
    public String toString() {
        return "ResearchDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", aName='" + aName + '\'' +
                ", aTime='" + aTime + '\'' +
                ", inspState=" + inspState +
                ", teacherId=" + teacherId +
                ", aLevel='" + aLevel + '\'' +
                '}';
    }
}
