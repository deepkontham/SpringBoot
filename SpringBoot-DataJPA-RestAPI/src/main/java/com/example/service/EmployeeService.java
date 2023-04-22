package com.example.service;

import java.util.List;

import com.example.pojo.Employee;

public interface EmployeeService {
	void save(Employee employee);
	List<Employee> employees();
	void delete(int id);
	Employee getbyid(int id);
	void update(Employee employee);
	

}
