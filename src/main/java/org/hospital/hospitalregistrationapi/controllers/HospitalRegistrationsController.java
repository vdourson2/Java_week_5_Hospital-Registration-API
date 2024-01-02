package org.hospital.hospitalregistrationapi.controllers;

import org.hospital.hospitalregistrationapi.repositories.DoctorsRepository;
import org.hospital.hospitalregistrationapi.repositories.VisitsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	
	
	
	
	
//	Valentin
	
	
  @GetMapping("/visits")
  public String getVisits(@RequestParam String date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate chosenDate = LocalDate.parse(date, formatter);
    return visits.getVisits(chosenDate);
  }

  
	
	
	
	
	
	
	
	
//	Virginie
	
	
	
	
	
	
	
}
