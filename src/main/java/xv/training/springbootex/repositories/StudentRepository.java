package xv.training.springbootex.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import xv.training.springbootex.entities.Student;

@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student, Long> {

	List<Student>findByName(@Param("name") String name);
	
	List<Student>findByAge(int age);
	
	List<Student> findByQualification(String qualification);
	
	List<Student> findByNameAndQualification(String name, String qualification);
	
	List<Student> findByNameAndAge(String name, int age);
	
	//@Query("select s from Student s where s.name = ?1")
	//List<Student>findByName1(String name);
}
