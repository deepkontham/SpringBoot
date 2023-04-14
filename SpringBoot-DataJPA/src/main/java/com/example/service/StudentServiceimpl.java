package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentRepository;
import com.example.model.Student;

@Service
public class StudentServiceimpl implements StudentServicedao {
	 
	@Autowired
	private StudentRepository repository;

	@Override
	public void save(Student student) {
		repository.save(student);
	}


	

	@Override
	public List<Student> students() {
		return repository.findAll();
	}




	@Override
	public void delete(int id) {
		 Student s=new Student();
		 s.setId(id);
		repository.delete(s);
	}




	@Override
	public Student findbyid(int id) {
		return repository.findById(id).get();
	}




	@Override
	public void update(Student student) {
		repository.save(student);
		
	}


}
