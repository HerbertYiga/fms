/*     */ package com.project.model;
/*     */ 
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Entity
/*     */ @Table(name = "irrigation")
/*     */ public class Irrigation {
/*     */   @Id
/*     */   @Column(name = "irrigationId")
/*     */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*     */   private Long irrigationId;
/*     */   
/*     */   private String irrigationdate;
/*     */   
/*     */   private String toc;
/*     */   
/*     */   private Long landCoverage;
/*     */   
/*     */   private String moi;
/*     */   
/*     */   private String sow;
/*     */   
/*     */   private Long qowused;
/*     */   
/*     */   private String taqopused;
/*     */   
/*     */   private String comment;
/*     */   
/*     */   private String crop;
/*     */   
/*     */   public String getIrrigationdate() {
/*  34 */     return this.irrigationdate;
/*     */   }
/*     */   
/*     */   public void setIrrigationdate(String irrigationdate) {
/*  38 */     this.irrigationdate = irrigationdate;
/*     */   }
/*     */   
/*     */   public String getToc() {
/*  42 */     return this.toc;
/*     */   }
/*     */   
/*     */   public void setToc(String toc) {
/*  46 */     this.toc = toc;
/*     */   }
/*     */   
/*     */   public Long getLandCoverage() {
/*  50 */     return this.landCoverage;
/*     */   }
/*     */   
/*     */   public void setLandCoverage(Long landCoverage) {
/*  54 */     this.landCoverage = landCoverage;
/*     */   }
/*     */   
/*     */   public String getMoi() {
/*  58 */     return this.moi;
/*     */   }
/*     */   
/*     */   public void setMoi(String moi) {
/*  62 */     this.moi = moi;
/*     */   }
/*     */   
/*     */   public String getSow() {
/*  66 */     return this.sow;
/*     */   }
/*     */   
/*     */   public void setSow(String sow) {
/*  70 */     this.sow = sow;
/*     */   }
/*     */   
/*     */   public Long getQowused() {
/*  74 */     return this.qowused;
/*     */   }
/*     */   
/*     */   public void setQowused(Long qowused) {
/*  78 */     this.qowused = qowused;
/*     */   }
/*     */   
/*     */   public String getTaqopused() {
/*  82 */     return this.taqopused;
/*     */   }
/*     */   
/*     */   public void setTaqopused(String taqopused) {
/*  86 */     this.taqopused = taqopused;
/*     */   }
/*     */   
/*     */   public String getComment() {
/*  90 */     return this.comment;
/*     */   }
/*     */   
/*     */   public void setComment(String comment) {
/*  94 */     this.comment = comment;
/*     */   }
/*     */   
/*     */   public Long getIrrigationId() {
/*  98 */     return this.irrigationId;
/*     */   }
/*     */   
/*     */   public void setIrrigationId(Long irrigationId) {
/* 102 */     this.irrigationId = irrigationId;
/*     */   }
/*     */   
/*     */   public String getCrop() {
/* 106 */     return this.crop;
/*     */   }
/*     */   
/*     */   public void setCrop(String crop) {
/* 110 */     this.crop = crop;
/*     */   }
/*     */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\model\Irrigation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */