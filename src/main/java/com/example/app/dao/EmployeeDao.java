package com.example.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
