package com.example.apidemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class ProviderdbEntityPK implements Serializable {
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
    @Column(name = "provtype")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int provtype;
    @Column(name = "providerid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int providerid;

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

    public int getProvtype() {
        return provtype;
    }

    public void setProvtype(int provtype) {
        this.provtype = provtype;
    }

    public int getProviderid() {
        return providerid;
    }

    public void setProviderid(int providerid) {
        this.providerid = providerid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderdbEntityPK that = (ProviderdbEntityPK) o;
        return zillaid == that.zillaid && upazilaid == that.upazilaid && unionid == that.unionid && provtype == that.provtype && providerid == that.providerid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zillaid, upazilaid, unionid, provtype, providerid);
    }
}
