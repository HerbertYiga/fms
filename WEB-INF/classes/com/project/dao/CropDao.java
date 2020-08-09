package com.project.dao;

import com.project.model.Chemical;
import com.project.model.Crop;
import com.project.model.Harvest;
import com.project.model.Irrigation;
import com.project.model.Machinery;
import com.project.model.Sales;
import java.util.List;

public interface CropDao {
  void addCropRecord(Crop paramCrop);
  
  void addIrrigationRecord(Irrigation paramIrrigation);
  
  void addChemicalRecord(Chemical paramChemical);
  
  void addMachinneryRecord(Machinery paramMachinery);
  
  void addHarvestRecord(Harvest paramHarvest);
  
  void addSalesRecord(Sales paramSales);
  
  List<Crop> listCropRecords();
  
  List<Irrigation> listIrrigationRecords();
  
  List<Chemical> listChemicalRecords();
  
  List<Machinery> listMachineryRecords();
  
  List<Harvest> listHarvestRecords();
  
  List<Sales> listSalesRecord();
}


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\dao\CropDao.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */