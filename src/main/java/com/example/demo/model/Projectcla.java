package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class Projectcla implements Serializable {
    private int id;
    private String proclassName;

    public Projectcla() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProclassName() {
        return proclassName;
    }

    public void setProclassName(String proclassName) {
        this.proclassName = proclassName;
    }

    @Override
    public String toString() {
        return "Projectcla{" +
                "id=" + id +
                ", proclassName='" + proclassName + '\'' +
                '}';
    }
}
