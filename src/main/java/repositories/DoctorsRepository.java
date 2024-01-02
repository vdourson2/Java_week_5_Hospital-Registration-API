package repositories;

import java.util.ArrayList;
import java.util.List;

import org.hospital.hospitalregistrationapi.entities.Doctor;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorsRepository {

	private List<Doctor> doctors = new ArrayList<>();
	
	public DoctorsRepository() {
		Doctor doctor1 = new Doctor("Machin", "Gastrology",1);
		this.doctors.add(doctor1);
		Doctor doctor2 = new Doctor("Bidule", "Traumatology",2);
		this.doctors.add(doctor2);
		Doctor doctor3 = new Doctor("Much", "Surgery",3);
		this.doctors.add(doctor3);
		Doctor doctor4 = new Doctor("Truc", "Maternity",4);
		this.doctors.add(doctor4);
	}
	
}
