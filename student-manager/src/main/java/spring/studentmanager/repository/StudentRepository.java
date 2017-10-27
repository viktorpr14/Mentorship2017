package spring.studentmanager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.studentmanager.model.Student;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer>{
	Student findById(Integer id);
	List<Student> findAll();
	void deleteById(Integer id);
	Student save(Student student);
}
