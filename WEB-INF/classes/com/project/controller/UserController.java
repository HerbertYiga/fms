/*     */ package com.project.controller;
/*     */ 
/*     */ import com.project.model.Chemical;
/*     */ import com.project.model.Crop;
/*     */ import com.project.model.Harvest;
/*     */ import com.project.model.Irrigation;
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
/*     */ import com.project.model.Machinery;
/*     */ import com.project.model.OpenModel;
/*     */ import com.project.model.Sales;
/*     */ import com.project.service.CropService;
/*     */ import com.project.service.LiveStockService;
/*     */ import com.project.service.UserService;
/*     */ import java.util.List;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.beans.factory.annotation.Qualifier;
/*     */ import org.springframework.stereotype.Controller;
/*     */ import org.springframework.ui.Model;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ 
/*     */ @Controller
/*     */ public class UserController {
/*     */   private UserService userService;
/*     */   
/*     */   private CropService cropService;
/*     */   
/*     */   private LiveStockService liveStockService;
/*     */   
/*     */   @Autowired(required = true)
/*     */   @Qualifier("liveStockService")
/*     */   public void setCropService(LiveStockService liveStockService) {
/*  48 */     this.liveStockService = liveStockService;
/*     */   }
/*     */   
/*     */   @Autowired(required = true)
/*     */   @Qualifier("cropService")
/*     */   public void setCropService(CropService cropService) {
/*  56 */     this.cropService = cropService;
/*     */   }
/*     */   
/*     */   @Autowired(required = true)
/*     */   @Qualifier("userService")
/*     */   public void setUserService(UserService userService) {
/*  64 */     this.userService = userService;
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSaveLivestockanimalsaleRecords"})
/*     */   public String userSaveLivestockanimalsaleRecords(LiveStockAnimalSaleRecords liveStockAnimalSaleRecords) {
/*  72 */     this.liveStockService.addAnimalSaleRecords(liveStockAnimalSaleRecords);
/*  74 */     return "redirect:/userViewLivestockAnimalSaleRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSaveLivestockPermitRecords"})
/*     */   public String userSaveLivestockPermitRecords(LiveStockPermitRecords liveStockPermitRecords) {
/*  80 */     this.liveStockService.addPermitRecords(liveStockPermitRecords);
/*  82 */     return "redirect:/userViewLivestockPermitRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSaveLivestockMilkSaleRecords"})
/*     */   public String userSaveLivestockMilkProductionRecords(LiveStockMilkSaleRecords liveStockMilkSaleRecords) {
/*  88 */     this.liveStockService.addMilkSaleRecord(liveStockMilkSaleRecords);
/*  90 */     return "redirect:/userViewLivestockMilkSaleRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSaveLivestockMilkProductionRecords"})
/*     */   public String userSaveLivestockMilkProductionRecords(LiveStockMlkProductionRecords liveStockMilkProductionRecords) {
/*  96 */     this.liveStockService.addProductionRecord(liveStockMilkProductionRecords);
/*  98 */     return "redirect:/userViewLivestockMilkProductionRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSaveLivestockMortalityRecords"})
/*     */   public String userSaveLivestockMortalityRecords(LiveStockMortalityRecords liveStockMortalityRecords) {
/* 104 */     this.liveStockService.addMortalityRecord(liveStockMortalityRecords);
/* 106 */     return "redirect:/userViewLivestockMortalityRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSaveLivestockHealthRecords"})
/*     */   public String userSaveLivestockHealthRecords(LivestockHealthRecords liveStockhealthRecords) {
/* 112 */     this.liveStockService.addHealthRecord(liveStockhealthRecords);
/* 114 */     return "redirect:/userViewLivestockHealthRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSaveLivestockFeedingRecords"})
/*     */   public String userSaveLivestockFeedingRecords(LiveStockFeedingRecords liveStockFeedingRecords) {
/* 120 */     this.liveStockService.addFeedingRecords(liveStockFeedingRecords);
/* 122 */     return "redirect:/userViewLivestockFeedingRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSaveLivestockCalfRecords"})
/*     */   public String userSaveLivestockCalfRecords(LiveStockCalfRecords liveStockCalfRecords) {
/* 128 */     this.liveStockService.addCalfRecord(liveStockCalfRecords);
/* 130 */     return "redirect:/userViewLivestockCalfRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSaveLivestockBreedingRecords"})
/*     */   public String userSaveLivestockBreedingRecords(LiveStockAnimalBreedingRecord liveStockBreedingRecords) {
/* 136 */     this.liveStockService.addBreedingRecord(liveStockBreedingRecords);
/* 138 */     return "redirect:/userViewLivestockBreedingRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSaveLivestockFlockRecords"})
/*     */   public String userSaveLivestockFlockRecords(LiveStockFlockRecords liveStockFlockRecords) {
/* 144 */     this.liveStockService.addFlockRecord(liveStockFlockRecords);
/* 146 */     return "redirect:/userViewLivestockFlockRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSaveLivestockAnimalRecords"})
/*     */   public String userSaveLivestockRecords(LiveStockAnimalRecord livestockanimalrecord) {
/* 153 */     this.liveStockService.addAnimalRecord(livestockanimalrecord);
/* 155 */     return "redirect:/userViewLivestockAnimalRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userLivestockAnimalSaleRecords"})
/*     */   public String userLivestockAnimalSaleRecords(Model model) {
/* 162 */     List<LiveStockAnimalRecord> list = this.liveStockService.listAnimalsRecords();
/* 164 */     model.addAttribute("list", list);
/* 166 */     return "userLivestockAnimalSaleRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userLivestockPermitRecords"})
/*     */   public String userLivestockPermitRecords(Model model) {
/* 172 */     List<LiveStockAnimalRecord> list = this.liveStockService.listAnimalsRecords();
/* 174 */     model.addAttribute("list", list);
/* 176 */     return "userLivestockPermitRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userLivestockMilkSaleRecords"})
/*     */   public String userLivestockMilkSaleRecords(Model model) {
/* 183 */     return "userLivestockMilkSaleRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userLivestockMilkProductionRecords"})
/*     */   public String userLivestockMilkProductionRecords(Model model) {
/* 189 */     List<LiveStockAnimalRecord> list = this.liveStockService.listAnimalsRecords();
/* 191 */     model.addAttribute("list", list);
/* 193 */     return "userLivestockMilkProductionRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userLivestockMortalityRecords"})
/*     */   public String userLivestockMortalityRecords(Model model) {
/* 199 */     List<LiveStockAnimalRecord> list = this.liveStockService.listAnimalsRecords();
/* 201 */     model.addAttribute("list", list);
/* 203 */     return "userLivestockMortalityRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userLivestockFeedingRecords"})
/*     */   public String userLivestockFeedingRecords(Model model) {
/* 210 */     return "userLivestockFeedingRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userLivestockCalfRecords"})
/*     */   public String userLivestockCalfRecords(Model model) {
/* 217 */     return "userLivestockCalfRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userLivestockFlockNumberRecords"})
/*     */   public String userLivestockFlockNumberRecords(Model model) {
/* 224 */     return "userLivestockFlockNumberRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userLivestockBreedingRecords"})
/*     */   public String userLivestockBreedingRecords(Model model) {
/* 230 */     List<LiveStockAnimalRecord> list = this.liveStockService.listAnimalsRecords();
/* 232 */     model.addAttribute("list", list);
/* 234 */     return "userLivestockBreedingRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userLivestockAnimalRecord"})
/*     */   public String userLivestockAnimalRecord() {
/* 241 */     return "userLivestockAnimalRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewLivestockAnimalSaleRecords"})
/*     */   public String userViewLivestockAnimalSaleRecords(Model model) {
/* 249 */     List<LiveStockAnimalSaleRecords> list = this.liveStockService.getAnimalSaleRecords();
/* 250 */     model.addAttribute("list", list);
/* 252 */     return "userViewLivestockAnimalSaleRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewLivestockPermitRecords"})
/*     */   public String userViewLivestockPermitRecords(Model model) {
/* 258 */     List<LiveStockPermitRecords> list = this.liveStockService.getPermitRecords();
/* 259 */     model.addAttribute("list", list);
/* 261 */     return "userViewLivestockPermitRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewLivestockMilkSaleRecords"})
/*     */   public String userViewLivestockMilkSaleRecords(Model model) {
/* 267 */     List<LiveStockMilkSaleRecords> list = this.liveStockService.getMilkRecords();
/* 268 */     model.addAttribute("list", list);
/* 270 */     return "userViewLivestockMilkSaleRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewLivestockMilkProductionRecords"})
/*     */   public String userViewLivestockMilkProductionRecords(Model model) {
/* 277 */     return "userViewLivestockMilkProductionRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewLivestockMortalityRecords"})
/*     */   public String userViewLivestockMortalityRecords(Model model) {
/* 284 */     return "userViewLivestockMortalityRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewLivestockHealthRecords"})
/*     */   public String userViewLivestockHealthRecords(Model model) {
/* 290 */     List<LivestockHealthRecords> list = this.liveStockService.getHealthRecords();
/* 291 */     model.addAttribute("list", list);
/* 292 */     return "userViewLivestockHealthRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewLivestockFeedingRecords"})
/*     */   public String userViewLivestockFeedingRecords(Model model) {
/* 298 */     List<LiveStockFeedingRecords> list = this.liveStockService.getFeedingRecords();
/* 299 */     model.addAttribute("list", list);
/* 300 */     return "userViewLivestockFeedingRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewLivestockCalfRecords"})
/*     */   public String userViewLivestockCalfRecords(Model model) {
/* 306 */     List<LiveStockCalfRecords> list = this.liveStockService.getCalfRecords();
/* 307 */     model.addAttribute("list", list);
/* 308 */     return "userViewLivestockCalfRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewLivestockBreedingRecords"})
/*     */   public String userViewLivestockBreedingRecords(Model model) {
/* 315 */     return "userViewLivestockBreedingRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewLivestockFlockRecords"})
/*     */   public String userViewLivestockFlockRecord(Model model) {
/* 321 */     List<LiveStockFlockRecords> list = this.liveStockService.listFlockRecords();
/* 322 */     model.addAttribute("list", list);
/* 324 */     return "userViewLiveStockFlockRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewLivestockAnimalRecord"})
/*     */   public String userViewLivestockAnimalRecord(Model model) {
/* 330 */     List<LiveStockAnimalRecord> list = this.liveStockService.listAnimalsRecords();
/* 331 */     model.addAttribute("list", list);
/* 333 */     return "userViewLivestockAnimalRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userCheckLiveStockRecord"})
/*     */   public String userCheckLiveStockRecord(OpenModel openModel) {
/* 341 */     if (openModel.getRecordType().equals("livestockanimalsaleRecords"))
/* 342 */       return "redirect:/userLivestockAnimalSaleRecords"; 
/* 346 */     if (openModel.getRecordType().equals("livestockpermitRecords"))
/* 347 */       return "redirect:/userLivestockPermitRecords"; 
/* 351 */     if (openModel.getRecordType().equals("livestockmilksaleRecords"))
/* 352 */       return "redirect:/userLivestockMilkSaleRecords"; 
/* 356 */     if (openModel.getRecordType().equals("livestockmilkproductionRecords"))
/* 357 */       return "redirect:/userLivestockMilkProductionRecords"; 
/* 361 */     if (openModel.getRecordType().equals("livestockmortalityRecords"))
/* 362 */       return "redirect:/userLivestockMortalityRecords"; 
/* 366 */     if (openModel.getRecordType().equals("livestockhealthRecords"))
/* 367 */       return "redirect:/userLivestockHealthRecords"; 
/* 371 */     if (openModel.getRecordType().equals("livestockanimalrecord"))
/* 372 */       return "redirect:/userLivestockAnimalRecord"; 
/* 376 */     if (openModel.getRecordType().equals("livestockflockrecord"))
/* 377 */       return "redirect:/userLivestockFlockNumberRecords"; 
/* 380 */     if (openModel.getRecordType().equals("livestockbreedingrecord"))
/* 381 */       return "redirect:/userLivestockBreedingRecords"; 
/* 385 */     if (openModel.getRecordType().equals("livestockcalfrecord"))
/* 386 */       return "redirect:/userLivestockCalfRecords"; 
/* 389 */     if (openModel.getRecordType().equals("livestockfeedingRecords"))
/* 390 */       return "redirect:/userLivestockFeedingRecords"; 
/* 394 */     return "null";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userCheckCropRecord"})
/*     */   public String userCheckCropRecord(OpenModel openModel) {
/* 405 */     if (openModel.getRecordType().equals("croprecord"))
/* 406 */       return "redirect:/userCroppingRecord"; 
/* 410 */     if (openModel.getRecordType().equals("irrigationrecord"))
/* 411 */       return "redirect:/userIrrigationRecord"; 
/* 414 */     if (openModel.getRecordType().equals("chemicalrecord"))
/* 415 */       return "redirect:/userChemicalInputRecord"; 
/* 419 */     if (openModel.getRecordType().equals("machineryrecord"))
/* 420 */       return "redirect:/userMachineAndEquipmentRecord"; 
/* 423 */     if (openModel.getRecordType().equals("harvestrecord"))
/* 424 */       return "redirect:/userHarvestOrProductionRecord"; 
/* 427 */     if (openModel.getRecordType().equals("cropsalesrecord"))
/* 428 */       return "redirect:/userCropSaleRecord"; 
/* 431 */     return "null";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userCroppingRecord"})
/*     */   public String userCroppingRecord() {
/* 438 */     return "userCroppingRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userIrrigationRecord"})
/*     */   public String userIrrigationRecord() {
/* 445 */     return "userIrrigationRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userChemicalInputRecord"})
/*     */   public String userChemicalInputReecord() {
/* 452 */     return "userChemicalInputRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userMachineAndEquipmentRecord"})
/*     */   public String userMachineAndEquipmentRecord() {
/* 459 */     return "userMachineAndEquipmentRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userHarvestOrProductionRecord"})
/*     */   public String userHarvestOrProductionRecord() {
/* 466 */     return "userHarvestOrProductionRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userCropSaleRecord"})
/*     */   public String userCropSaleRecord() {
/* 473 */     return "userCropSaleRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userAddMachinery"})
/*     */   public String userAddMachinery(Machinery machinery) {
/* 481 */     this.cropService.addMachinneryRecord(machinery);
/* 482 */     return "redirect:/userViewMachineryRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userAddChemicalRecord"})
/*     */   public String userAddChemicalRecord(Chemical chemical) {
/* 489 */     this.cropService.addChemicalRecord(chemical);
/* 490 */     return "redirect:/userViewChemicalRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userAddSalesRecord"})
/*     */   public String userAddSalesRecord(Sales sales) {
/* 497 */     this.cropService.addSalesRecord(sales);
/* 498 */     return "redirect:/userViewSalesRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userAddHarvestRecord"})
/*     */   public String userHarvestRecord(Harvest harvest) {
/* 505 */     this.cropService.addHarvestRecord(harvest);
/* 506 */     return "redirect:/userViewHarvestRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userAddCropRecord"})
/*     */   public String userAddCropRecords(Crop crop) {
/* 513 */     this.cropService.addCropRecord(crop);
/* 514 */     return "redirect:/userViewCropRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userAddIrrigationRecord"})
/*     */   public String userAddIrrigationRecords(Irrigation irrigation) {
/* 521 */     this.cropService.addIrrigationRecord(irrigation);
/* 522 */     return "redirect:/userViewIrrigationRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewMachineryRecords"})
/*     */   public String userViewMachineryRecord(Model model) {
/* 530 */     List<Machinery> list = this.cropService.listMachineryRecords();
/* 531 */     model.addAttribute("list", list);
/* 533 */     return "userViewMachineryRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewChemicalRecords"})
/*     */   public String userViewChemicalRecords(Model model) {
/* 539 */     List<Chemical> list = this.cropService.listChemicalRecords();
/* 540 */     model.addAttribute("list", list);
/* 542 */     return "userViewChemicalRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewSalesRecords"})
/*     */   public String userViewSalesRecords(Model model) {
/* 548 */     List<Sales> list = this.cropService.listSalesRecord();
/* 549 */     model.addAttribute("list", list);
/* 551 */     return "userViewSalesRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewHarvestRecords"})
/*     */   public String userViewHarvestRecords(Model model) {
/* 557 */     List<Harvest> list = this.cropService.listHarvestRecords();
/* 558 */     model.addAttribute("list", list);
/* 560 */     return "userViewHarvestRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewCropRecords"})
/*     */   public String userViewCropRecords(Model model) {
/* 566 */     List<Crop> list = this.cropService.listCropRecords();
/* 567 */     model.addAttribute("list", list);
/* 569 */     return "userViewCropRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userViewIrrigationRecords"})
/*     */   public String userViewIrrigationRecords(Model model) {
/* 575 */     List<Irrigation> list = this.cropService.listIrrigationRecords();
/* 576 */     model.addAttribute("list", list);
/* 578 */     return "userViewIrrigationRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userCheckPoultryRecord"})
/*     */   public String userCheckPoultryRecord(OpenModel openModel) {
/* 589 */     if (openModel.getRecordType().equals("flockrecord"))
/* 590 */       return "redirect:/userFlockNumberRecords"; 
/* 594 */     if (openModel.getRecordType().equals("stockrecord"))
/* 595 */       return "redirect:/userStockRecords"; 
/* 598 */     if (openModel.getRecordType().equals("feedsrecord"))
/* 599 */       return "redirect:/userFeedRecords"; 
/* 603 */     if (openModel.getRecordType().equals("vaccnationrecord"))
/* 604 */       return "redirect:/userVaccinationRecords"; 
/* 607 */     if (openModel.getRecordType().equals("poultryhealthrecord"))
/* 608 */       return "redirect:/userPoultryAndHealthRecord"; 
/* 611 */     if (openModel.getRecordType().equals("eggproductionrecord"))
/* 612 */       return "redirect:/userEggProductionRecords"; 
/* 615 */     if (openModel.getRecordType().equals("eggrading"))
/* 616 */       return "redirect:/userEggGradingRecords"; 
/* 619 */     if (openModel.getRecordType().equals("eggsalerecord"))
/* 620 */       return "redirect:/userEggSaleRecords"; 
/* 623 */     if (openModel.getRecordType().equals("chikensalerecord"))
/* 624 */       return "redirect:/userChikenSaleRecords"; 
/* 627 */     return "null";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userFlockNumberRecords"})
/*     */   public String userFlockNumberRecords() {
/* 634 */     return "userFlockNumberRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userStockRecords"})
/*     */   public String userStockRecords() {
/* 641 */     return "userStockRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userFeedRecords"})
/*     */   public String userFeedRecords() {
/* 648 */     return "userFeedRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userVaccinationRecords"})
/*     */   public String userVaccinationRecords() {
/* 655 */     return "userVaccinationRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userHealthRecords"})
/*     */   public String userHealthRecords() {
/* 662 */     return "userHealthRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userEggProductionRecords"})
/*     */   public String userEggProductionRecords() {
/* 669 */     return "userEggProductionRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userEggSaleRecords"})
/*     */   public String userEggSaleRecords() {
/* 676 */     return "userEggSaleRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userChikenSaleRecords"})
/*     */   public String userChikenSaleRecords() {
/* 683 */     return "userChikenSaleRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userEggGradingRecords"})
/*     */   public String userEggGradingRecords() {
/* 690 */     return "userEggGradingRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userIdentificationRecords"})
/*     */   public String userIdentificationRecords() {
/* 701 */     return "userIdentificationRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userFlockerNumberRecords"})
/*     */   public String userFlockerNumberRecords() {
/* 708 */     return "userFlockerNumberRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userBreedingRecords"})
/*     */   public String userBreedingRecords() {
/* 715 */     return "userBreedingRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userCalfRecords"})
/*     */   public String userCalfRecords() {
/* 722 */     return "userCalfRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userFeedingRecords"})
/*     */   public String userFeedingRecords() {
/* 729 */     return "userFeedingRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userLivestockHealthRecords"})
/*     */   public String userLivestockHealthRecords(Model model) {
/* 735 */     List<LiveStockAnimalRecord> list = this.liveStockService.listAnimalsRecords();
/* 737 */     model.addAttribute("list", list);
/* 739 */     return "userLivestockHealthRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userMortalityRecords"})
/*     */   public String userMortalityRecords() {
/* 746 */     return "userMortalityRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userMilkProductionRecords"})
/*     */   public String userMilkProductionRecords() {
/* 753 */     return "userMilkProductionRecords";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userMilkSales"})
/*     */   public String userserMilkSales() {
/* 760 */     return "userMilkSales";
/*     */   }
/*     */   
/*     */   @RequestMapping({"Login"})
/*     */   public String Login() {
/* 771 */     return "Login";
/*     */   }
/*     */   
/*     */   @RequestMapping({"loginError"})
/*     */   public String LoginError(Model model) {
/* 777 */     model.addAttribute("error", "Invalid Password or Username");
/* 779 */     return "Login";
/*     */   }
/*     */   
/*     */   @RequestMapping({"/"})
/*     */   public String redirectToLogin() {
/* 785 */     return "redirect:/Login";
/*     */   }
/*     */   
/*     */   @RequestMapping({"user"})
/*     */   public String user() {
/* 792 */     return "user";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userCheckRecordType"})
/*     */   public String checRecordType(OpenModel openModel) {
/* 799 */     if (openModel.getRecordType().equals("crop"))
/* 800 */       return "redirect:/userSelectCropRecord"; 
/* 804 */     if (openModel.getRecordType().equals("livestock"))
/* 805 */       return "redirect:/userSelectLiveStockRecord"; 
/* 808 */     if (openModel.getRecordType().equals("poultry"))
/* 809 */       return "redirect:/userSelectPoultryRecord"; 
/* 812 */     return "null";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSelectLiveStockRecord"})
/*     */   public String userSelectLiveStockRecord(OpenModel openModel) {
/* 819 */     return "userSelectLiveStockRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSelectPoultryRecord"})
/*     */   public String userSelectPoultryRecord(OpenModel openModel) {
/* 826 */     return "userSelectPoultryRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userSelectCropRecord"})
/*     */   public String userSelectCropRecord(OpenModel openModel) {
/* 833 */     return "userSelectCropRecord";
/*     */   }
/*     */   
/*     */   @RequestMapping({"userCropRecordPanel"})
/*     */   public String userCropRecordPanel(OpenModel openModel) {
/* 840 */     return "userCropRecordPanel";
/*     */   }
/*     */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\controller\UserController.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */