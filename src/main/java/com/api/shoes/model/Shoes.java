package com.api.shoes.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Shoes {

	@Id
	@GeneratedValue
	private int id;
	private String series;
	private String brand;
	private int price;
	private String category;
	

}
