package com.example.apidemo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "clientmap", schema = "public", catalog = "RHIS_FACILITY_CENTRAL")
public class ClientmapEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "generatedid")
    private long generatedid;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "age")
    private Integer age;
    @Basic
    @Column(name = "divid")
    private Integer divid;
    @Basic
    @Column(name = "zillaid")
    private Integer zillaid;
    @Basic
    @Column(name = "upazilaid")
    private Integer upazilaid;
    @Basic
    @Column(name = "unionid")
    private Integer unionid;
    @Basic
    @Column(name = "mouzaid")
    private Integer mouzaid;
    @Basic
    @Column(name = "villageid")
    private Integer villageid;
    @Basic
    @Column(name = "hhno")
    private Integer hhno;
    @Basic
    @Column(name = "sno")
    private Integer sno;
    @Basic
    @Column(name = "mobileno")
    private Long mobileno;
    @Basic
    @Column(name = "providerid")
    private Integer providerid;
    @Basic
    @Column(name = "healthid")
    private long healthid;
    @Basic
    @Column(name = "gender")
    private Integer gender;
    @Basic
    @Column(name = "fathername")
    private String fathername;
    @Basic
    @Column(name = "mothername")
    private String mothername;
    @Basic
    @Column(name = "husbandname")
    private String husbandname;
    @Basic
    @Column(name = "dob")
    private Date dob;
    @Basic
    @Column(name = "ownmobile")
    private Integer ownmobile;
    @Basic
    @Column(name = "epiblock")
    private Integer epiblock;
    @Basic
    @Column(name = "dobsource")
    private Integer dobsource;
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

    public long getGeneratedid() {
        return generatedid;
    }

    public void setGeneratedid(long generatedid) {
        this.generatedid = generatedid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDivid() {
        return divid;
    }

    public void setDivid(Integer divid) {
        this.divid = divid;
    }

    public Integer getZillaid() {
        return zillaid;
    }

    public void setZillaid(Integer zillaid) {
        this.zillaid = zillaid;
    }

    public Integer getUpazilaid() {
        return upazilaid;
    }

    public void setUpazilaid(Integer upazilaid) {
        this.upazilaid = upazilaid;
    }

    public Integer getUnionid() {
        return unionid;
    }

    public void setUnionid(Integer unionid) {
        this.unionid = unionid;
    }

    public Integer getMouzaid() {
        return mouzaid;
    }

    public void setMouzaid(Integer mouzaid) {
        this.mouzaid = mouzaid;
    }

    public Integer getVillageid() {
        return villageid;
    }

    public void setVillageid(Integer villageid) {
        this.villageid = villageid;
    }

    public Integer getHhno() {
        return hhno;
    }

    public void setHhno(Integer hhno) {
        this.hhno = hhno;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public Long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }

    public Integer getProviderid() {
        return providerid;
    }

    public void setProviderid(Integer providerid) {
        this.providerid = providerid;
    }

    public long getHealthid() {
        return healthid;
    }

    public void setHealthid(long healthid) {
        this.healthid = healthid;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getHusbandname() {
        return husbandname;
    }

    public void setHusbandname(String husbandname) {
        this.husbandname = husbandname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getOwnmobile() {
        return ownmobile;
    }

    public void setOwnmobile(Integer ownmobile) {
        this.ownmobile = ownmobile;
    }

    public Integer getEpiblock() {
        return epiblock;
    }

    public void setEpiblock(Integer epiblock) {
        this.epiblock = epiblock;
    }

    public Integer getDobsource() {
        return dobsource;
    }

    public void setDobsource(Integer dobsource) {
        this.dobsource = dobsource;
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
        ClientmapEntity that = (ClientmapEntity) o;
        return generatedid == that.generatedid && healthid == that.healthid && Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(divid, that.divid) && Objects.equals(zillaid, that.zillaid) && Objects.equals(upazilaid, that.upazilaid) && Objects.equals(unionid, that.unionid) && Objects.equals(mouzaid, that.mouzaid) && Objects.equals(villageid, that.villageid) && Objects.equals(hhno, that.hhno) && Objects.equals(sno, that.sno) && Objects.equals(mobileno, that.mobileno) && Objects.equals(providerid, that.providerid) && Objects.equals(gender, that.gender) && Objects.equals(fathername, that.fathername) && Objects.equals(mothername, that.mothername) && Objects.equals(husbandname, that.husbandname) && Objects.equals(dob, that.dob) && Objects.equals(ownmobile, that.ownmobile) && Objects.equals(epiblock, that.epiblock) && Objects.equals(dobsource, that.dobsource) && Objects.equals(systementrydate, that.systementrydate) && Objects.equals(modifydate, that.modifydate) && Objects.equals(uploaddate, that.uploaddate) && Objects.equals(upload, that.upload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generatedid, name, age, divid, zillaid, upazilaid, unionid, mouzaid, villageid, hhno, sno, mobileno, providerid, healthid, gender, fathername, mothername, husbandname, dob, ownmobile, epiblock, dobsource, systementrydate, modifydate, uploaddate, upload);
    }
}
