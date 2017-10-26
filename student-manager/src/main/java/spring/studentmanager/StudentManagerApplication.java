package spring.studentmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("spring.studentmanager")
@SpringBootApplication
public class StudentManagerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagerApplication.class, args);
	}
}
