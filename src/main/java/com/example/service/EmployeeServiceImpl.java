package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employees;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService  {
	
	@Autowired
	public EmployeeRepository employeeRepository;

	@Override
	public List<Employees> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employees findById(Integer id) {
		Optional<Employees> employees = employeeRepository.findById(id);
		return employees.isPresent() ? employees.get() : null;
	}

	@Override
	public Employees update(Employees employees) {
		return employeeRepository.save(employees);				
	}

	@Override
	public void delete(Integer id) {
		 employeeRepository.deleteById(id);
	}

	@Override
	public Employees add(Employees employees) {
		return employeeRepository.save(employees);
	}

}
