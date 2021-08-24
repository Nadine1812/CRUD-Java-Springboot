package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employees;
import com.example.service.EmployeeService;

@CrossOrigin("http://localhost:4200")
@RestController

@RequestMapping("api/employees")
public class EmployeeControle {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("")
	public List<Employees> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employees getEmployes(@PathVariable  Integer id) {
		return employeeService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Employees update(@PathVariable Integer id ,@RequestBody Employees employees) {
	return employeeService.update(employees);
}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		employeeService.delete(id);
		
	}
	@PostMapping
	public Employees add(@RequestBody Employees employees) {
		return employeeService.add(employees);
	}
}
