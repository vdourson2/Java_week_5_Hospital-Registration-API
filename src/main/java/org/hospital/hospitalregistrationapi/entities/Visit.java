package org.hospital.hospitalregistrationapi.entities;

import java.time.Instant;
import java.util.UUID;

public class Visit {
	
	private String firstName;
	private String lastName;
	private UUID id;
	private int doctorId;
	private long visitTimestamp;
	
	public Visit() {
		System.out.println("super constructor");
        this.id = UUID.randomUUID();
		Instant instant = Instant.now();
		this.visitTimestamp = instant.toEpochMilli();
    }
	
	public Visit(String firstName, String lastName) {
		this();
		System.out.println("constructor1");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Visit(String firstName, String lastName, int doctorId) {
		this();
		System.out.println("constructor2");
		this.firstName = firstName;
		this.lastName = lastName;
		this.doctorId = doctorId;
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
	public String getId() {
		return String.valueOf(id);
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public long getVisitTimestamp() {
		return visitTimestamp;
	}
	public void setVisitTimestamp(long visitTimestamp) {
		this.visitTimestamp = visitTimestamp;
	}
	
}
