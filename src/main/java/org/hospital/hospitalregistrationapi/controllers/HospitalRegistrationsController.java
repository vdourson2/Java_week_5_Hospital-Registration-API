package org.hospital.hospitalregistrationapi.controllers;

import org.hospital.hospitalregistrationapi.entities.Doctor;
import org.hospital.hospitalregistrationapi.entities.Visit;
import org.hospital.hospitalregistrationapi.repositories.DoctorsRepository;
import org.hospital.hospitalregistrationapi.repositories.VisitsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	
	@RequestMapping(value = "/api/visits", method = RequestMethod.POST)
    public ResponseEntity<Object> registerVisitor(@RequestParam String firstName, @RequestParam String lastName, @RequestParam(required = false, defaultValue = "-1") int doctorId){
        Visit visit = (doctorId == -1) ? new Visit(firstName, lastName) : new Visit(firstName, lastName, doctorId);
        visits.addVisit(visit);
        return new ResponseEntity<>("201 Created on successful registration, id : " + visit.getId(), HttpStatus.CREATED);
    }
	
	
	
	
	
//	Valentin
	
	
	
	
	
	
	
	
	
	
//	Virginie
	
	@PostMapping("/api/doctors")
	public ResponseEntity<Integer> create(@RequestBody Doctor doctor) {
		doctors.addNewDoctor(doctor);
		System.out.println(doctor.getName());
		return new ResponseEntity<Integer>((Integer) doctor.getId(), HttpStatus.CREATED);
	}
	
	
	
	
	
	
}
