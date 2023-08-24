package com.naveen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	private int personDetailsId;
	private String zipCode;
	private String job;
	private double income;
	@Id @GeneratedValue	
	@Column(name="personDetails_PK")
	public int getPersonDetailsId() {
		return personDetailsId;
	}
	public void setPersonDetailsId(int personDetailsId) {
		this.personDetailsId = personDetailsId;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "PersonDetails [personDetailsId=" + personDetailsId + ", zipCode=" + zipCode + ", job=" + job
				+ ", income=" + income + "]";
	}
	

}
