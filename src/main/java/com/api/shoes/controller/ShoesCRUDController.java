package com.api.shoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.shoes.model.PurchaseReport;
import com.api.shoes.model.Shoes;
import com.api.shoes.model.Subscriber;
import com.api.shoes.service.ShoesService;

@RestController
public class ShoesCRUDController {

	@Autowired
	private ShoesService service;
	
	
	//Shoes
	@PostMapping("/shoes")
	public Shoes createShoe(@RequestBody Shoes shoe) {
		
		return service.createShoe(shoe);
	}

	@PutMapping("/shoes")
	public Shoes updateShoe(@RequestBody Shoes shoe) {
		
		return service.updateShoe(shoe);
	}

	@GetMapping("/shoes/{id}")
	public ResponseEntity<Shoes> getShoeById(@PathVariable int id) {
		

			return new ResponseEntity<>(service.getShoeById(id),HttpStatus.OK);

	}

	@DeleteMapping("/shoes/{id}")
	public void deleteShoesById(@PathVariable int id) {
		service.deleteShoesById(id);
		
	}
	
	
	//Subscriber
	@PostMapping("/subscribers")
	public Subscriber createSub(@RequestBody Subscriber subscriber) {
		
		return service.createSub(subscriber);
	}

	@PutMapping("/subscribers")
	public Subscriber updateSub(@RequestBody Subscriber subscriber) {
		
		return service.updateSub(subscriber);
	}

	@GetMapping("/subscribers/{id}")
	public ResponseEntity<Subscriber> getSubById(@PathVariable int id) {
		

			return new ResponseEntity<>(service.getSubById(id),HttpStatus.OK);

	}

	@DeleteMapping("/subscribers/{id}")
	public void deleteSubById(@PathVariable int id) {
		service.deleteSubById(id);
		
	}
	
	
	// Purchase Report
	@PostMapping("/PRs")
	public PurchaseReport createPurchaseReport(@RequestBody PurchaseReport PR) {
		
		return service.createPurchaseReport(PR);
	}

	@PutMapping("/PRs")
	public PurchaseReport updatePurchaseReport(@RequestBody PurchaseReport PR) {
		
		return service.updatePurchaseReport(PR);
	}

	@GetMapping("/PRs/{id}")
	public ResponseEntity<PurchaseReport> getPurchaseReportById(@PathVariable int id) {
		

			return new ResponseEntity<>(service.getPurchaseReportById(id),HttpStatus.OK);

	}

	@DeleteMapping("/PRs/{id}")
	public void deletePurchaseReportById(@PathVariable int id) {
		service.deletePurchaseReportById(id);
		
	}
}
