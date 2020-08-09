package com.project.service;

import com.project.model.LiveStockAnimalBreedingRecord;
import com.project.model.LiveStockAnimalRecord;
import com.project.model.LiveStockAnimalSaleRecords;
import com.project.model.LiveStockCalfRecords;
import com.project.model.LiveStockFeedingRecords;
import com.project.model.LiveStockFlockRecords;
import com.project.model.LiveStockMilkSaleRecords;
import com.project.model.LiveStockMlkProductionRecords;
import com.project.model.LiveStockMortalityRecords;
import com.project.model.LiveStockPermitRecords;
import com.project.model.LivestockHealthRecords;
import java.util.List;

public interface LiveStockService {
  void addAnimalSaleRecords(LiveStockAnimalSaleRecords paramLiveStockAnimalSaleRecords);
  
  void addFeedingRecords(LiveStockFeedingRecords paramLiveStockFeedingRecords);
  
  void addHealthRecord(LivestockHealthRecords paramLivestockHealthRecords);
  
  void addPermitRecords(LiveStockPermitRecords paramLiveStockPermitRecords);
  
  void addMortalityRecord(LiveStockMortalityRecords paramLiveStockMortalityRecords);
  
  void addProductionRecord(LiveStockMlkProductionRecords paramLiveStockMlkProductionRecords);
  
  void addMilkSaleRecord(LiveStockMilkSaleRecords paramLiveStockMilkSaleRecords);
  
  void addAnimalRecord(LiveStockAnimalRecord paramLiveStockAnimalRecord);
  
  void addFlockRecord(LiveStockFlockRecords paramLiveStockFlockRecords);
  
  void addBreedingRecord(LiveStockAnimalBreedingRecord paramLiveStockAnimalBreedingRecord);
  
  void addCalfRecord(LiveStockCalfRecords paramLiveStockCalfRecords);
  
  List<LiveStockAnimalSaleRecords> getAnimalSaleRecords();
  
  List<LiveStockFeedingRecords> getFeedingRecords();
  
  List<LivestockHealthRecords> getHealthRecords();
  
  List<LiveStockPermitRecords> getPermitRecords();
  
  List<LiveStockMortalityRecords> mortalityRecords();
  
  List<LiveStockMlkProductionRecords> getMilkProductionRecords();
  
  List<LiveStockMilkSaleRecords> getMilkRecords();
  
  List<LiveStockAnimalRecord> listAnimalsRecords();
  
  List<LiveStockFlockRecords> listFlockRecords();
  
  List<Object[]> getBreedingRecords();
  
  List<LiveStockCalfRecords> getCalfRecords();
}


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\service\LiveStockService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */