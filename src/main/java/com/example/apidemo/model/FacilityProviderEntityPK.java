package com.example.apidemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class FacilityProviderEntityPK implements Serializable {
    @Column(name = "facility_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long facilityId;
    @Column(name = "providerid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int providerid;

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
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
        FacilityProviderEntityPK that = (FacilityProviderEntityPK) o;
        return facilityId == that.facilityId && providerid == that.providerid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(facilityId, providerid);
    }
}
