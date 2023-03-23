package com.example.apidemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class PncservicemotherEntityPK implements Serializable {
    @Column(name = "healthid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long healthid;
    @Column(name = "pregno")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pregno;
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
        PncservicemotherEntityPK that = (PncservicemotherEntityPK) o;
        return healthid == that.healthid && pregno == that.pregno && serviceid == that.serviceid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthid, pregno, serviceid);
    }
}
