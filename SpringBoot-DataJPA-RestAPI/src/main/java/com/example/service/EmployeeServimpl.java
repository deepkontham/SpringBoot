package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeRepository;
import com.example.pojo.Employee;

@Service
public class EmployeeServimpl implements EmployeeService  {
	@Autowired
	private EmployeeRepository repository;
	

	@Override
	public void save(Employee employee) {
		repository.save(employee);
	}

	@Override
	public List<Employee> employees() {
		return repository.findAll();
	}

	@Override
	public void delete(int id) {
		Employee e=new Employee();
		e.setId(id);
		 repository.delete(e); 
	}

	@Override
	public Employee getbyid(int id) {
		return repository.findAll().get(id);
	}

	@Override
	public void update(Employee employee) {
		repository.save(employee);
	}

}
