package com.digital.model;

import java.util.List;

import com.digital.entity.DoctorAddress;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorRequest {

	private Long Id;
	
	private String fistName;
	private String lastName;
	private String empId;
	private String ocupation;
	private String userName;
	private String educationalualification;
	private String professionalExperience;
	private String currentWorkingPlace;
	private String email;
	private String phoneNumber;
	private List<DoctorAddress> address;

}
