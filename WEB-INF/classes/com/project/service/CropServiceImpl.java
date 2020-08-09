/*     */ package com.project.service;
/*     */ 
/*     */ import com.project.dao.CropDao;
/*     */ import com.project.model.Chemical;
/*     */ import com.project.model.Crop;
/*     */ import com.project.model.Harvest;
/*     */ import com.project.model.Irrigation;
/*     */ import com.project.model.Machinery;
/*     */ import com.project.model.Sales;
/*     */ import java.util.List;
/*     */ import javax.transaction.Transactional;
/*     */ import org.springframework.stereotype.Service;
/*     */ 
/*     */ @Service
/*     */ public class CropServiceImpl implements CropService {
/*     */   private CropDao cropDao;
/*     */   
/*     */   public void setCropDao(CropDao cropDao) {
/*  24 */     this.cropDao = cropDao;
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addCropRecord(Crop crop) {
/*  33 */     this.cropDao.addCropRecord(crop);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addIrrigationRecord(Irrigation irrigiation) {
/*  40 */     this.cropDao.addIrrigationRecord(irrigiation);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addChemicalRecord(Chemical checmical) {
/*  47 */     this.cropDao.addChemicalRecord(checmical);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addMachinneryRecord(Machinery machinery) {
/*  54 */     this.cropDao.addMachinneryRecord(machinery);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addHarvestRecord(Harvest harvest) {
/*  61 */     this.cropDao.addHarvestRecord(harvest);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addSalesRecord(Sales sales) {
/*  68 */     this.cropDao.addSalesRecord(sales);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<Crop> listCropRecords() {
/*  75 */     return this.cropDao.listCropRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<Irrigation> listIrrigationRecords() {
/*  81 */     return this.cropDao.listIrrigationRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<Chemical> listChemicalRecords() {
/*  87 */     return this.cropDao.listChemicalRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<Machinery> listMachineryRecords() {
/*  93 */     return this.cropDao.listMachineryRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<Harvest> listHarvestRecords() {
/*  98 */     return this.cropDao.listHarvestRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<Sales> listSalesRecord() {
/* 104 */     return this.cropDao.listSalesRecord();
/*     */   }
/*     */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\service\CropServiceImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */