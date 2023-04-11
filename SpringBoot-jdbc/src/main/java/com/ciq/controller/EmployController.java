package com.ciq.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.model.Employee;
import com.ciq.service.EmployServiceimpl;

@Controller
public class EmployController {
	
	@Autowired
	private EmployServiceimpl employServiceimpl;
	
	
	
	
	
	@GetMapping("/save")
	public ModelAndView save(Employee employee) {
//		employServiceimpl.save(employee);
		return new ModelAndView("insert");
	}
	@PostMapping("/jk")
	public ModelAndView saved(Employee employee) {
		employServiceimpl.save(employee);
		
		return new ModelAndView("redirect:all");

	}
	@GetMapping("/all")
	public ModelAndView getall(Employee employee) {
		 List<Employee> emp = employServiceimpl.getEmployees() ;
		 System.out.println(emp);
		 return new ModelAndView("findall", "map", emp);
		
	}
	@GetMapping("/up")
	public ModelAndView getbyid(@RequestParam int id) {
		Employee s = employServiceimpl.getbyid(id);
		return new ModelAndView("update","upp",s);
		
		
	}
	@PostMapping("/update")
	public ModelAndView update(Employee employee) {
		 employServiceimpl.update(employee) ;
		return new ModelAndView("redirect:all");
		 
	}
	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam int id) {
		employServiceimpl.delete(id);
		return new ModelAndView("redirect:all");
		
	}
}

