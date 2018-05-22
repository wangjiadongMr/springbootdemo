package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class Info implements Serializable{
    private int id;
    private String pubTitle;
    private String resoure;
    private String Document;
    private String time;

    public Info() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPubTitle() {
        return pubTitle;
    }

    public void setPubTitle(String pubTitle) {
        this.pubTitle = pubTitle;
    }

    public String getResoure() {
        return resoure;
    }

    public void setResoure(String resoure) {
        this.resoure = resoure;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String document) {
        Document = document;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", pubTitle='" + pubTitle + '\'' +
                ", resoure='" + resoure + '\'' +
                ", Document='" + Document + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
