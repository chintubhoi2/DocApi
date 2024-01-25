package com.digital.service;

import java.util.List;

import com.digital.entity.Doctor;
import com.digital.model.DoctorRequest;
import com.digital.model.DoctorResponse;

public interface IDoctorService {


	public List<Doctor> getAllDoctor();
	public Doctor getDoctorById(Long doctorId);
	public DoctorResponse createDoctor(DoctorRequest doctorReq);
	public DoctorResponse updateDoctor(DoctorRequest doctorReq);
	public void deleteDoctor(Long id);
	
	
}
