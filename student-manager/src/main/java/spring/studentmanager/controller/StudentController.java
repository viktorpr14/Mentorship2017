package spring.studentmanager.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.studentmanager.Student;

@RestController
public class StudentController {
	private static List<Student> students = new LinkedList<>();
	
	@RequestMapping(method=RequestMethod.POST, path="/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		int studentId = students.size();
		student.setId(studentId);
		students.add(student);
		return new ResponseEntity<>(student, HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/students/{studentId}")
	public ResponseEntity<Student> findById(@PathVariable int studentId) {
		Student foundStudent = students.stream()
				.filter(s->s.getId()==studentId)
				.findFirst().orElse(null);
		return new ResponseEntity<>(foundStudent, HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.GET, path="/students")
	public ResponseEntity<List<Student>> findAll() {
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.DELETE, path="/students/{studentId}")
	public ResponseEntity<Student> deleteById(@PathVariable int studentId) {
		Student student = students.stream()
				.filter(s->s.getId()==studentId)
				.findFirst().orElse(null);
		if(student != null) {
			students.removeIf(s->s.getId()==studentId);
		}
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.PUT, path="/students/{studentId}")
	public ResponseEntity<Student> updateById(@PathVariable int studentId, @RequestBody Student newStudent) {
		Student student = students.stream()
				.filter(s->s.getId()==studentId)
				.findFirst().orElse(null);
		if(student != null) {
			student.setFirstName(newStudent.getFirstName());
			student.setLastName(newStudent.getLastName());
			student.setInstName(newStudent.getInstName());
			student.setCourseNum(newStudent.getCourseNum());
		}
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
}
