package xv.training.springbootex.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xv.training.springbootex.entities.Student;
import xv.training.springbootex.repositories.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping("/students")
	public Iterable<Student> getStudents(){
		return studentRepository.findAll();
		
	}
}
