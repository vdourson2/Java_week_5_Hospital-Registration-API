package org.hospital.hospitalregistrationapi.entities;

public class Doctor {
	
	private String name;
	private String specialization;
	private int id;
	
	public Doctor() {
		
	}
	
	public Doctor(String name, String specialization, int id) {
		this.name = name;
		this.specialization = specialization;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
