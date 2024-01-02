package org.hospital.hospitalregistrationapi.repositories;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.hospital.hospitalregistrationapi.entities.Visit;
import org.springframework.stereotype.Repository;

@Repository
public class VisitsRepository {
	
	private List<Visit> visits = new ArrayList<>();
	
	public VisitsRepository() {
		Visit visit1 = new Visit("Joseph","Dupont",4, "02/01/2024");
		visits.add(visit1);
		Visit visit2 = new Visit("Alice","Dumarais",3, "02/01/2024");
		visits.add(visit2);
		Visit visit3 = new Visit("Adelaide","Dulak",4, "03/01/2024");
		visits.add(visit3);
		Visit visit4 = new Visit("Antonin","Dubois",1, "04/01/2024");
		visits.add(visit4);
	}

	public void addVisit(Visit visit){
		visits.add(visit);
	}
	
	
	// Get visits method
	public String getVisits(LocalDate chosenDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = chosenDate.format(formatter);
		
		for (Visit visit : visits) {
			
			String date = visit.getVisitTimestamp();
			LocalDate localDate = LocalDate.parse(date, formatter)
							.atStartOfDay(ZoneId.systemDefault())
					.toLocalDate();
			
			if (localDate.equals(chosenDate)) {
				return visit.getFirstName() + " " + visit.getLastName() + " " + visit.getVisitTimestamp();
			}
	}
		return "No visits on " + formattedDate;
	}
}
