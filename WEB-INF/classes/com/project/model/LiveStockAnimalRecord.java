/*    */ package com.project.model;
/*    */ 
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "livestockanimalsrecord")
/*    */ public class LiveStockAnimalRecord {
/*    */   @Id
/*    */   @Column(name = "animalId")
/*    */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*    */   private Long animalId;
/*    */   
/*    */   private String animalBreed;
/*    */   
/*    */   private String identificationNo;
/*    */   
/*    */   private String source;
/*    */   
/*    */   private String animalName;
/*    */   
/*    */   private String birthDate;
/*    */   
/*    */   private String dateAnimalRecieved;
/*    */   
/*    */   public Long getAnimalId() {
/* 29 */     return this.animalId;
/*    */   }
/*    */   
/*    */   public void setAnimalId(Long animalId) {
/* 33 */     this.animalId = animalId;
/*    */   }
/*    */   
/*    */   public String getAnimalBreed() {
/* 37 */     return this.animalBreed;
/*    */   }
/*    */   
/*    */   public void setAnimalBreed(String animalBreed) {
/* 41 */     this.animalBreed = animalBreed;
/*    */   }
/*    */   
/*    */   public String getIdentificationNo() {
/* 45 */     return this.identificationNo;
/*    */   }
/*    */   
/*    */   public void setIdentificationNo(String identificationNo) {
/* 49 */     this.identificationNo = identificationNo;
/*    */   }
/*    */   
/*    */   public String getSource() {
/* 53 */     return this.source;
/*    */   }
/*    */   
/*    */   public void setSource(String source) {
/* 57 */     this.source = source;
/*    */   }
/*    */   
/*    */   public String getAnimalName() {
/* 61 */     return this.animalName;
/*    */   }
/*    */   
/*    */   public void setAnimalName(String animalName) {
/* 65 */     this.animalName = animalName;
/*    */   }
/*    */   
/*    */   public String getBirthDate() {
/* 69 */     return this.birthDate;
/*    */   }
/*    */   
/*    */   public void setBirthDate(String birthDate) {
/* 73 */     this.birthDate = birthDate;
/*    */   }
/*    */   
/*    */   public String getDateAnimalRecieved() {
/* 77 */     return this.dateAnimalRecieved;
/*    */   }
/*    */   
/*    */   public void setDateAnimalRecieved(String dateAnimalRecieved) {
/* 81 */     this.dateAnimalRecieved = dateAnimalRecieved;
/*    */   }
/*    */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\model\LiveStockAnimalRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */