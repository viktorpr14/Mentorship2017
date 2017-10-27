package spring.studentmanager.service;

import java.util.List;

import spring.studentmanager.model.Student;

public interface StudentService {
	Student findById(Integer id);
	List<Student> findAll();
	void deleteById(Integer id);
	Student save(Student student);
	Student updateById(Integer studentId, Student student);
}
