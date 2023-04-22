package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.pojo.Employee;
import com.example.service.EmployeeServimpl;

@RestController
public class EmpController {
	
	@Autowired
	private EmployeeServimpl employeeServimpl;
	
	@GetMapping("/go")
	public ModelAndView save() {
		return new ModelAndView("insert");
		
		
	}
	
	@PostMapping("/insert1")
	public void saveswager(Employee employee) {
		 employeeServimpl.save(employee); 
		
	}
	
	@PostMapping("/insert")
	public ModelAndView saved(Employee employee) {
		 employeeServimpl.save(employee); 
		 return new ModelAndView("redirect:all");
		 
		
	}
	@GetMapping("/all")
	public ModelAndView getall(){
		List<Employee> dt = employeeServimpl.employees();
		return new ModelAndView("findall","ss",dt);
		
	}
	@GetMapping("/all1")
	public List<Employee> getallsswagger() {
		return employeeServimpl.employees();
	
		
	}

}
