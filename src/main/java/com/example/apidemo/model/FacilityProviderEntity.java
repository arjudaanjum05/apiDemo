package com.example.apidemo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "facility_provider", schema = "public", catalog = "RHIS_FACILITY_CENTRAL")
@IdClass(FacilityProviderEntityPK.class)
public class FacilityProviderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "facility_id")
    private long facilityId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "providerid")
    private int providerid;
    @Basic
    @Column(name = "is_active")
    private Integer isActive;
    @Basic
    @Column(name = "start_date")
    private Object startDate;
    @Basic
    @Column(name = "end_date")
    private Object endDate;

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

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Object getStartDate() {
        return startDate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacilityProviderEntity that = (FacilityProviderEntity) o;
        return facilityId == that.facilityId && providerid == that.providerid && Objects.equals(isActive, that.isActive) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facilityId, providerid, isActive, startDate, endDate);
    }
}
