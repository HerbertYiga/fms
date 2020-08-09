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
/*     */ @Table(name = "livestockcalfrecords")
/*     */ public class LiveStockCalfRecords {
/*     */   @Id
/*     */   @Column(name = "calfId")
/*     */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*     */   private Long calfId;
/*     */   
/*     */   private String breedOfCalf;
/*     */   
/*     */   private String calfName;
/*     */   
/*     */   private String dob;
/*     */   
/*     */   private String mnab;
/*     */   
/*     */   private String fnab;
/*     */   
/*     */   private String weightAtNineMonths;
/*     */   
/*     */   private Long weightAtBirth;
/*     */   
/*     */   private String conditionAtBirth;
/*     */   
/*     */   private String sexOfCalf;
/*     */   
/*     */   private String dateOfWeaning;
/*     */   
/*     */   private Long weightAtWeaning;
/*     */   
/*     */   private Long weightAtThreeMonths;
/*     */   
/*     */   private Long weightAtFiveMonths;
/*     */   
/*     */   private Long weightAtSevenMonths;
/*     */   
/*     */   private Long weightAtTwelveMonths;
/*     */   
/*     */   private Long ageAtFirstService;
/*     */   
/*     */   public Long getCalfId() {
/*  40 */     return this.calfId;
/*     */   }
/*     */   
/*     */   public void setCalfId(Long calfId) {
/*  43 */     this.calfId = calfId;
/*     */   }
/*     */   
/*     */   public String getBreedOfCalf() {
/*  46 */     return this.breedOfCalf;
/*     */   }
/*     */   
/*     */   public void setBreedOfCalf(String breedOfCalf) {
/*  49 */     this.breedOfCalf = breedOfCalf;
/*     */   }
/*     */   
/*     */   public String getCalfName() {
/*  52 */     return this.calfName;
/*     */   }
/*     */   
/*     */   public void setCalfName(String calfName) {
/*  55 */     this.calfName = calfName;
/*     */   }
/*     */   
/*     */   public String getDob() {
/*  58 */     return this.dob;
/*     */   }
/*     */   
/*     */   public void setDob(String dob) {
/*  61 */     this.dob = dob;
/*     */   }
/*     */   
/*     */   public String getMnab() {
/*  64 */     return this.mnab;
/*     */   }
/*     */   
/*     */   public void setMnab(String mnab) {
/*  67 */     this.mnab = mnab;
/*     */   }
/*     */   
/*     */   public String getFnab() {
/*  70 */     return this.fnab;
/*     */   }
/*     */   
/*     */   public void setFnab(String fnab) {
/*  73 */     this.fnab = fnab;
/*     */   }
/*     */   
/*     */   public Long getWeightAtBirth() {
/*  76 */     return this.weightAtBirth;
/*     */   }
/*     */   
/*     */   public void setWeightAtBirth(Long weightAtBirth) {
/*  79 */     this.weightAtBirth = weightAtBirth;
/*     */   }
/*     */   
/*     */   public String getConditionAtBirth() {
/*  82 */     return this.conditionAtBirth;
/*     */   }
/*     */   
/*     */   public void setConditionAtBirth(String conditionAtBirth) {
/*  85 */     this.conditionAtBirth = conditionAtBirth;
/*     */   }
/*     */   
/*     */   public String getSexOfCalf() {
/*  88 */     return this.sexOfCalf;
/*     */   }
/*     */   
/*     */   public void setSexOfCalf(String sexOfCalf) {
/*  91 */     this.sexOfCalf = sexOfCalf;
/*     */   }
/*     */   
/*     */   public String getDateOfWeaning() {
/*  94 */     return this.dateOfWeaning;
/*     */   }
/*     */   
/*     */   public void setDateOfWeaning(String dateOfWeaning) {
/*  97 */     this.dateOfWeaning = dateOfWeaning;
/*     */   }
/*     */   
/*     */   public Long getWeightAtWeaning() {
/* 100 */     return this.weightAtWeaning;
/*     */   }
/*     */   
/*     */   public void setWeightAtWeaning(Long weightAtWeaning) {
/* 103 */     this.weightAtWeaning = weightAtWeaning;
/*     */   }
/*     */   
/*     */   public Long getWeightAtThreeMonths() {
/* 106 */     return this.weightAtThreeMonths;
/*     */   }
/*     */   
/*     */   public void setWeightAtThreeMonths(Long weightAtThreeMonths) {
/* 109 */     this.weightAtThreeMonths = weightAtThreeMonths;
/*     */   }
/*     */   
/*     */   public Long getWeightAtFiveMonths() {
/* 112 */     return this.weightAtFiveMonths;
/*     */   }
/*     */   
/*     */   public void setWeightAtFiveMonths(Long weightAtFiveMonths) {
/* 115 */     this.weightAtFiveMonths = weightAtFiveMonths;
/*     */   }
/*     */   
/*     */   public Long getWeightAtSevenMonths() {
/* 118 */     return this.weightAtSevenMonths;
/*     */   }
/*     */   
/*     */   public void setWeightAtSevenMonths(Long weightAtSevenMonths) {
/* 121 */     this.weightAtSevenMonths = weightAtSevenMonths;
/*     */   }
/*     */   
/*     */   public Long getWeightAtTwelveMonths() {
/* 124 */     return this.weightAtTwelveMonths;
/*     */   }
/*     */   
/*     */   public void setWeightAtTwelveMonths(Long weightAtTwelveMonths) {
/* 127 */     this.weightAtTwelveMonths = weightAtTwelveMonths;
/*     */   }
/*     */   
/*     */   public Long getAgeAtFirstService() {
/* 130 */     return this.ageAtFirstService;
/*     */   }
/*     */   
/*     */   public void setAgeAtFirstService(Long ageAtFirstService) {
/* 133 */     this.ageAtFirstService = ageAtFirstService;
/*     */   }
/*     */   
/*     */   public String getWeightAtNineMonths() {
/* 137 */     return this.weightAtNineMonths;
/*     */   }
/*     */   
/*     */   public void setWeightAtNineMonths(String weightAtNineMonths) {
/* 141 */     this.weightAtNineMonths = weightAtNineMonths;
/*     */   }
/*     */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\model\LiveStockCalfRecords.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */