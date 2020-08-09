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
/*    */ @Table(name = "livestockmilksalerecords")
/*    */ public class LiveStockMilkSaleRecords {
/*    */   @Id
/*    */   @Column(name = "saleId")
/*    */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*    */   private Long saleId;
/*    */   
/*    */   private String qoms;
/*    */   
/*    */   private Long unitprice;
/*    */   
/*    */   private String comments;
/*    */   
/*    */   private String date;
/*    */   
/*    */   public Long getSaleId() {
/* 31 */     return this.saleId;
/*    */   }
/*    */   
/*    */   public void setSaleId(Long saleId) {
/* 35 */     this.saleId = saleId;
/*    */   }
/*    */   
/*    */   public String getQoms() {
/* 39 */     return this.qoms;
/*    */   }
/*    */   
/*    */   public void setQoms(String qoms) {
/* 43 */     this.qoms = qoms;
/*    */   }
/*    */   
/*    */   public Long getUnitprice() {
/* 47 */     return this.unitprice;
/*    */   }
/*    */   
/*    */   public void setUnitprice(Long unitprice) {
/* 51 */     this.unitprice = unitprice;
/*    */   }
/*    */   
/*    */   public String getComments() {
/* 55 */     return this.comments;
/*    */   }
/*    */   
/*    */   public void setComments(String comments) {
/* 59 */     this.comments = comments;
/*    */   }
/*    */   
/*    */   public String getDate() {
/* 63 */     return this.date;
/*    */   }
/*    */   
/*    */   public void setDate(String date) {
/* 67 */     this.date = date;
/*    */   }
/*    */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\model\LiveStockMilkSaleRecords.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */