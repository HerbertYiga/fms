/*    */ package com.project.model;
/*    */ 
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ import javax.persistence.Transient;
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "livestockflock")
/*    */ public class LiveStockFlockRecords {
/*    */   @Id
/*    */   @Column(name = "flockId")
/*    */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*    */   private Long flockId;
/*    */   
/*    */   private Long noda;
/*    */   
/*    */   private Long nora;
/*    */   
/*    */   private String reason;
/*    */   
/*    */   private Long noaah;
/*    */   
/*    */   @Transient
/*    */   private Long totalNoAnimals;
/*    */   
/*    */   private String typeOfAnimals;
/*    */   
/*    */   private String date;
/*    */   
/*    */   public Long getFlockId() {
/* 35 */     return this.flockId;
/*    */   }
/*    */   
/*    */   public void setFlockId(Long flockId) {
/* 39 */     this.flockId = flockId;
/*    */   }
/*    */   
/*    */   public Long getNoda() {
/* 43 */     return this.noda;
/*    */   }
/*    */   
/*    */   public void setNoda(Long noda) {
/* 47 */     this.noda = noda;
/*    */   }
/*    */   
/*    */   public Long getNora() {
/* 51 */     return this.nora;
/*    */   }
/*    */   
/*    */   public void setNora(Long nora) {
/* 55 */     this.nora = nora;
/*    */   }
/*    */   
/*    */   public String getReason() {
/* 59 */     return this.reason;
/*    */   }
/*    */   
/*    */   public void setReason(String reason) {
/* 63 */     this.reason = reason;
/*    */   }
/*    */   
/*    */   public Long getNoaah() {
/* 67 */     return this.noaah;
/*    */   }
/*    */   
/*    */   public void setNoaah(Long noaah) {
/* 71 */     this.noaah = noaah;
/*    */   }
/*    */   
/*    */   public Long getTotalNoAnimals() {
/* 75 */     return this.totalNoAnimals;
/*    */   }
/*    */   
/*    */   public void setTotalNoAnimals(Long totalNoAnimals) {
/* 79 */     this.totalNoAnimals = totalNoAnimals;
/*    */   }
/*    */   
/*    */   public String getTypeOfAnimals() {
/* 83 */     return this.typeOfAnimals;
/*    */   }
/*    */   
/*    */   public void setTypeOfAnimals(String typeOfAnimals) {
/* 87 */     this.typeOfAnimals = typeOfAnimals;
/*    */   }
/*    */   
/*    */   public String getDate() {
/* 91 */     return this.date;
/*    */   }
/*    */   
/*    */   public void setDate(String date) {
/* 95 */     this.date = date;
/*    */   }
/*    */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\model\LiveStockFlockRecords.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */