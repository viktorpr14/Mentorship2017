package spring.studentmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private int id;
	@Column(name="first_name", nullable=false)
	private String firstName;
	@Column(name="last_name", nullable=false)
	private String lastName;
	@Column(name="inst_name")
	private String instName;
	@Column(name="course_num")
	private String courseNum;
	
}
