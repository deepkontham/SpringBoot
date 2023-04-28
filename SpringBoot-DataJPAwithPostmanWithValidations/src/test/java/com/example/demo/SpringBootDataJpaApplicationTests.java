package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.dao.StudentRepository;
import com.example.model.Student;
import com.example.service.StudentServiceimpl;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class SpringBootDataJpaApplicationTests {
	
	@InjectMocks
	private StudentServiceimpl serviceimpl;
	 
	@MockBean
	private StudentRepository repository;

	@Test
	public void getall() {
		when(repository.findAll()).thenReturn(Stream.of(new Student(22,"sai","vbhs"),new Student(23, "chinnu","vbhs")).collect(Collectors.toList()));
		assertEquals(2, serviceimpl.students().size());
	}
//	@Test
//	public void getbyid() {
//		int i=22;
//		Student findbyid = serviceimpl.findbyid(22);
//		when(repository.findById(i).get()).thenReturn(new Student(22, "sai","vbhs"));
//		assertEquals("sai",findbyid.getName());
//				}
	@Test
	public void savetest() {
		Student s=new Student(44,"deep", "vbhs");
		when(repository.save(s)).thenReturn(s);
		assertEquals(s, serviceimpl.save(s));
		
	}
	@Test
	public void deleteTest() {
		Student s=new Student(44,"deep", "vbhs");
		serviceimpl.delete(s);
		verify(repository,times(1)).delete(s);

	}

}
