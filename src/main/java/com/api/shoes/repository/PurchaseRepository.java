package com.api.shoes.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.shoes.model.PurchaseReport;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseReport, Integer> {
	

	public List<PurchaseReport> findByDate(Date date);
	public List<PurchaseReport> findByCategory(String category);

	

}
