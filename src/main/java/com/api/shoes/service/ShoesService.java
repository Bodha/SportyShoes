package com.api.shoes.service;

import java.util.Date;
import java.util.List;

import com.api.shoes.model.PurchaseReport;
import com.api.shoes.model.Shoes;
import com.api.shoes.model.Subscriber;


public interface ShoesService {

	//Shoes
	public Shoes createShoe(Shoes shoe);
	public Shoes updateShoe(Shoes shoe);
	public Shoes getShoeById(int id);
	public void deleteShoesById(int id);
	public List<Shoes> getAllShoes();
	public List<Shoes> getAllShoesByCategory(String category);
	public List<Shoes> getAllShoesByBrand(String brand);
	public List<Shoes> getAllShoesByPrice(int price);
	
	//Subscriber
	public Subscriber createSub(Subscriber sub);
	public Subscriber updateSub(Subscriber sub);
	public Subscriber getSubById(int id);
	public void deleteSubById(int id);
	public List<Subscriber> getAllSubs();
	public List<Subscriber> getAllSubscriberByName(String name);
	
	//Purchase Reports
	public PurchaseReport createPurchaseReport(PurchaseReport pr);
	public PurchaseReport updatePurchaseReport(PurchaseReport pr);
	public PurchaseReport getPurchaseReportById(int id);// throws BusinessException;
	public void deletePurchaseReportById(int id);
	public List<PurchaseReport> getAllPurchaseReports();
	public List<PurchaseReport> getAllPurchaseReportByDate(Date date);
	public List<PurchaseReport> getAllPurchaseReportByCategory(String category);

}

