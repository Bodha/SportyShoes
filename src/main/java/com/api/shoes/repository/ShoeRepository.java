package com.api.shoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.shoes.model.Shoes;


@Repository
public interface ShoeRepository extends JpaRepository<Shoes, Integer> {

	public List<Shoes> findByCategory(String category);
	public List<Shoes> findByBrand(String brand);
	public List<Shoes> findByPrice(int price);
	
	

}
