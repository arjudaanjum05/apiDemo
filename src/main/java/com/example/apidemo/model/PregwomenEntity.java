package com.example.apidemo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pregwomen", schema = "public", catalog = "RHIS_FACILITY_CENTRAL")
@IdClass(PregwomenEntityPK.class)
public class PregwomenEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "healthid")
    private long healthid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pregno")
    private int pregno;
    @Basic
    @Column(name = "providerid")
    private Integer providerid;
    @Basic
    @Column(name = "housegrholdingno")
    private String housegrholdingno;
    @Basic
    @Column(name = "mobileno")
    private Long mobileno;
    @Basic
    @Column(name = "lmp")
    private Date lmp;
    @Basic
    @Column(name = "templmp")
    private Date templmp;
    @Basic
    @Column(name = "statuslmp")
    private Integer statuslmp;
    @Basic
    @Column(name = "edd")
    private Date edd;
    @Basic
    @Column(name = "para")
    private Integer para;
    @Basic
    @Column(name = "gravida")
    private Integer gravida;
    @Basic
    @Column(name = "lastchildage")
    private Integer lastchildage;
    @Basic
    @Column(name = "height")
    private Integer height;
    @Basic
    @Column(name = "bloodgroup")
    private String bloodgroup;
    @Basic
    @Column(name = "riskhistory")
    private Integer riskhistory;
    @Basic
    @Column(name = "riskhistorynote")
    private String riskhistorynote;
    @Basic
    @Column(name = "satelitecentername")
    private String satelitecentername;
    @Basic
    @Column(name = "client")
    private Integer client;
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

    public Integer getProviderid() {
        return providerid;
    }

    public void setProviderid(Integer providerid) {
        this.providerid = providerid;
    }

    public String getHousegrholdingno() {
        return housegrholdingno;
    }

    public void setHousegrholdingno(String housegrholdingno) {
        this.housegrholdingno = housegrholdingno;
    }

    public Long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }

    public Date getLmp() {
        return lmp;
    }

    public void setLmp(Date lmp) {
        this.lmp = lmp;
    }

    public Date getTemplmp() {
        return templmp;
    }

    public void setTemplmp(Date templmp) {
        this.templmp = templmp;
    }

    public Integer getStatuslmp() {
        return statuslmp;
    }

    public void setStatuslmp(Integer statuslmp) {
        this.statuslmp = statuslmp;
    }

    public Date getEdd() {
        return edd;
    }

    public void setEdd(Date edd) {
        this.edd = edd;
    }

    public Integer getPara() {
        return para;
    }

    public void setPara(Integer para) {
        this.para = para;
    }

    public Integer getGravida() {
        return gravida;
    }

    public void setGravida(Integer gravida) {
        this.gravida = gravida;
    }

    public Integer getLastchildage() {
        return lastchildage;
    }

    public void setLastchildage(Integer lastchildage) {
        this.lastchildage = lastchildage;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public Integer getRiskhistory() {
        return riskhistory;
    }

    public void setRiskhistory(Integer riskhistory) {
        this.riskhistory = riskhistory;
    }

    public String getRiskhistorynote() {
        return riskhistorynote;
    }

    public void setRiskhistorynote(String riskhistorynote) {
        this.riskhistorynote = riskhistorynote;
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
        PregwomenEntity that = (PregwomenEntity) o;
        return healthid == that.healthid && pregno == that.pregno && Objects.equals(providerid, that.providerid) && Objects.equals(housegrholdingno, that.housegrholdingno) && Objects.equals(mobileno, that.mobileno) && Objects.equals(lmp, that.lmp) && Objects.equals(templmp, that.templmp) && Objects.equals(statuslmp, that.statuslmp) && Objects.equals(edd, that.edd) && Objects.equals(para, that.para) && Objects.equals(gravida, that.gravida) && Objects.equals(lastchildage, that.lastchildage) && Objects.equals(height, that.height) && Objects.equals(bloodgroup, that.bloodgroup) && Objects.equals(riskhistory, that.riskhistory) && Objects.equals(riskhistorynote, that.riskhistorynote) && Objects.equals(satelitecentername, that.satelitecentername) && Objects.equals(client, that.client) && Objects.equals(systementrydate, that.systementrydate) && Objects.equals(modifydate, that.modifydate) && Objects.equals(uploaddate, that.uploaddate) && Objects.equals(upload, that.upload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthid, pregno, providerid, housegrholdingno, mobileno, lmp, templmp, statuslmp, edd, para, gravida, lastchildage, height, bloodgroup, riskhistory, riskhistorynote, satelitecentername, client, systementrydate, modifydate, uploaddate, upload);
    }
}
