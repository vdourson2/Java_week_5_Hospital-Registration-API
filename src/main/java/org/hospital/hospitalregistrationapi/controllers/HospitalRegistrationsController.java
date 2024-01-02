package org.hospital.hospitalregistrationapi.controllers;

import org.hospital.hospitalregistrationapi.entities.Doctor;
import org.hospital.hospitalregistrationapi.entities.Visit;
import org.hospital.hospitalregistrationapi.repositories.DoctorsRepository;
import org.hospital.hospitalregistrationapi.repositories.VisitsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    public ResponseEntity<Object> registerVisitor(@RequestBody Visit visit){
        visits.addVisit(visit);
        return new ResponseEntity<>("201 Created on successful registration, id : " + visit.getId(), HttpStatus.CREATED);
    }
	
	
	
	
	
//	Valentin
	
	
  @GetMapping("/visits")
  public String getVisits(@RequestParam String date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate chosenDate = LocalDate.parse(date, formatter);
    return visits.getVisits(chosenDate);
  }

  
	
	
	
	
	
	
	
	
//	Virginie
	
	@PostMapping("/api/doctors")
	public ResponseEntity<Integer> create(@RequestBody Doctor doctor) {
		doctors.addNewDoctor(doctor);
		System.out.println(doctor.getName());
		return new ResponseEntity<Integer>((Integer) doctor.getId(), HttpStatus.CREATED);
	}
	
	
	
	
	
	
}
