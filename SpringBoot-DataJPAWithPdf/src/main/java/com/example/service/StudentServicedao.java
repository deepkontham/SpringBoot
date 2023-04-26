package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentServicedao {
	Student save(Student student);
	void delete(Student student);
	Student findbyid(int id);
	List<Student>students();
	void update(Student student);
	

}
