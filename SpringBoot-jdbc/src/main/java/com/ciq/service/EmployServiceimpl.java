package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.EmployeImpl;
import com.ciq.model.Employee;
@Service
public class EmployServiceimpl implements EmployServicedao{
	
	@Autowired
	private EmployeImpl employeImpl;
	

	@Override
	public void save(Employee employee) {
		employeImpl.save(employee);
		
	}

	@Override
	public List<Employee> getEmployees() {
		return employeImpl.getEmployees();
	}

	@Override
	public int delete(int id) {
		return employeImpl.delete(id);
	}

	@Override
	public int update(Employee employee) {
		return employeImpl.update(employee);
	}

	@Override
	public Employee getbyid(int id) {
		return employeImpl.getbyid(id);
	}

}
