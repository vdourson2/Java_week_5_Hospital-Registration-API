package org.hospital.hospitalregistrationapi.controllers;

import org.hospital.hospitalregistrationapi.entities.Doctor;
import org.hospital.hospitalregistrationapi.repositories.DoctorsRepository;
import org.hospital.hospitalregistrationapi.repositories.VisitsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalRegistrationsController {

    VisitsRepository visits;
    DoctorsRepository doctors;

    HospitalRegistrationsController(VisitsRepository visits, DoctorsRepository doctors)
    {
        this.visits = visits;
        this.doctors = doctors;
    }

//	Justine
	
	
	
	
	
	
	
//	Valentin
	
	
	
	
	
	
	
	
	
	
//	Virginie
	
	@PostMapping("/api/doctors")
	public ResponseEntity<Integer> create(@RequestBody Doctor doctor) {
		doctors.addNewDoctor(doctor);
		System.out.println(doctor.getName());
		return new ResponseEntity<Integer>((Integer) doctor.getId(), HttpStatus.CREATED);
	}
	
	
	
	
	
	
}
