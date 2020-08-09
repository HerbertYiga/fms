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
/*    */ @Table(name = "livestockanimalsalerecords")
/*    */ public class LiveStockAnimalSaleRecords {
/*    */   @Id
/*    */   @Column(name = "animalSaleId")
/*    */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*    */   private Long animalSaleId;
/*    */   
/*    */   private Long weightOfAnimal;
/*    */   
/*    */   private Long ageOfAnimal;
/*    */   
/*    */   private Long unitPrice;
/*    */   
/*    */   private String comments;
/*    */   
/*    */   private Long animalId;
/*    */   
/*    */   private String date;
/*    */   
/*    */   public Long getAnimalSaleId() {
/* 36 */     return this.animalSaleId;
/*    */   }
/*    */   
/*    */   public void setAnimalSaleId(Long animalSaleId) {
/* 40 */     this.animalSaleId = animalSaleId;
/*    */   }
/*    */   
/*    */   public Long getWeightOfAnimal() {
/* 44 */     return this.weightOfAnimal;
/*    */   }
/*    */   
/*    */   public void setWeightOfAnimal(Long weightOfAnimal) {
/* 48 */     this.weightOfAnimal = weightOfAnimal;
/*    */   }
/*    */   
/*    */   public Long getAgeOfAnimal() {
/* 52 */     return this.ageOfAnimal;
/*    */   }
/*    */   
/*    */   public void setAgeOfAnimal(Long ageOfAnimal) {
/* 56 */     this.ageOfAnimal = ageOfAnimal;
/*    */   }
/*    */   
/*    */   public String getComments() {
/* 60 */     return this.comments;
/*    */   }
/*    */   
/*    */   public void setComments(String comments) {
/* 64 */     this.comments = comments;
/*    */   }
/*    */   
/*    */   public Long getUnitPrice() {
/* 68 */     return this.unitPrice;
/*    */   }
/*    */   
/*    */   public void setUnitPrice(Long unitPrice) {
/* 72 */     this.unitPrice = unitPrice;
/*    */   }
/*    */   
/*    */   public Long getAnimalId() {
/* 76 */     return this.animalId;
/*    */   }
/*    */   
/*    */   public void setAnimalId(Long animalId) {
/* 80 */     this.animalId = animalId;
/*    */   }
/*    */   
/*    */   public String getDate() {
/* 84 */     return this.date;
/*    */   }
/*    */   
/*    */   public void setDate(String date) {
/* 88 */     this.date = date;
/*    */   }
/*    */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\model\LiveStockAnimalSaleRecords.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */