package com.api.shoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.api.shoes.model.Subscriber;


@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Integer> {
	
	public List<Subscriber> findByName(String name);
	
	

}
