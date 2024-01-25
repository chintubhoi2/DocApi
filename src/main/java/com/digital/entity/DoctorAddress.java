package com.digital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorAddress {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	private String streetAddress;
	private String LendMark;
	private String city;
	private String state;
	private String country;
	private String pincode;
	
}
