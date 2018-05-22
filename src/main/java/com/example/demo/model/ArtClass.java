package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class ArtClass implements Serializable{

    private int artid;
    private String artClassName;

    public ArtClass() {
    }

    public int getArtid() {
        return artid;
    }

    public void setArtid(int artid) {
        this.artid = artid;
    }

    public String getArtClassName() {
        return artClassName;
    }

    public void setArtClassName(String artClassName) {
        this.artClassName = artClassName;
    }

    @Override
    public String toString() {
        return "ArtClass{" +
                "artid=" + artid +
                ", artClassName='" + artClassName + '\'' +
                '}';
    }
}
