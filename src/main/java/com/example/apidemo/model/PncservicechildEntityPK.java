package com.example.apidemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class PncservicechildEntityPK implements Serializable {
    @Column(name = "healthid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long healthid;
    @Column(name = "pregno")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pregno;
    @Column(name = "childno")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int childno;
    @Column(name = "serviceid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceid;

    public long getHealthid() {
        return healthid;
    }

    public void setHealthid(long healthid) {
        this.healthid = healthid;
    }

    public int getPregno() {
        return pregno;
    }

    public void setPregno(int pregno) {
        this.pregno = pregno;
    }

    public int getChildno() {
        return childno;
    }

    public void setChildno(int childno) {
        this.childno = childno;
    }

    public int getServiceid() {
        return serviceid;
    }

    public void setServiceid(int serviceid) {
        this.serviceid = serviceid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PncservicechildEntityPK that = (PncservicechildEntityPK) o;
        return healthid == that.healthid && pregno == that.pregno && childno == that.childno && serviceid == that.serviceid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthid, pregno, childno, serviceid);
    }
}
