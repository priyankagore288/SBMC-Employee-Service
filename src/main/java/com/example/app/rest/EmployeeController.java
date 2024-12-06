package com.example.app.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Employee;
import com.example.app.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private EmployeeService service;

	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/")
	public String welcomePage()
	{
		String msg = "WELCOME TO THE EMPLOYEE PAGE";
		
		return msg;
	}
	
	@PostMapping(value = "/employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp)
	{
	  Employee empl =	service.addEmployee(emp);
	  
	  return new ResponseEntity<Employee>(empl,HttpStatus.CREATED);
	}
	
	
	@GetMapping(value = "/employees")
	public ResponseEntity<List<Employee>> getAllEmployee()
	{
	  List<Employee> emplist = 	service.getAllEmployee();
	  
	  return new ResponseEntity<List<Employee>>(emplist,HttpStatus.OK);
	}
	
	
	
	@GetMapping(value = "/employees/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Integer  id) {
		
	 Employee emp =	service.getEmployee(id);
	
	 return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/employees/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable int id)
	{
		service.deleteEmployee(id);
		 
		 return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
