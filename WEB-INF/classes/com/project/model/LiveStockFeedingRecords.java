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
/*    */ @Table(name = "livestockfeedingrecords")
/*    */ public class LiveStockFeedingRecords {
/*    */   @Id
/*    */   @Column(name = "feedId")
/*    */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*    */   private Long feedId;
/*    */   
/*    */   private String date;
/*    */   
/*    */   private String description;
/*    */   
/*    */   private Long weight;
/*    */   
/*    */   private Long numberOfAnimalsFed;
/*    */   
/*    */   public Long getFeedId() {
/* 31 */     return this.feedId;
/*    */   }
/*    */   
/*    */   public void setFeedId(Long feedId) {
/* 35 */     this.feedId = feedId;
/*    */   }
/*    */   
/*    */   public String getDescription() {
/* 39 */     return this.description;
/*    */   }
/*    */   
/*    */   public void setDescription(String description) {
/* 43 */     this.description = description;
/*    */   }
/*    */   
/*    */   public String getDate() {
/* 47 */     return this.date;
/*    */   }
/*    */   
/*    */   public void setDate(String date) {
/* 51 */     this.date = date;
/*    */   }
/*    */   
/*    */   public Long getWeight() {
/* 55 */     return this.weight;
/*    */   }
/*    */   
/*    */   public void setWeight(Long weight) {
/* 59 */     this.weight = weight;
/*    */   }
/*    */   
/*    */   public Long getNumberOfAnimalsFed() {
/* 63 */     return this.numberOfAnimalsFed;
/*    */   }
/*    */   
/*    */   public void setNumberOfAnimalsFed(Long numberOfAnimalsFed) {
/* 67 */     this.numberOfAnimalsFed = numberOfAnimalsFed;
/*    */   }
/*    */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\model\LiveStockFeedingRecords.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */