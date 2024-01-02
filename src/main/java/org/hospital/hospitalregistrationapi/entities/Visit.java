package org.hospital.hospitalregistrationapi.entities;

import java.time.Instant;

public class Visit {
	
	private String firstName;
	private String lastName;
	private int id;
	private long visitTimestamp;
	
	public Visit() {
	}
	
	public Visit(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		Instant instant = Instant.now();
		this.visitTimestamp = instant.toEpochMilli();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getVisitTimestamp() {
		return visitTimestamp;
	}
	public void setVisitTimestamp(long visitTimestamp) {
		this.visitTimestamp = visitTimestamp;
	}
	
}
