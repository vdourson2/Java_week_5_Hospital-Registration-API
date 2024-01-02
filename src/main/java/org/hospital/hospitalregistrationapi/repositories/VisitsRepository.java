package org.hospital.hospitalregistrationapi.repositories;

import java.util.ArrayList;
import java.util.List;

import org.hospital.hospitalregistrationapi.entities.Visit;
import org.springframework.stereotype.Repository;

@Repository
public class VisitsRepository {
	
	private List<Visit> visits = new ArrayList<>();
	
	public VisitsRepository() {
		Visit visit1 = new Visit("Joseph","Dupont",1);
		visits.add(visit1);
		Visit visit2 = new Visit("Alice","Dumarais",2);
		visits.add(visit2);
		Visit visit3 = new Visit("Adelaide","Dulak",3);
		visits.add(visit3);
		Visit visit4 = new Visit("Antonin","Dubois",4);
		visits.add(visit4);
	}

	public void addVisit(Visit visit){
		visits.add(visit);
	}
	
}
