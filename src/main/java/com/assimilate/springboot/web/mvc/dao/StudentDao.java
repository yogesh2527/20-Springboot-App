package com.assimilate.springboot.web.mvc.dao;
import com.assimilate.springboot.web.mvc.model.Student;



import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public interface StudentDao {

	int save(Student student);

	List<Student> getAllStudent();

	Student getByIdStudent(int id);

	int deleteStud(int id);

	int update(Student student);
	
}
