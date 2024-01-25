package com.digital.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Doctor {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String empId;
	private String fistName;
	private String lastName;
	private String specialty;
	private String userName;
	private String educationalualification;
	private String professionalExperience;
	private String currentWorkingPlace;
	private String email;
	private String phoneNumber;
	private String licenseNumber;
    private double averageRating;
    private int totalRatings;
    private double latitude;
    private double longitude;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "Id", referencedColumnName = "Id")
	private List<DoctorAddress> address;
	
	

}
