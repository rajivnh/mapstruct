package com.mvc.mapper;

import org.mapstruct.Mapper;

import com.mvc.model.Student;
import com.mvc.persistence.entity.Person;

@Mapper(componentModel = "spring")
public interface StudentMapper {
	Person toPerson(Student student);
	
	Student toStudent(Person person);
}
