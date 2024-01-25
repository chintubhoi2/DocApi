package com.digital.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.entity.Doctor;
import com.digital.model.DoctorRequest;
import com.digital.model.DoctorResponse;
import com.digital.repository.DoctorRepository;
import com.digital.service.IDoctorService;
import com.digital.utils.generater.DocReferanceGenerater;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private DoctorRepository doctorRepo;

	@Autowired
	private DocReferanceGenerater refGenerate;

	public List<Doctor> getAllDoctor() {
		return (List<Doctor>) doctorRepo.findAll();
	}

	

	public DoctorResponse createDoctor(DoctorRequest doctorReq) {
		Doctor doctor = new Doctor();
		DoctorResponse dResponse = new DoctorResponse();

		if (doctorReq.getFistName() != null && doctorReq.getLastName() != null && doctorReq.getAddress() != null) {

			if (doctorRepo.findByFistName(doctorReq.getFistName()) != null) {
				BeanUtils.copyProperties(doctorReq, doctor);
				doctor.setEmpId(refGenerate.Generate());
				
				String fName=doctorReq.getFistName().substring(0, 1).toUpperCase() + doctorReq.getFistName().substring(1);  
				String lName=doctorReq.getLastName().substring(0, 1).toUpperCase() + doctorReq.getLastName().substring(1);
				doctor.setUserName(fName + "  " +lName );

				doctor = doctorRepo.save(doctor);
				dResponse.setMessage("Doctor got saved Successfully with Id:=" + doctor.getId());
				dResponse.setStatus("Sucess");
				dResponse.setStatusCode("200");
				return dResponse;

			} else {
				dResponse.setMessage("Pleae provide Unique FirstName");
				dResponse.setStatus("Sucess");
				dResponse.setStatusCode("300");
				return dResponse;
			}

		} else {

			dResponse.setMessage("Please Provide the Doctor Details make sure to fill all filds");
			dResponse.setStatus("Failed");
			dResponse.setStatusCode("400");
			return dResponse;
		}

	}

	public DoctorResponse updateDoctor(DoctorRequest doctorReq) {
		Doctor doctor = new Doctor();
		DoctorResponse dResponse = new DoctorResponse();

		if (doctorReq.getFistName() != null && doctorReq.getLastName() != null && doctorReq.getAddress() != null) {

			if (doctorRepo.getById(doctorReq.getId()) != null) {
				BeanUtils.copyProperties(doctorReq, doctor);
				
				
				String fName=doctorReq.getFistName().substring(0, 1).toUpperCase() + doctorReq.getFistName().substring(1);  
				String lName=doctorReq.getLastName().substring(0, 1).toUpperCase() + doctorReq.getLastName().substring(1);
				doctor.setUserName(fName + "  " +lName );

				doctor = doctorRepo.save(doctor);
				dResponse.setMessage("Doctor got saved Successfully with Id:=" + doctor.getId());
				dResponse.setStatus("Sucess");
				dResponse.setStatusCode("200");
				return dResponse;

			} else {
				dResponse.setMessage("Pleae provide Unique FirstName");
				dResponse.setStatus("Sucess");
				dResponse.setStatusCode("300");
				return dResponse;
			}

		} else {

			dResponse.setMessage("Please Provide the Doctor Details make sure to fill all filds");
			dResponse.setStatus("Failed");
			dResponse.setStatusCode("400");
			return dResponse;
		}

	}

	
	
	
	// Delete Doctor API Service
	@Override
	public void deleteDoctor(Long id) {
		doctorRepo.deleteById(id);

	}

	@Override
	public Doctor getDoctorById(Long doctorId) {
		doctorRepo.getById(doctorId);
		return null;
	}

}