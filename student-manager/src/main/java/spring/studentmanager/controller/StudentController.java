package spring.studentmanager.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.studentmanager.model.Student;
import spring.studentmanager.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method=RequestMethod.POST, path="/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return new ResponseEntity<>(studentService.save(student), HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/students/{studentId}")
	public ResponseEntity<Student> findById(@PathVariable int studentId) {
		return new ResponseEntity<>(studentService.findById(studentId), HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/students")
	public ResponseEntity<List<Student>> findAll() {
		return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, path="/students/{studentId}")
	public ResponseEntity<Void> deleteById(@PathVariable int studentId) {
		studentService.deleteById(studentId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.PUT, path="/students/{studentId}")
	public ResponseEntity<Student> updateById(@PathVariable int studentId, @RequestBody Student newStudent) {
		return new ResponseEntity<>(studentService.updateById(studentId, newStudent), HttpStatus.OK);
	}
}
