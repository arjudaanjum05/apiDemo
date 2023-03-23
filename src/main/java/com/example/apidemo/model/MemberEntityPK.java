package com.example.apidemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class MemberEntityPK implements Serializable {
    @Column(name = "zillaid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int zillaid;
    @Column(name = "upazilaid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int upazilaid;
    @Column(name = "unionid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int unionid;
    @Column(name = "mouzaid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mouzaid;
    @Column(name = "villageid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int villageid;
    @Column(name = "hhno")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hhno;
    @Column(name = "sno")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sno;

    public int getZillaid() {
        return zillaid;
    }

    public void setZillaid(int zillaid) {
        this.zillaid = zillaid;
    }

    public int getUpazilaid() {
        return upazilaid;
    }

    public void setUpazilaid(int upazilaid) {
        this.upazilaid = upazilaid;
    }

    public int getUnionid() {
        return unionid;
    }

    public void setUnionid(int unionid) {
        this.unionid = unionid;
    }

    public int getMouzaid() {
        return mouzaid;
    }

    public void setMouzaid(int mouzaid) {
        this.mouzaid = mouzaid;
    }

    public int getVillageid() {
        return villageid;
    }

    public void setVillageid(int villageid) {
        this.villageid = villageid;
    }

    public int getHhno() {
        return hhno;
    }

    public void setHhno(int hhno) {
        this.hhno = hhno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberEntityPK that = (MemberEntityPK) o;
        return zillaid == that.zillaid && upazilaid == that.upazilaid && unionid == that.unionid && mouzaid == that.mouzaid && villageid == that.villageid && hhno == that.hhno && sno == that.sno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zillaid, upazilaid, unionid, mouzaid, villageid, hhno, sno);
    }
}
