package com.example.apidemo.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "providerdb", schema = "public", catalog = "RHIS_FACILITY_CENTRAL")
@IdClass(ProviderdbEntityPK.class)
public class ProviderdbEntity {
    @Basic
    @Column(name = "divid")
    private Integer divid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "zillaid")
    private int zillaid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "upazilaid")
    private int upazilaid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "unionid")
    private int unionid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "provtype")
    private int provtype;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "providerid")
    private int providerid;
    @Basic
    @Column(name = "provname")
    private String provname;
    @Basic
    @Column(name = "mobileno")
    private Long mobileno;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "endate")
    private Object endate;
    @Basic
    @Column(name = "exdate")
    private Object exdate;
    @Basic
    @Column(name = "active")
    private Integer active;
    @Basic
    @Column(name = "devicesetting")
    private Integer devicesetting;
    @Basic
    @Column(name = "systemupdatedt")
    private String systemupdatedt;
    @Basic
    @Column(name = "healthidrequest")
    private Integer healthidrequest;
    @Basic
    @Column(name = "tablestructurerequest")
    private Integer tablestructurerequest;
    @Basic
    @Column(name = "areaupdate")
    private Integer areaupdate;
    @Basic
    @Column(name = "supervisorcode")
    private Integer supervisorcode;
    @Basic
    @Column(name = "provpass")
    private String provpass;
    @Basic
    @Column(name = "facilityname")
    private String facilityname;
    @Basic
    @Column(name = "csba")
    private Integer csba;
    @Basic
    @Column(name = "systementrydate")
    private Timestamp systementrydate;
    @Basic
    @Column(name = "modifydate")
    private Timestamp modifydate;
    @Basic
    @Column(name = "uploaddate")
    private Timestamp uploaddate;
    @Basic
    @Column(name = "upload")
    private Integer upload;

    public Integer getDivid() {
        return divid;
    }

    public void setDivid(Integer divid) {
        this.divid = divid;
    }

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

    public String getProvname() {
        return provname;
    }

    public void setProvname(String provname) {
        this.provname = provname;
    }

    public Long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getEndate() {
        return endate;
    }

    public void setEndate(Object endate) {
        this.endate = endate;
    }

    public Object getExdate() {
        return exdate;
    }

    public void setExdate(Object exdate) {
        this.exdate = exdate;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getDevicesetting() {
        return devicesetting;
    }

    public void setDevicesetting(Integer devicesetting) {
        this.devicesetting = devicesetting;
    }

    public String getSystemupdatedt() {
        return systemupdatedt;
    }

    public void setSystemupdatedt(String systemupdatedt) {
        this.systemupdatedt = systemupdatedt;
    }

    public Integer getHealthidrequest() {
        return healthidrequest;
    }

    public void setHealthidrequest(Integer healthidrequest) {
        this.healthidrequest = healthidrequest;
    }

    public Integer getTablestructurerequest() {
        return tablestructurerequest;
    }

    public void setTablestructurerequest(Integer tablestructurerequest) {
        this.tablestructurerequest = tablestructurerequest;
    }

    public Integer getAreaupdate() {
        return areaupdate;
    }

    public void setAreaupdate(Integer areaupdate) {
        this.areaupdate = areaupdate;
    }

    public Integer getSupervisorcode() {
        return supervisorcode;
    }

    public void setSupervisorcode(Integer supervisorcode) {
        this.supervisorcode = supervisorcode;
    }

    public String getProvpass() {
        return provpass;
    }

    public void setProvpass(String provpass) {
        this.provpass = provpass;
    }

    public String getFacilityname() {
        return facilityname;
    }

    public void setFacilityname(String facilityname) {
        this.facilityname = facilityname;
    }

    public Integer getCsba() {
        return csba;
    }

    public void setCsba(Integer csba) {
        this.csba = csba;
    }

    public Timestamp getSystementrydate() {
        return systementrydate;
    }

    public void setSystementrydate(Timestamp systementrydate) {
        this.systementrydate = systementrydate;
    }

    public Timestamp getModifydate() {
        return modifydate;
    }

    public void setModifydate(Timestamp modifydate) {
        this.modifydate = modifydate;
    }

    public Timestamp getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Timestamp uploaddate) {
        this.uploaddate = uploaddate;
    }

    public Integer getUpload() {
        return upload;
    }

    public void setUpload(Integer upload) {
        this.upload = upload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderdbEntity that = (ProviderdbEntity) o;
        return zillaid == that.zillaid && upazilaid == that.upazilaid && unionid == that.unionid && provtype == that.provtype && providerid == that.providerid && Objects.equals(divid, that.divid) && Objects.equals(provname, that.provname) && Objects.equals(mobileno, that.mobileno) && Objects.equals(email, that.email) && Objects.equals(endate, that.endate) && Objects.equals(exdate, that.exdate) && Objects.equals(active, that.active) && Objects.equals(devicesetting, that.devicesetting) && Objects.equals(systemupdatedt, that.systemupdatedt) && Objects.equals(healthidrequest, that.healthidrequest) && Objects.equals(tablestructurerequest, that.tablestructurerequest) && Objects.equals(areaupdate, that.areaupdate) && Objects.equals(supervisorcode, that.supervisorcode) && Objects.equals(provpass, that.provpass) && Objects.equals(facilityname, that.facilityname) && Objects.equals(csba, that.csba) && Objects.equals(systementrydate, that.systementrydate) && Objects.equals(modifydate, that.modifydate) && Objects.equals(uploaddate, that.uploaddate) && Objects.equals(upload, that.upload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(divid, zillaid, upazilaid, unionid, provtype, providerid, provname, mobileno, email, endate, exdate, active, devicesetting, systemupdatedt, healthidrequest, tablestructurerequest, areaupdate, supervisorcode, provpass, facilityname, csba, systementrydate, modifydate, uploaddate, upload);
    }
}
