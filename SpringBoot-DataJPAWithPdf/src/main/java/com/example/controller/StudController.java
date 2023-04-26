package com.example.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.pdffile.PdfServiceView;
import com.example.model.Student;
import com.example.service.StudentServiceimpl;
import com.lowagie.text.DocumentException;

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
		System.out.println(stu);
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
	public ModelAndView delete(Student student) {
		serviceimpl.delete(student);
		return new ModelAndView("redirect:all");
	}
	@GetMapping("/studentpdf")
	public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String currentDateTime = dateFormatter.format(new Date());

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=Student_" + currentDateTime + ".pdf";
		response.setHeader(headerKey, headerValue);

		List<Student> listEmp = serviceimpl.students();

		PdfServiceView list = new PdfServiceView(listEmp);
		list.export(response);

	}

}
