/*     */ package com.project.dao;
/*     */ 
/*     */ import com.project.model.Chemical;
/*     */ import com.project.model.Crop;
/*     */ import com.project.model.Harvest;
/*     */ import com.project.model.Irrigation;
/*     */ import com.project.model.Machinery;
/*     */ import com.project.model.Sales;
/*     */ import java.util.List;
/*     */ import org.hibernate.Session;
/*     */ import org.hibernate.SessionFactory;
/*     */ import org.springframework.stereotype.Repository;
/*     */ 
/*     */ @Repository
/*     */ public class CropDaoImpl implements CropDao {
/*     */   private SessionFactory sessionFactory;
/*     */   
/*     */   public void setSessionFactory(SessionFactory sessionFactory) {
/*  23 */     this.sessionFactory = sessionFactory;
/*     */   }
/*     */   
/*     */   public List<Crop> listCrop() {
/*  29 */     Session session = this.sessionFactory.getCurrentSession();
/*  31 */     List<Crop> list = session.createQuery("from Crop order by cropId desc").list();
/*  32 */     return list;
/*     */   }
/*     */   
/*     */   public void addCropRecord(Crop crop) {
/*  36 */     Session session = this.sessionFactory.getCurrentSession();
/*  37 */     session.saveOrUpdate(crop);
/*     */   }
/*     */   
/*     */   public void addIrrigationRecord(Irrigation irrigation) {
/*  42 */     Session session = this.sessionFactory.getCurrentSession();
/*  43 */     session.saveOrUpdate(irrigation);
/*     */   }
/*     */   
/*     */   public void addChemicalRecord(Chemical chemical) {
/*  48 */     Session session = this.sessionFactory.getCurrentSession();
/*  49 */     session.saveOrUpdate(chemical);
/*     */   }
/*     */   
/*     */   public void addMachinneryRecord(Machinery machinery) {
/*  54 */     Session session = this.sessionFactory.getCurrentSession();
/*  55 */     session.saveOrUpdate(machinery);
/*     */   }
/*     */   
/*     */   public void addHarvestRecord(Harvest harvest) {
/*  59 */     Session session = this.sessionFactory.getCurrentSession();
/*  60 */     session.saveOrUpdate(harvest);
/*     */   }
/*     */   
/*     */   public void addSalesRecord(Sales sales) {
/*  65 */     Session session = this.sessionFactory.getCurrentSession();
/*  66 */     session.saveOrUpdate(sales);
/*     */   }
/*     */   
/*     */   public List<Crop> listCropRecords() {
/*  71 */     Session session = this.sessionFactory.getCurrentSession();
/*  73 */     List<Crop> list = session.createQuery("from Crop order by cropId desc").list();
/*  74 */     return list;
/*     */   }
/*     */   
/*     */   public List<Irrigation> listIrrigationRecords() {
/*  78 */     Session session = this.sessionFactory.getCurrentSession();
/*  80 */     List<Irrigation> list = session.createQuery("from Irrigation order by irrigationId desc").list();
/*  81 */     return list;
/*     */   }
/*     */   
/*     */   public List<Chemical> listChemicalRecords() {
/*  85 */     Session session = this.sessionFactory.getCurrentSession();
/*  87 */     List<Chemical> list = session.createQuery("from  Chemical order by chemicalId desc").list();
/*  88 */     return list;
/*     */   }
/*     */   
/*     */   public List<Machinery> listMachineryRecords() {
/*  92 */     Session session = this.sessionFactory.getCurrentSession();
/*  94 */     List<Machinery> list = session.createQuery("from Machinery order by machinneryId desc").list();
/*  95 */     return list;
/*     */   }
/*     */   
/*     */   public List<Harvest> listHarvestRecords() {
/*  99 */     Session session = this.sessionFactory.getCurrentSession();
/* 101 */     List<Harvest> list = session.createQuery("from Harvest order by harvestId desc").list();
/* 102 */     return list;
/*     */   }
/*     */   
/*     */   public List<Sales> listSalesRecord() {
/* 106 */     Session session = this.sessionFactory.getCurrentSession();
/* 108 */     List<Sales> list = session.createQuery("from Sales order by saleId desc").list();
/* 109 */     return list;
/*     */   }
/*     */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\dao\CropDaoImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */