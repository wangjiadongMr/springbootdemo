package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class ArtName implements Serializable {

    private int id;
    private String aName;
    private String publicTime;
    private String worker;
    private int inspState;
    private int artClassid;
    private String workerSpace;
    private String artClassName;

    public ArtName() {
    }

    public String getWorkerSpace() {
        return workerSpace;
    }

    public void setWorkerSpace(String workerSpace) {
        this.workerSpace = workerSpace;
    }

    public String getArtClassName() {
        return artClassName;
    }

    public void setArtClassName(String artClassName) {
        this.artClassName = artClassName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public int getInspState() {
        return inspState;
    }

    public void setInspState(int inspState) {
        this.inspState = inspState;
    }

    public int getArtClassid() {
        return artClassid;
    }

    public void setArtClassid(int artClassid) {
        this.artClassid = artClassid;
    }

    @Override
    public String toString() {
        return "ArtName{" +
                "id=" + id +
                ", aName='" + aName + '\'' +
                ", publicTime='" + publicTime + '\'' +
                ", worker='" + worker + '\'' +
                ", inspState=" + inspState +
                ", artClassid=" + artClassid +
                ", workerSpace='" + workerSpace + '\'' +
                ", artClassName='" + artClassName + '\'' +
                '}';
    }
}
