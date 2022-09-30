package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.mapper.StudentMapper;
import com.mvc.model.Student;
import com.mvc.persistence.entity.Person;

@Controller
public class SampleController {
	@Autowired
	private StudentMapper studentMapper;
	
	@RequestMapping("/")
	public String index() {		
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/mapper")
	public Person display() {
		Student student = new Student();
		
		student.setAge(16);
		student.setName("Harry Potter");
		
		Person person = studentMapper.toPerson(student);
		
		return person;
	}
}
