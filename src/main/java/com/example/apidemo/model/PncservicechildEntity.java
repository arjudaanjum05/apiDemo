package com.example.apidemo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pncservicechild", schema = "public", catalog = "RHIS_FACILITY_CENTRAL")
@IdClass(PncservicechildEntityPK.class)
public class PncservicechildEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "healthid")
    private long healthid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pregno")
    private int pregno;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "childno")
    private int childno;
    @Basic
    @Column(name = "childhealthid")
    private Long childhealthid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "serviceid")
    private int serviceid;
    @Basic
    @Column(name = "providerid")
    private Integer providerid;
    @Basic
    @Column(name = "visitdate")
    private Date visitdate;
    @Basic
    @Column(name = "servicesource")
    private Integer servicesource;
    @Basic
    @Column(name = "temperature")
    private Float temperature;
    @Basic
    @Column(name = "weight")
    private Float weight;
    @Basic
    @Column(name = "breathingperminute")
    private Integer breathingperminute;
    @Basic
    @Column(name = "dangersign")
    private String dangersign;
    @Basic
    @Column(name = "breastfeedingonly")
    private Integer breastfeedingonly;
    @Basic
    @Column(name = "symptom")
    private String symptom;
    @Basic
    @Column(name = "disease")
    private String disease;
    @Basic
    @Column(name = "treatment")
    private String treatment;
    @Basic
    @Column(name = "advice")
    private String advice;
    @Basic
    @Column(name = "refer")
    private Integer refer;
    @Basic
    @Column(name = "referreason")
    private String referreason;
    @Basic
    @Column(name = "refercentername")
    private String refercentername;
    @Basic
    @Column(name = "satelitecentername")
    private String satelitecentername;
    @Basic
    @Column(name = "client")
    private Integer client;
    @Basic
    @Column(name = "visitsource")
    private Integer visitsource;
    @Basic
    @Column(name = "visitmonth")
    private Integer visitmonth;
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

    public Long getChildhealthid() {
        return childhealthid;
    }

    public void setChildhealthid(Long childhealthid) {
        this.childhealthid = childhealthid;
    }

    public int getServiceid() {
        return serviceid;
    }

    public void setServiceid(int serviceid) {
        this.serviceid = serviceid;
    }

    public Integer getProviderid() {
        return providerid;
    }

    public void setProviderid(Integer providerid) {
        this.providerid = providerid;
    }

    public Date getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(Date visitdate) {
        this.visitdate = visitdate;
    }

    public Integer getServicesource() {
        return servicesource;
    }

    public void setServicesource(Integer servicesource) {
        this.servicesource = servicesource;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getBreathingperminute() {
        return breathingperminute;
    }

    public void setBreathingperminute(Integer breathingperminute) {
        this.breathingperminute = breathingperminute;
    }

    public String getDangersign() {
        return dangersign;
    }

    public void setDangersign(String dangersign) {
        this.dangersign = dangersign;
    }

    public Integer getBreastfeedingonly() {
        return breastfeedingonly;
    }

    public void setBreastfeedingonly(Integer breastfeedingonly) {
        this.breastfeedingonly = breastfeedingonly;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public Integer getRefer() {
        return refer;
    }

    public void setRefer(Integer refer) {
        this.refer = refer;
    }

    public String getReferreason() {
        return referreason;
    }

    public void setReferreason(String referreason) {
        this.referreason = referreason;
    }

    public String getRefercentername() {
        return refercentername;
    }

    public void setRefercentername(String refercentername) {
        this.refercentername = refercentername;
    }

    public String getSatelitecentername() {
        return satelitecentername;
    }

    public void setSatelitecentername(String satelitecentername) {
        this.satelitecentername = satelitecentername;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public Integer getVisitsource() {
        return visitsource;
    }

    public void setVisitsource(Integer visitsource) {
        this.visitsource = visitsource;
    }

    public Integer getVisitmonth() {
        return visitmonth;
    }

    public void setVisitmonth(Integer visitmonth) {
        this.visitmonth = visitmonth;
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
        PncservicechildEntity that = (PncservicechildEntity) o;
        return healthid == that.healthid && pregno == that.pregno && childno == that.childno && serviceid == that.serviceid && Objects.equals(childhealthid, that.childhealthid) && Objects.equals(providerid, that.providerid) && Objects.equals(visitdate, that.visitdate) && Objects.equals(servicesource, that.servicesource) && Objects.equals(temperature, that.temperature) && Objects.equals(weight, that.weight) && Objects.equals(breathingperminute, that.breathingperminute) && Objects.equals(dangersign, that.dangersign) && Objects.equals(breastfeedingonly, that.breastfeedingonly) && Objects.equals(symptom, that.symptom) && Objects.equals(disease, that.disease) && Objects.equals(treatment, that.treatment) && Objects.equals(advice, that.advice) && Objects.equals(refer, that.refer) && Objects.equals(referreason, that.referreason) && Objects.equals(refercentername, that.refercentername) && Objects.equals(satelitecentername, that.satelitecentername) && Objects.equals(client, that.client) && Objects.equals(visitsource, that.visitsource) && Objects.equals(visitmonth, that.visitmonth) && Objects.equals(systementrydate, that.systementrydate) && Objects.equals(modifydate, that.modifydate) && Objects.equals(uploaddate, that.uploaddate) && Objects.equals(upload, that.upload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthid, pregno, childno, childhealthid, serviceid, providerid, visitdate, servicesource, temperature, weight, breathingperminute, dangersign, breastfeedingonly, symptom, disease, treatment, advice, refer, referreason, refercentername, satelitecentername, client, visitsource, visitmonth, systementrydate, modifydate, uploaddate, upload);
    }
}
