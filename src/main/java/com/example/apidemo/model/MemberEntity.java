package com.example.apidemo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "member", schema = "public", catalog = "RHIS_FACILITY_CENTRAL")
@IdClass(MemberEntityPK.class)
public class MemberEntity {
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
    @Column(name = "mouzaid")
    private int mouzaid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "villageid")
    private int villageid;
    @Basic
    @Column(name = "provtype")
    private int provtype;
    @Basic
    @Column(name = "providerid")
    private int providerid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "hhno")
    private int hhno;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sno")
    private int sno;
    @Basic
    @Column(name = "healthid")
    private long healthid;
    @Basic
    @Column(name = "nameeng")
    private String nameeng;
    @Basic
    @Column(name = "namebang")
    private String namebang;
    @Basic
    @Column(name = "rth")
    private Integer rth;
    @Basic
    @Column(name = "havenid")
    private Integer havenid;
    @Basic
    @Column(name = "nid")
    private Long nid;
    @Basic
    @Column(name = "nidstatus")
    private Integer nidstatus;
    @Basic
    @Column(name = "havebr")
    private Integer havebr;
    @Basic
    @Column(name = "brid")
    private Long brid;
    @Basic
    @Column(name = "bridstatus")
    private Integer bridstatus;
    @Basic
    @Column(name = "mobileno1")
    private Long mobileno1;
    @Basic
    @Column(name = "mobileno2")
    private Long mobileno2;
    @Basic
    @Column(name = "mobileyn")
    private Integer mobileyn;
    @Basic
    @Column(name = "dob")
    private Date dob;
    @Basic
    @Column(name = "age")
    private Integer age;
    @Basic
    @Column(name = "dobsource")
    private Integer dobsource;
    @Basic
    @Column(name = "bplace")
    private Integer bplace;
    @Basic
    @Column(name = "fno")
    private Integer fno;
    @Basic
    @Column(name = "father")
    private String father;
    @Basic
    @Column(name = "fdontknow")
    private Integer fdontknow;
    @Basic
    @Column(name = "mno")
    private Integer mno;
    @Basic
    @Column(name = "mother")
    private String mother;
    @Basic
    @Column(name = "mdontknow")
    private Integer mdontknow;
    @Basic
    @Column(name = "sex")
    private Integer sex;
    @Basic
    @Column(name = "ms")
    private Integer ms;
    @Basic
    @Column(name = "spno1")
    private Integer spno1;
    @Basic
    @Column(name = "spno2")
    private Integer spno2;
    @Basic
    @Column(name = "spno3")
    private Integer spno3;
    @Basic
    @Column(name = "spno4")
    private Integer spno4;
    @Basic
    @Column(name = "elcono")
    private Integer elcono;
    @Basic
    @Column(name = "elcodontknow")
    private Integer elcodontknow;
    @Basic
    @Column(name = "edu")
    private Integer edu;
    @Basic
    @Column(name = "rel")
    private Integer rel;
    @Basic
    @Column(name = "nationality")
    private Integer nationality;
    @Basic
    @Column(name = "ocp")
    private Integer ocp;
    @Basic
    @Column(name = "starttime")
    private Time starttime;
    @Basic
    @Column(name = "entype")
    private Integer entype;
    @Basic
    @Column(name = "endate")
    private Date endate;
    @Basic
    @Column(name = "extype")
    private int extype;
    @Basic
    @Column(name = "exdate")
    private Date exdate;
    @Basic
    @Column(name = "endtime")
    private Time endtime;
    @Basic
    @Column(name = "lat")
    private Float lat;
    @Basic
    @Column(name = "lon")
    private Float lon;
    @Basic
    @Column(name = "userid")
    private Integer userid;
    @Basic
    @Column(name = "endt")
    private Timestamp endt;
    @Basic
    @Column(name = "modifydate")
    private Timestamp modifydate;
    @Basic
    @Column(name = "uploaddate")
    private Timestamp uploaddate;
    @Basic
    @Column(name = "hiddistributed")
    private Integer hiddistributed;
    @Basic
    @Column(name = "hiddistributiondate")
    private Date hiddistributiondate;
    @Basic
    @Column(name = "generatedid")
    private Long generatedid;
    @Basic
    @Column(name = "upload")
    private Integer upload;

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

    public long getHealthid() {
        return healthid;
    }

    public void setHealthid(long healthid) {
        this.healthid = healthid;
    }

    public String getNameeng() {
        return nameeng;
    }

    public void setNameeng(String nameeng) {
        this.nameeng = nameeng;
    }

    public String getNamebang() {
        return namebang;
    }

    public void setNamebang(String namebang) {
        this.namebang = namebang;
    }

    public Integer getRth() {
        return rth;
    }

    public void setRth(Integer rth) {
        this.rth = rth;
    }

    public Integer getHavenid() {
        return havenid;
    }

    public void setHavenid(Integer havenid) {
        this.havenid = havenid;
    }

    public Long getNid() {
        return nid;
    }

    public void setNid(Long nid) {
        this.nid = nid;
    }

    public Integer getNidstatus() {
        return nidstatus;
    }

    public void setNidstatus(Integer nidstatus) {
        this.nidstatus = nidstatus;
    }

    public Integer getHavebr() {
        return havebr;
    }

    public void setHavebr(Integer havebr) {
        this.havebr = havebr;
    }

    public Long getBrid() {
        return brid;
    }

    public void setBrid(Long brid) {
        this.brid = brid;
    }

    public Integer getBridstatus() {
        return bridstatus;
    }

    public void setBridstatus(Integer bridstatus) {
        this.bridstatus = bridstatus;
    }

    public Long getMobileno1() {
        return mobileno1;
    }

    public void setMobileno1(Long mobileno1) {
        this.mobileno1 = mobileno1;
    }

    public Long getMobileno2() {
        return mobileno2;
    }

    public void setMobileno2(Long mobileno2) {
        this.mobileno2 = mobileno2;
    }

    public Integer getMobileyn() {
        return mobileyn;
    }

    public void setMobileyn(Integer mobileyn) {
        this.mobileyn = mobileyn;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDobsource() {
        return dobsource;
    }

    public void setDobsource(Integer dobsource) {
        this.dobsource = dobsource;
    }

    public Integer getBplace() {
        return bplace;
    }

    public void setBplace(Integer bplace) {
        this.bplace = bplace;
    }

    public Integer getFno() {
        return fno;
    }

    public void setFno(Integer fno) {
        this.fno = fno;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public Integer getFdontknow() {
        return fdontknow;
    }

    public void setFdontknow(Integer fdontknow) {
        this.fdontknow = fdontknow;
    }

    public Integer getMno() {
        return mno;
    }

    public void setMno(Integer mno) {
        this.mno = mno;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public Integer getMdontknow() {
        return mdontknow;
    }

    public void setMdontknow(Integer mdontknow) {
        this.mdontknow = mdontknow;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getMs() {
        return ms;
    }

    public void setMs(Integer ms) {
        this.ms = ms;
    }

    public Integer getSpno1() {
        return spno1;
    }

    public void setSpno1(Integer spno1) {
        this.spno1 = spno1;
    }

    public Integer getSpno2() {
        return spno2;
    }

    public void setSpno2(Integer spno2) {
        this.spno2 = spno2;
    }

    public Integer getSpno3() {
        return spno3;
    }

    public void setSpno3(Integer spno3) {
        this.spno3 = spno3;
    }

    public Integer getSpno4() {
        return spno4;
    }

    public void setSpno4(Integer spno4) {
        this.spno4 = spno4;
    }

    public Integer getElcono() {
        return elcono;
    }

    public void setElcono(Integer elcono) {
        this.elcono = elcono;
    }

    public Integer getElcodontknow() {
        return elcodontknow;
    }

    public void setElcodontknow(Integer elcodontknow) {
        this.elcodontknow = elcodontknow;
    }

    public Integer getEdu() {
        return edu;
    }

    public void setEdu(Integer edu) {
        this.edu = edu;
    }

    public Integer getRel() {
        return rel;
    }

    public void setRel(Integer rel) {
        this.rel = rel;
    }

    public Integer getNationality() {
        return nationality;
    }

    public void setNationality(Integer nationality) {
        this.nationality = nationality;
    }

    public Integer getOcp() {
        return ocp;
    }

    public void setOcp(Integer ocp) {
        this.ocp = ocp;
    }

    public Time getStarttime() {
        return starttime;
    }

    public void setStarttime(Time starttime) {
        this.starttime = starttime;
    }

    public Integer getEntype() {
        return entype;
    }

    public void setEntype(Integer entype) {
        this.entype = entype;
    }

    public Date getEndate() {
        return endate;
    }

    public void setEndate(Date endate) {
        this.endate = endate;
    }

    public int getExtype() {
        return extype;
    }

    public void setExtype(int extype) {
        this.extype = extype;
    }

    public Date getExdate() {
        return exdate;
    }

    public void setExdate(Date exdate) {
        this.exdate = exdate;
    }

    public Time getEndtime() {
        return endtime;
    }

    public void setEndtime(Time endtime) {
        this.endtime = endtime;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Timestamp getEndt() {
        return endt;
    }

    public void setEndt(Timestamp endt) {
        this.endt = endt;
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

    public Integer getHiddistributed() {
        return hiddistributed;
    }

    public void setHiddistributed(Integer hiddistributed) {
        this.hiddistributed = hiddistributed;
    }

    public Date getHiddistributiondate() {
        return hiddistributiondate;
    }

    public void setHiddistributiondate(Date hiddistributiondate) {
        this.hiddistributiondate = hiddistributiondate;
    }

    public Long getGeneratedid() {
        return generatedid;
    }

    public void setGeneratedid(Long generatedid) {
        this.generatedid = generatedid;
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
        MemberEntity that = (MemberEntity) o;
        return zillaid == that.zillaid && upazilaid == that.upazilaid && unionid == that.unionid && mouzaid == that.mouzaid && villageid == that.villageid && provtype == that.provtype && providerid == that.providerid && hhno == that.hhno && sno == that.sno && healthid == that.healthid && extype == that.extype && Objects.equals(nameeng, that.nameeng) && Objects.equals(namebang, that.namebang) && Objects.equals(rth, that.rth) && Objects.equals(havenid, that.havenid) && Objects.equals(nid, that.nid) && Objects.equals(nidstatus, that.nidstatus) && Objects.equals(havebr, that.havebr) && Objects.equals(brid, that.brid) && Objects.equals(bridstatus, that.bridstatus) && Objects.equals(mobileno1, that.mobileno1) && Objects.equals(mobileno2, that.mobileno2) && Objects.equals(mobileyn, that.mobileyn) && Objects.equals(dob, that.dob) && Objects.equals(age, that.age) && Objects.equals(dobsource, that.dobsource) && Objects.equals(bplace, that.bplace) && Objects.equals(fno, that.fno) && Objects.equals(father, that.father) && Objects.equals(fdontknow, that.fdontknow) && Objects.equals(mno, that.mno) && Objects.equals(mother, that.mother) && Objects.equals(mdontknow, that.mdontknow) && Objects.equals(sex, that.sex) && Objects.equals(ms, that.ms) && Objects.equals(spno1, that.spno1) && Objects.equals(spno2, that.spno2) && Objects.equals(spno3, that.spno3) && Objects.equals(spno4, that.spno4) && Objects.equals(elcono, that.elcono) && Objects.equals(elcodontknow, that.elcodontknow) && Objects.equals(edu, that.edu) && Objects.equals(rel, that.rel) && Objects.equals(nationality, that.nationality) && Objects.equals(ocp, that.ocp) && Objects.equals(starttime, that.starttime) && Objects.equals(entype, that.entype) && Objects.equals(endate, that.endate) && Objects.equals(exdate, that.exdate) && Objects.equals(endtime, that.endtime) && Objects.equals(lat, that.lat) && Objects.equals(lon, that.lon) && Objects.equals(userid, that.userid) && Objects.equals(endt, that.endt) && Objects.equals(modifydate, that.modifydate) && Objects.equals(uploaddate, that.uploaddate) && Objects.equals(hiddistributed, that.hiddistributed) && Objects.equals(hiddistributiondate, that.hiddistributiondate) && Objects.equals(generatedid, that.generatedid) && Objects.equals(upload, that.upload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zillaid, upazilaid, unionid, mouzaid, villageid, provtype, providerid, hhno, sno, healthid, nameeng, namebang, rth, havenid, nid, nidstatus, havebr, brid, bridstatus, mobileno1, mobileno2, mobileyn, dob, age, dobsource, bplace, fno, father, fdontknow, mno, mother, mdontknow, sex, ms, spno1, spno2, spno3, spno4, elcono, elcodontknow, edu, rel, nationality, ocp, starttime, entype, endate, extype, exdate, endtime, lat, lon, userid, endt, modifydate, uploaddate, hiddistributed, hiddistributiondate, generatedid, upload);
    }
}
