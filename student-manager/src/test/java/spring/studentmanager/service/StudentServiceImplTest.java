package spring.studentmanager.service;

import org.hibernate.validator.internal.util.privilegedactions.NewSchema;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.mockito.runners.MockitoJUnitRunner;

import spring.studentmanager.model.Student;
import spring.studentmanager.repository.StudentRepository;
import spring.studentmanager.service.impl.StudentServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceImplTest {
	@Mock
	private StudentRepository studentRepository;
	
	@InjectMocks
	private StudentServiceImpl studentServiceImpl;
	
	@Test
	public void testFindByIdWhenStudentFound() {
		Student expected = new Student();
		expected.setId(1);
		when(studentRepository.findById(1)).thenReturn(expected);
		assertEquals(expected, studentServiceImpl.findById(1));
	}
	
	@Test
	public void testFindByIdWhenStudentNotFound() {
		when(studentRepository.findById(1)).thenReturn(null);
		assertNull(studentServiceImpl.findById(1));
	}
	
	@Test
	public void testFindAllWhenStudentsFound() {
		when(studentRepository.findAll()).thenReturn(
				Arrays.asList(new Student()));
		assertFalse(studentServiceImpl.findAll().isEmpty());
	}
	
	@Test
	public void testFindAllWhenStudentsNotFound() {
		when(studentRepository.findAll()).thenReturn(
				null);
		assertNull(studentServiceImpl.findAll());
	}
	
	@Test
	public void testDeleteByIdVerifyRepositoryMethodCall() {
		studentServiceImpl.deleteById(1);
		verify(studentRepository).deleteById(1);
	}
	
	@Test
	public void testSaveStudentShouldReturnCreatedStudent() {
		Student originStudent = new Student();
		Student createdStudent = new Student();
		createdStudent.setId(1);
		when(studentRepository.save(originStudent)).thenReturn(createdStudent);
		assertEquals(createdStudent.getId(), studentServiceImpl.save(originStudent).getId());
	}
	
	@Test
	public void testUpdateStudentShouldReturnUpdatedStudent() {
		Student newStudent = new Student();
		newStudent.setFirstName("newname");
		
		Student existingStudent = new Student();
		existingStudent.setId(1);
		existingStudent.setFirstName("oldname");
		
		Student updatedStudent = new Student();
		updatedStudent.setId(1);
		updatedStudent.setFirstName("newname");
		
		when(studentRepository.findById(1)).thenReturn(existingStudent);
		when(studentRepository.save(existingStudent)).thenReturn(updatedStudent);
		Student actual = studentServiceImpl.updateById(1, newStudent);
		assertEquals(updatedStudent.getFirstName(), actual.getFirstName());
		assertEquals(updatedStudent.getId(), actual.getId());
	}
}
