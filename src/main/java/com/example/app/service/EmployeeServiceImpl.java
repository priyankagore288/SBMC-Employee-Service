package com.example.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.dao.EmployeeDao;
import com.example.app.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao dao;

	public EmployeeServiceImpl(EmployeeDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		Employee save = dao.save(emp);
		return save;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = dao.findAll();
		return list;
	}

	@Override
	public Employee getEmployee(Integer id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void deleteEmployee(int id) {
		dao.deleteById(id);
		
	}

	

}
