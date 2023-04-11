package com.ciq.dao;

import java.util.List;

import com.ciq.model.Employee;

public interface EmployDao {
	
	void save(Employee employee);
	List<Employee> getEmployees(); 
	int delete(int id);
	int update(Employee employee);
    Employee getbyid(int eid);

}
