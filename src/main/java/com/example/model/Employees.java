package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity 
public class Employees {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="EMPLOYEE_ID")
	private Integer id;
@Column
	private String firstName;
@Column
	private String lastName;
@Column
	private String dateNaissance;


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
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
public String getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(String dateNaissance) {
	this.dateNaissance = dateNaissance;

}
	
}
