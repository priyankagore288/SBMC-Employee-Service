package com.example.app.service;

import java.util.List;

import com.example.app.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee emp);

	List<Employee> getAllEmployee();

	Employee getEmployee(Integer id);

	void deleteEmployee(int id);

	

}
