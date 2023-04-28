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
	public Student save(Student student) {
		return repository.save(student);
	}


	

	@Override
	public List<Student> students() {
		 List<Student> list = repository.findAll();
		 System.out.println(list);
		 return list;
	}




	@Override
	public void delete(Student student) {
		 
		repository.delete(student);
	}

	public void deletebyid(Integer i) {
		 
		repository.deleteById(i);
	}



	@Override
	public Student findbyid(int id) {
		 Student student = repository.findById(id).get();
		 System.out.println(student);
		 return student;
	}




	@Override
	public void update(Student student) {
		repository.save(student);
		
	}


}
