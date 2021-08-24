package com.example.service;

import java.util.List;

import com.example.model.Employees;

public interface EmployeeService {
	
	public List<Employees> getAllEmployees();
	
	public Employees update(Employees employees);
	
	public void delete(Integer id);
	
	public Employees add(Employees employees);

	public Employees findById(Integer id);

	
	
	

}
