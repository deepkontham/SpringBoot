package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentServicedao {
	void save(Student student);
	void delete(int id);
	Student findbyid(int id);
	List<Student>students();
	void update(Student student);
	

}
