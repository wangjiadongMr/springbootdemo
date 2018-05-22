package com.example.demo.model;

import java.io.Serializable;

/**
 * @author li
 * @data on 2018/4/30
 */
public class Cluster implements Serializable{
    private int id;
    private String cluName;

    public Cluster() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCluName() {
        return cluName;
    }

    public void setCluName(String cluName) {
        this.cluName = cluName;
    }

    @Override
    public String toString() {
        return "Cluster{" +
                "id=" + id +
                ", cluName='" + cluName + '\'' +
                '}';
    }
}
