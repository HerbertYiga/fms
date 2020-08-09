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
/*    */ @Table(name = "harvest")
/*    */ public class Harvest {
/*    */   @Id
/*    */   @Column(name = "harvestId")
/*    */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*    */   private Long harvestId;
/*    */   
/*    */   private String doh;
/*    */   
/*    */   private Long qH;
/*    */   
/*    */   private Long qC;
/*    */   
/*    */   private Long qocadt;
/*    */   
/*    */   private Long qmp;
/*    */   
/*    */   private Long qps;
/*    */   
/*    */   private Long qoub;
/*    */   
/*    */   private String harvestComment;
/*    */   
/*    */   public Long getqH() {
/* 31 */     return this.qH;
/*    */   }
/*    */   
/*    */   public void setqH(Long qH) {
/* 35 */     this.qH = qH;
/*    */   }
/*    */   
/*    */   public Long getQocadt() {
/* 39 */     return this.qocadt;
/*    */   }
/*    */   
/*    */   public void setQocadt(Long qocadt) {
/* 43 */     this.qocadt = qocadt;
/*    */   }
/*    */   
/*    */   public Long getqC() {
/* 47 */     return this.qC;
/*    */   }
/*    */   
/*    */   public void setqC(Long qC) {
/* 51 */     this.qC = qC;
/*    */   }
/*    */   
/*    */   public Long getQmp() {
/* 55 */     return this.qmp;
/*    */   }
/*    */   
/*    */   public void setQmp(Long qmp) {
/* 59 */     this.qmp = qmp;
/*    */   }
/*    */   
/*    */   public Long getQps() {
/* 63 */     return this.qps;
/*    */   }
/*    */   
/*    */   public void setQps(Long qps) {
/* 67 */     this.qps = qps;
/*    */   }
/*    */   
/*    */   public Long getQoub() {
/* 71 */     return this.qoub;
/*    */   }
/*    */   
/*    */   public void setQoub(Long qoub) {
/* 75 */     this.qoub = qoub;
/*    */   }
/*    */   
/*    */   public String getHarvestComment() {
/* 79 */     return this.harvestComment;
/*    */   }
/*    */   
/*    */   public void setHarvestComment(String harvestComment) {
/* 83 */     this.harvestComment = harvestComment;
/*    */   }
/*    */   
/*    */   public String getDoh() {
/* 87 */     return this.doh;
/*    */   }
/*    */   
/*    */   public void setDoh(String doh) {
/* 91 */     this.doh = doh;
/*    */   }
/*    */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\model\Harvest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */