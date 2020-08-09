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
/*    */ @Table(name = "chemical")
/*    */ public class Chemical {
/*    */   @Id
/*    */   @Column(name = "chemicalId")
/*    */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*    */   private Long chemicalId;
/*    */   
/*    */   private String doi;
/*    */   
/*    */   private String toe;
/*    */   
/*    */   private String toa;
/*    */   
/*    */   private Long qoaa;
/*    */   
/*    */   private String toc;
/*    */   
/*    */   private String chemicalcomment;
/*    */   
/*    */   public Long getChemicalId() {
/* 30 */     return this.chemicalId;
/*    */   }
/*    */   
/*    */   public void setChemicalId(Long chemicalId) {
/* 34 */     this.chemicalId = chemicalId;
/*    */   }
/*    */   
/*    */   public String getChemicalcomment() {
/* 38 */     return this.chemicalcomment;
/*    */   }
/*    */   
/*    */   public void setChemicalcomment(String chemicalcomment) {
/* 42 */     this.chemicalcomment = chemicalcomment;
/*    */   }
/*    */   
/*    */   public String getToc() {
/* 46 */     return this.toc;
/*    */   }
/*    */   
/*    */   public void setToc(String toc) {
/* 50 */     this.toc = toc;
/*    */   }
/*    */   
/*    */   public Long getQoaa() {
/* 54 */     return this.qoaa;
/*    */   }
/*    */   
/*    */   public void setQoaa(Long qoaa) {
/* 58 */     this.qoaa = qoaa;
/*    */   }
/*    */   
/*    */   public String getToa() {
/* 62 */     return this.toa;
/*    */   }
/*    */   
/*    */   public void setToa(String toa) {
/* 66 */     this.toa = toa;
/*    */   }
/*    */   
/*    */   public String getToe() {
/* 70 */     return this.toe;
/*    */   }
/*    */   
/*    */   public void setToe(String toe) {
/* 74 */     this.toe = toe;
/*    */   }
/*    */   
/*    */   public String getDoi() {
/* 78 */     return this.doi;
/*    */   }
/*    */   
/*    */   public void setDoi(String doi) {
/* 82 */     this.doi = doi;
/*    */   }
/*    */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\model\Chemical.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */