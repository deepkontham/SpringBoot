package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentServiceimpl;

@RestController
public class StudController {
	
	@Autowired
	private StudentServiceimpl serviceimpl;
	

	
	@PostMapping("/add")
	public ResponseEntity<?> save(@Valid @RequestBody Student student) {

		Student savedUser = serviceimpl.save(student);
		return new ResponseEntity<Student>(savedUser, HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<?> findAll() {
		try {
			return new ResponseEntity<>(serviceimpl.students(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Data Not Founded", HttpStatus.BAD_REQUEST);
		}
	}

	
	@PostMapping("/update")
	public ResponseEntity<?> update(@Valid @RequestBody Student student) {
		 serviceimpl.save(student);
		return new ResponseEntity<>("successfuly update",HttpStatus.OK);
		
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		// MSG Not Working
	
			serviceimpl.deletebyid(id);
			
			
			return new ResponseEntity<>("Delete Student Successfully", HttpStatus.OK);
		
	}

}
