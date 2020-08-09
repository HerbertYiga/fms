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
/*     */ @Table(name = "livestockbreeding")
/*     */ public class LiveStockAnimalBreedingRecord {
/*     */   @Id
/*     */   @Column(name = "breedingId")
/*     */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*     */   private Long breedingId;
/*     */   
/*     */   private Long animalId;
/*     */   
/*     */   private String AI;
/*     */   
/*     */   private Long ageAtFirstService;
/*     */   
/*     */   private String dolc;
/*     */   
/*     */   private String doh;
/*     */   
/*     */   private String dos;
/*     */   
/*     */   private String bullName;
/*     */   
/*     */   private String breedOfBul;
/*     */   
/*     */   private String ownerOfBull;
/*     */   
/*     */   private String pregnancyTest;
/*     */   
/*     */   private String resultAndStage;
/*     */   
/*     */   private String aborts;
/*     */   
/*     */   private String dateToDryOff;
/*     */   
/*     */   private String conditionOfCalfAtBirth;
/*     */   
/*     */   private String dateToStreamOff;
/*     */   
/*     */   private String dateToStreamUp;
/*     */   
/*     */   private String expectedDateOfCalving;
/*     */   
/*     */   private String actualDateOfCalving;
/*     */   
/*     */   private Long numberOfCalves;
/*     */   
/*     */   private Long weightOfCalfAtBirth;
/*     */   
/*     */   public Long getAnimalId() {
/*  49 */     return this.animalId;
/*     */   }
/*     */   
/*     */   public void setAnimalId(Long animalId) {
/*  52 */     this.animalId = animalId;
/*     */   }
/*     */   
/*     */   public Long getBreedingId() {
/*  55 */     return this.breedingId;
/*     */   }
/*     */   
/*     */   public void setBreedingId(Long breedingId) {
/*  58 */     this.breedingId = breedingId;
/*     */   }
/*     */   
/*     */   public Long getAgeAtFirstService() {
/*  62 */     return this.ageAtFirstService;
/*     */   }
/*     */   
/*     */   public void setAgeAtFirstService(Long ageAtFirstService) {
/*  66 */     this.ageAtFirstService = ageAtFirstService;
/*     */   }
/*     */   
/*     */   public String getDolc() {
/*  70 */     return this.dolc;
/*     */   }
/*     */   
/*     */   public void setDolc(String dolc) {
/*  74 */     this.dolc = dolc;
/*     */   }
/*     */   
/*     */   public String getDoh() {
/*  78 */     return this.doh;
/*     */   }
/*     */   
/*     */   public void setDoh(String doh) {
/*  82 */     this.doh = doh;
/*     */   }
/*     */   
/*     */   public String getDos() {
/*  86 */     return this.dos;
/*     */   }
/*     */   
/*     */   public void setDos(String dos) {
/*  90 */     this.dos = dos;
/*     */   }
/*     */   
/*     */   public String getBullName() {
/*  94 */     return this.bullName;
/*     */   }
/*     */   
/*     */   public void setBullName(String bullName) {
/*  98 */     this.bullName = bullName;
/*     */   }
/*     */   
/*     */   public String getBreedOfBul() {
/* 102 */     return this.breedOfBul;
/*     */   }
/*     */   
/*     */   public void setBreedOfBul(String breedOfBul) {
/* 106 */     this.breedOfBul = breedOfBul;
/*     */   }
/*     */   
/*     */   public String getOwnerOfBull() {
/* 110 */     return this.ownerOfBull;
/*     */   }
/*     */   
/*     */   public void setOwnerOfBull(String ownerOfBull) {
/* 114 */     this.ownerOfBull = ownerOfBull;
/*     */   }
/*     */   
/*     */   public String getPregnancyTest() {
/* 118 */     return this.pregnancyTest;
/*     */   }
/*     */   
/*     */   public void setPregnancyTest(String pregnancyTest) {
/* 122 */     this.pregnancyTest = pregnancyTest;
/*     */   }
/*     */   
/*     */   public String getResultAndStage() {
/* 126 */     return this.resultAndStage;
/*     */   }
/*     */   
/*     */   public void setResultAndStage(String resultAndStage) {
/* 130 */     this.resultAndStage = resultAndStage;
/*     */   }
/*     */   
/*     */   public String getDateToDryOff() {
/* 135 */     return this.dateToDryOff;
/*     */   }
/*     */   
/*     */   public void setDateToDryOff(String dateToDryOff) {
/* 139 */     this.dateToDryOff = dateToDryOff;
/*     */   }
/*     */   
/*     */   public String getDateToStreamOff() {
/* 143 */     return this.dateToStreamOff;
/*     */   }
/*     */   
/*     */   public void setDateToStreamOff(String dateToStreamOff) {
/* 147 */     this.dateToStreamOff = dateToStreamOff;
/*     */   }
/*     */   
/*     */   public String getDateToStreamUp() {
/* 151 */     return this.dateToStreamUp;
/*     */   }
/*     */   
/*     */   public void setDateToStreamUp(String dateToStreamUp) {
/* 155 */     this.dateToStreamUp = dateToStreamUp;
/*     */   }
/*     */   
/*     */   public String getExpectedDateOfCalving() {
/* 159 */     return this.expectedDateOfCalving;
/*     */   }
/*     */   
/*     */   public void setExpectedDateOfCalving(String expectedDateOfCalving) {
/* 163 */     this.expectedDateOfCalving = expectedDateOfCalving;
/*     */   }
/*     */   
/*     */   public Long getNumberOfCalves() {
/* 167 */     return this.numberOfCalves;
/*     */   }
/*     */   
/*     */   public void setNumberOfCalves(Long numberOfCalves) {
/* 171 */     this.numberOfCalves = numberOfCalves;
/*     */   }
/*     */   
/*     */   public String getActualDateOfCalving() {
/* 175 */     return this.actualDateOfCalving;
/*     */   }
/*     */   
/*     */   public void setActualDateOfCalving(String actualDateOfCalving) {
/* 179 */     this.actualDateOfCalving = actualDateOfCalving;
/*     */   }
/*     */   
/*     */   public Long getWeightOfCalfAtBirth() {
/* 183 */     return this.weightOfCalfAtBirth;
/*     */   }
/*     */   
/*     */   public void setWeightOfCalfAtBirth(Long weightOfCalfAtBirth) {
/* 187 */     this.weightOfCalfAtBirth = weightOfCalfAtBirth;
/*     */   }
/*     */   
/*     */   public String getAborts() {
/* 191 */     return this.aborts;
/*     */   }
/*     */   
/*     */   public void setAborts(String aborts) {
/* 195 */     this.aborts = aborts;
/*     */   }
/*     */   
/*     */   public String getAI() {
/* 199 */     return this.AI;
/*     */   }
/*     */   
/*     */   public void setAI(String aI) {
/* 203 */     this.AI = aI;
/*     */   }
/*     */   
/*     */   public String getConditionOfCalfAtBirth() {
/* 207 */     return this.conditionOfCalfAtBirth;
/*     */   }
/*     */   
/*     */   public void setConditionOfCalfAtBirth(String conditionOfCalfAtBirth) {
/* 211 */     this.conditionOfCalfAtBirth = conditionOfCalfAtBirth;
/*     */   }
/*     */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\model\LiveStockAnimalBreedingRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */