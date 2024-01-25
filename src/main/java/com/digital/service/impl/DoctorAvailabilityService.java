package com.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.entity.DoctorAvailability;
import com.digital.repository.DoctorAvailabilityRepository;

@Service
public class DoctorAvailabilityService {
    private final DoctorAvailabilityRepository availabilityRepository;

    @Autowired
    public DoctorAvailabilityService(DoctorAvailabilityRepository availabilityRepository) {
        this.availabilityRepository = availabilityRepository;
    }

    public DoctorAvailability addDoctorAvailability(DoctorAvailability availability) {
        // Implement validation and save the availability slot
        return availabilityRepository.save(availability);
    }

    public List<DoctorAvailability> getDoctorAvailability(Long doctorId) {
        // Implement a method to retrieve all available slots for a specific doctor
        // You can use the doctorId to filter the slots
        // Example: availabilityRepository.findByDoctorId(doctorId);
    	return availabilityRepository.findAll();
    }

    // Other methods for updating and deleting availability slots
}
