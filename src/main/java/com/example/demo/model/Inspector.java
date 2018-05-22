package com.example.demo.model;

import java.io.Serializable;

/**
 * @author wang
 * @data on 2018/4/30
 */
public class Inspector implements Serializable {
    private int inspid;
    private String ipsName;
    private String ipsTitle;

    public Inspector() {
    }

    public int getInspid() {
        return inspid;
    }

    public void setInspid(int inspid) {
        this.inspid = inspid;
    }

    public String getIpsName() {
        return ipsName;
    }

    public void setIpsName(String ipsName) {
        this.ipsName = ipsName;
    }

    public String getIpsTitle() {
        return ipsTitle;
    }

    public void setIpsTitle(String ipsTitle) {
        this.ipsTitle = ipsTitle;
    }

    @Override
    public String toString() {
        return "Inspector{" +
                "inspid=" + inspid +
                ", ipsName='" + ipsName + '\'' +
                ", ipsTitle='" + ipsTitle + '\'' +
                '}';
    }
}
