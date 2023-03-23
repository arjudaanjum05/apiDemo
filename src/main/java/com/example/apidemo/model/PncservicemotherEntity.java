package com.example.apidemo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pncservicemother", schema = "public", catalog = "RHIS_FACILITY_CENTRAL")
@IdClass(PncservicemotherEntityPK.class)
public class PncservicemotherEntity {
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
    @Column(name = "temperature")
    private Double temperature;
    @Basic
    @Column(name = "bpsystolic")
    private Integer bpsystolic;
    @Basic
    @Column(name = "bpdiastolic")
    private Integer bpdiastolic;
    @Basic
    @Column(name = "anemia")
    private Integer anemia;
    @Basic
    @Column(name = "hemoglobin")
    private Integer hemoglobin;
    @Basic
    @Column(name = "breastcondition")
    private Integer breastcondition;
    @Basic
    @Column(name = "uterusinvolution")
    private Integer uterusinvolution;
    @Basic
    @Column(name = "hematuria")
    private Integer hematuria;
    @Basic
    @Column(name = "perineum")
    private Integer perineum;
    @Basic
    @Column(name = "fpmethod")
    private Integer fpmethod;
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
    @Column(name = "edema")
    private Integer edema;
    @Basic
    @Column(name = "complicationsign")
    private String complicationsign;
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

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
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

    public Integer getAnemia() {
        return anemia;
    }

    public void setAnemia(Integer anemia) {
        this.anemia = anemia;
    }

    public Integer getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(Integer hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public Integer getBreastcondition() {
        return breastcondition;
    }

    public void setBreastcondition(Integer breastcondition) {
        this.breastcondition = breastcondition;
    }

    public Integer getUterusinvolution() {
        return uterusinvolution;
    }

    public void setUterusinvolution(Integer uterusinvolution) {
        this.uterusinvolution = uterusinvolution;
    }

    public Integer getHematuria() {
        return hematuria;
    }

    public void setHematuria(Integer hematuria) {
        this.hematuria = hematuria;
    }

    public Integer getPerineum() {
        return perineum;
    }

    public void setPerineum(Integer perineum) {
        this.perineum = perineum;
    }

    public Integer getFpmethod() {
        return fpmethod;
    }

    public void setFpmethod(Integer fpmethod) {
        this.fpmethod = fpmethod;
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

    public Integer getEdema() {
        return edema;
    }

    public void setEdema(Integer edema) {
        this.edema = edema;
    }

    public String getComplicationsign() {
        return complicationsign;
    }

    public void setComplicationsign(String complicationsign) {
        this.complicationsign = complicationsign;
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
        PncservicemotherEntity that = (PncservicemotherEntity) o;
        return healthid == that.healthid && pregno == that.pregno && serviceid == that.serviceid && Objects.equals(providerid, that.providerid) && Objects.equals(visitdate, that.visitdate) && Objects.equals(servicesource, that.servicesource) && Objects.equals(temperature, that.temperature) && Objects.equals(bpsystolic, that.bpsystolic) && Objects.equals(bpdiastolic, that.bpdiastolic) && Objects.equals(anemia, that.anemia) && Objects.equals(hemoglobin, that.hemoglobin) && Objects.equals(breastcondition, that.breastcondition) && Objects.equals(uterusinvolution, that.uterusinvolution) && Objects.equals(hematuria, that.hematuria) && Objects.equals(perineum, that.perineum) && Objects.equals(fpmethod, that.fpmethod) && Objects.equals(symptom, that.symptom) && Objects.equals(disease, that.disease) && Objects.equals(treatment, that.treatment) && Objects.equals(advice, that.advice) && Objects.equals(refer, that.refer) && Objects.equals(referreason, that.referreason) && Objects.equals(refercentername, that.refercentername) && Objects.equals(edema, that.edema) && Objects.equals(complicationsign, that.complicationsign) && Objects.equals(satelitecentername, that.satelitecentername) && Objects.equals(client, that.client) && Objects.equals(visitsource, that.visitsource) && Objects.equals(visitmonth, that.visitmonth) && Objects.equals(systementrydate, that.systementrydate) && Objects.equals(modifydate, that.modifydate) && Objects.equals(uploaddate, that.uploaddate) && Objects.equals(upload, that.upload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthid, pregno, serviceid, providerid, visitdate, servicesource, temperature, bpsystolic, bpdiastolic, anemia, hemoglobin, breastcondition, uterusinvolution, hematuria, perineum, fpmethod, symptom, disease, treatment, advice, refer, referreason, refercentername, edema, complicationsign, satelitecentername, client, visitsource, visitmonth, systementrydate, modifydate, uploaddate, upload);
    }
}
