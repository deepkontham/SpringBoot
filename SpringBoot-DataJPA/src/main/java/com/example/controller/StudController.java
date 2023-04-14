package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Student;
import com.example.service.StudentServiceimpl;

@RestController
public class StudController {
	
	@Autowired
	private StudentServiceimpl serviceimpl;
	
	@GetMapping("/sa")
	public ModelAndView save() {
		return new ModelAndView("insert");
		
		
		
	}
	@PostMapping("/insert")
	public ModelAndView saved(Student student) {
		serviceimpl.save(student);
		return new ModelAndView("redirect:all");
		
		
	}
	@GetMapping("/all")
	public ModelAndView getall(Student student) {
		List<Student> stu = serviceimpl.students();
		return new ModelAndView("findall","ms",stu);
		
	}
	@GetMapping("/up")
	public ModelAndView getbyid(int id) {
		Student fi = serviceimpl.findbyid(id);
		return new ModelAndView("update","us",fi);
		
	}
	@PostMapping("/update")
	public ModelAndView update(Student student) {
		serviceimpl.save(student);
		return new ModelAndView("redirect:all");
		
		
	}
	@GetMapping("/delete")
	public ModelAndView delete(int id) {
		serviceimpl.delete(id);
		return new ModelAndView("redirect:all");
	}

}
