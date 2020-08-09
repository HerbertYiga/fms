/*     */ package com.project.service;
/*     */ 
/*     */ import com.project.dao.LiveStockDao;
/*     */ import com.project.model.LiveStockAnimalBreedingRecord;
/*     */ import com.project.model.LiveStockAnimalRecord;
/*     */ import com.project.model.LiveStockAnimalSaleRecords;
/*     */ import com.project.model.LiveStockCalfRecords;
/*     */ import com.project.model.LiveStockFeedingRecords;
/*     */ import com.project.model.LiveStockFlockRecords;
/*     */ import com.project.model.LiveStockMilkSaleRecords;
/*     */ import com.project.model.LiveStockMlkProductionRecords;
/*     */ import com.project.model.LiveStockMortalityRecords;
/*     */ import com.project.model.LiveStockPermitRecords;
/*     */ import com.project.model.LivestockHealthRecords;
/*     */ import java.util.List;
/*     */ import javax.transaction.Transactional;
/*     */ import org.springframework.stereotype.Service;
/*     */ 
/*     */ @Service
/*     */ public class LiveStockServiceImpl implements LiveStockService {
/*     */   private LiveStockDao liveStockDao;
/*     */   
/*     */   public void setLiveStockDao(LiveStockDao liveStockDao) {
/*  30 */     this.liveStockDao = liveStockDao;
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addAnimalSaleRecords(LiveStockAnimalSaleRecords animalSaleRecords) {
/*  37 */     this.liveStockDao.addAnimalSaleRecords(animalSaleRecords);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addFeedingRecords(LiveStockFeedingRecords feedingRecords) {
/*  44 */     this.liveStockDao.addFeedingRecords(feedingRecords);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addHealthRecord(LivestockHealthRecords healthRecords) {
/*  51 */     this.liveStockDao.addHealthRecord(healthRecords);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addPermitRecords(LiveStockPermitRecords permitRecords) {
/*  58 */     this.liveStockDao.addPermitRecords(permitRecords);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addMortalityRecord(LiveStockMortalityRecords mortalityRecords) {
/*  64 */     this.liveStockDao.addMortalityRecord(mortalityRecords);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addProductionRecord(LiveStockMlkProductionRecords milkProductionRecords) {
/*  70 */     this.liveStockDao.addProductionRecord(milkProductionRecords);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addMilkSaleRecord(LiveStockMilkSaleRecords milkRecords) {
/*  77 */     this.liveStockDao.addMilkSaleRecord(milkRecords);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addCalfRecord(LiveStockCalfRecords calfRecords) {
/*  84 */     this.liveStockDao.addCalfRecord(calfRecords);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addBreedingRecord(LiveStockAnimalBreedingRecord liveStockBreedingRecords) {
/*  91 */     this.liveStockDao.addBreedingRecord(liveStockBreedingRecords);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addFlockRecord(LiveStockFlockRecords liveStockFlockRecord) {
/*  98 */     this.liveStockDao.addFlockRecord(liveStockFlockRecord);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addAnimalRecord(LiveStockAnimalRecord animalRecord) {
/* 105 */     this.liveStockDao.addAnimalRecord(animalRecord);
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<Object[]> getBreedingRecords() {
/* 113 */     return this.liveStockDao.getBreedingRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<LiveStockAnimalRecord> listAnimalsRecords() {
/* 120 */     return this.liveStockDao.listAnimalsRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<LiveStockFlockRecords> listFlockRecords() {
/* 127 */     return this.liveStockDao.listFlockRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<LiveStockCalfRecords> getCalfRecords() {
/* 133 */     return this.liveStockDao.getCalfRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<LiveStockAnimalSaleRecords> getAnimalSaleRecords() {
/* 139 */     return this.liveStockDao.getAnimalSaleRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<LiveStockFeedingRecords> getFeedingRecords() {
/* 145 */     return this.liveStockDao.getFeedingRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<LivestockHealthRecords> getHealthRecords() {
/* 151 */     return this.liveStockDao.getHealthRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<LiveStockPermitRecords> getPermitRecords() {
/* 157 */     return this.liveStockDao.getPermitRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<LiveStockMortalityRecords> mortalityRecords() {
/* 163 */     return this.liveStockDao.getMortalityRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<LiveStockMlkProductionRecords> getMilkProductionRecords() {
/* 169 */     return this.liveStockDao.getMilkProductionRecords();
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public List<LiveStockMilkSaleRecords> getMilkRecords() {
/* 174 */     return this.liveStockDao.getMilkRecords();
/*     */   }
/*     */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\service\LiveStockServiceImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */