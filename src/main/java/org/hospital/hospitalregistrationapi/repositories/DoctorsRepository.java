package org.hospital.hospitalregistrationapi.repositories;

import java.util.ArrayList;
import java.util.List;

import org.hospital.hospitalregistrationapi.entities.Doctor;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorsRepository {

	private List<Doctor> doctors = new ArrayList<>();
	
	public DoctorsRepository() {
		Doctor doctor1 = new Doctor("Machin", "Gastrology");
		this.doctors.add(doctor1);
		Doctor doctor2 = new Doctor("Bidule", "Traumatology");
		this.doctors.add(doctor2);
		Doctor doctor3 = new Doctor("Much", "Surgery");
		this.doctors.add(doctor3);
		Doctor doctor4 = new Doctor("Truc", "Maternity");
		this.doctors.add(doctor4);
	}
	
	public void addNewDoctor(Doctor doctor) {
		this.doctors.add(doctor);
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	
	
}
