package spring.studentmanager.controller;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import spring.studentmanager.model.Student;
import spring.studentmanager.service.StudentService;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class StudentManagerControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private StudentService studentService;
	
	@Test
	public void test() throws Exception{
		Student foundStudent = new Student();
		foundStudent.setFirstName("jinny");
		foundStudent.setId(1);
		Mockito.when(studentService.findById(1)).thenReturn(foundStudent);
		
		mvc.perform(MockMvcRequestBuilders.get("/students/1"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.id", Matchers.is(foundStudent.getId())));
	}
}
