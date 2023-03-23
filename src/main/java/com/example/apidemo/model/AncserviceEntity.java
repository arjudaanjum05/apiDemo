package com.example.apidemo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ancservice", schema = "public", catalog = "RHIS_FACILITY_CENTRAL")
@IdClass(AncserviceEntityPK.class)
public class AncserviceEntity {
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
    @Column(name = "bpsystolic")
    private Integer bpsystolic;
    @Basic
    @Column(name = "bpdiastolic")
    private Integer bpdiastolic;
    @Basic
    @Column(name = "weight")
    private Float weight;
    @Basic
    @Column(name = "edema")
    private Integer edema;
    @Basic
    @Column(name = "uterusheight")
    private Integer uterusheight;
    @Basic
    @Column(name = "fetusheartrate")
    private Integer fetusheartrate;
    @Basic
    @Column(name = "fetalpresentation")
    private Integer fetalpresentation;
    @Basic
    @Column(name = "anemia")
    private Integer anemia;
    @Basic
    @Column(name = "jaundice")
    private Integer jaundice;
    @Basic
    @Column(name = "urinesugar")
    private Integer urinesugar;
    @Basic
    @Column(name = "urinealbumin")
    private Integer urinealbumin;
    @Basic
    @Column(name = "ironfolstatus")
    private Integer ironfolstatus;
    @Basic
    @Column(name = "ironfolqty")
    private Integer ironfolqty;
    @Basic
    @Column(name = "ironfolunit")
    private Integer ironfolunit;
    @Basic
    @Column(name = "misostatus")
    private Integer misostatus;
    @Basic
    @Column(name = "misoqty")
    private Integer misoqty;
    @Basic
    @Column(name = "misounit")
    private Integer misounit;
    @Basic
    @Column(name = "complicationsign")
    private String complicationsign;
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
    @Column(name = "hemoglobin")
    private Integer hemoglobin;
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

    public Integer getBpsystolic() {
        return bpsystolic;
    }

    public void setBpsystolic(Integer bpsystolic) {
        this.bpsystolic = bpsystolic;
    }

    public Integer getBpdiastolic() {
        return bpdiastolic;
    }

    public void setBpdiastolic(Integer bpdiastolic) {
        this.bpdiastolic = bpdiastolic;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getEdema() {
        return edema;
    }

    public void setEdema(Integer edema) {
        this.edema = edema;
    }

    public Integer getUterusheight() {
        return uterusheight;
    }

    public void setUterusheight(Integer uterusheight) {
        this.uterusheight = uterusheight;
    }

    public Integer getFetusheartrate() {
        return fetusheartrate;
    }

    public void setFetusheartrate(Integer fetusheartrate) {
        this.fetusheartrate = fetusheartrate;
    }

    public Integer getFetalpresentation() {
        return fetalpresentation;
    }

    public void setFetalpresentation(Integer fetalpresentation) {
        this.fetalpresentation = fetalpresentation;
    }

    public Integer getAnemia() {
        return anemia;
    }

    public void setAnemia(Integer anemia) {
        this.anemia = anemia;
    }

    public Integer getJaundice() {
        return jaundice;
    }

    public void setJaundice(Integer jaundice) {
        this.jaundice = jaundice;
    }

    public Integer getUrinesugar() {
        return urinesugar;
    }

    public void setUrinesugar(Integer urinesugar) {
        this.urinesugar = urinesugar;
    }

    public Integer getUrinealbumin() {
        return urinealbumin;
    }

    public void setUrinealbumin(Integer urinealbumin) {
        this.urinealbumin = urinealbumin;
    }

    public Integer getIronfolstatus() {
        return ironfolstatus;
    }

    public void setIronfolstatus(Integer ironfolstatus) {
        this.ironfolstatus = ironfolstatus;
    }

    public Integer getIronfolqty() {
        return ironfolqty;
    }

    public void setIronfolqty(Integer ironfolqty) {
        this.ironfolqty = ironfolqty;
    }

    public Integer getIronfolunit() {
        return ironfolunit;
    }

    public void setIronfolunit(Integer ironfolunit) {
        this.ironfolunit = ironfolunit;
    }

    public Integer getMisostatus() {
        return misostatus;
    }

    public void setMisostatus(Integer misostatus) {
        this.misostatus = misostatus;
    }

    public Integer getMisoqty() {
        return misoqty;
    }

    public void setMisoqty(Integer misoqty) {
        this.misoqty = misoqty;
    }

    public Integer getMisounit() {
        return misounit;
    }

    public void setMisounit(Integer misounit) {
        this.misounit = misounit;
    }

    public String getComplicationsign() {
        return complicationsign;
    }

    public void setComplicationsign(String complicationsign) {
        this.complicationsign = complicationsign;
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

    public Integer getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(Integer hemoglobin) {
        this.hemoglobin = hemoglobin;
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
        AncserviceEntity that = (AncserviceEntity) o;
        return healthid == that.healthid && pregno == that.pregno && serviceid == that.serviceid && Objects.equals(providerid, that.providerid) && Objects.equals(visitdate, that.visitdate) && Objects.equals(servicesource, that.servicesource) && Objects.equals(bpsystolic, that.bpsystolic) && Objects.equals(bpdiastolic, that.bpdiastolic) && Objects.equals(weight, that.weight) && Objects.equals(edema, that.edema) && Objects.equals(uterusheight, that.uterusheight) && Objects.equals(fetusheartrate, that.fetusheartrate) && Objects.equals(fetalpresentation, that.fetalpresentation) && Objects.equals(anemia, that.anemia) && Objects.equals(jaundice, that.jaundice) && Objects.equals(urinesugar, that.urinesugar) && Objects.equals(urinealbumin, that.urinealbumin) && Objects.equals(ironfolstatus, that.ironfolstatus) && Objects.equals(ironfolqty, that.ironfolqty) && Objects.equals(ironfolunit, that.ironfolunit) && Objects.equals(misostatus, that.misostatus) && Objects.equals(misoqty, that.misoqty) && Objects.equals(misounit, that.misounit) && Objects.equals(complicationsign, that.complicationsign) && Objects.equals(symptom, that.symptom) && Objects.equals(disease, that.disease) && Objects.equals(treatment, that.treatment) && Objects.equals(advice, that.advice) && Objects.equals(refer, that.refer) && Objects.equals(referreason, that.referreason) && Objects.equals(refercentername, that.refercentername) && Objects.equals(satelitecentername, that.satelitecentername) && Objects.equals(hemoglobin, that.hemoglobin) && Objects.equals(client, that.client) && Objects.equals(visitsource, that.visitsource) && Objects.equals(visitmonth, that.visitmonth) && Objects.equals(systementrydate, that.systementrydate) && Objects.equals(modifydate, that.modifydate) && Objects.equals(uploaddate, that.uploaddate) && Objects.equals(upload, that.upload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthid, pregno, serviceid, providerid, visitdate, servicesource, bpsystolic, bpdiastolic, weight, edema, uterusheight, fetusheartrate, fetalpresentation, anemia, jaundice, urinesugar, urinealbumin, ironfolstatus, ironfolqty, ironfolunit, misostatus, misoqty, misounit, complicationsign, symptom, disease, treatment, advice, refer, referreason, refercentername, satelitecentername, hemoglobin, client, visitsource, visitmonth, systementrydate, modifydate, uploaddate, upload);
    }
}
