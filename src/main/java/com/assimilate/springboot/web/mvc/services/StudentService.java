package com.assimilate.springboot.web.mvc.services;

import com.assimilate.springboot.web.mvc.services.*;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.assimilate.springboot.web.mvc.model.*;


@Repository
public interface StudentService {

	public int createStudent(Student student);

	

	public List<Student> getStudent();



	public Student getStudentById(int id);



	public int delete(int id);



	public int updateStudent(Student student);



	

	

	

}
