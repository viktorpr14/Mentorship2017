package spring.studentmanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.studentmanager.model.Student;
import spring.studentmanager.repository.StudentRepository;
import spring.studentmanager.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

	@Override
	public Student findById(Integer id) {
		return studentRepository.findById(id);
	}

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}
	@Override
	public Student updateById(Integer studentId, Student student) {
		Student foundStudent = findById(studentId);
		Student updatedStudent = null;
		if(foundStudent != null) {
			foundStudent.setFirstName(student.getFirstName());
			foundStudent.setLastName(student.getLastName());
			foundStudent.setInstName(student.getInstName());
			foundStudent.setCourseNum(student.getCourseNum());
			updatedStudent = studentRepository.save(foundStudent);
		}
		return updatedStudent;
	}
	
	
	
    
    
	
}
