package xv.training.springbootex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import xv.training.springbootex.entities.Organization;
import xv.training.springbootex.entities.Student;
import xv.training.springbootex.repositories.OraganizationRepository;
import xv.training.springbootex.repositories.StudentRepository;

@SpringBootApplication
public class SpringbootexApplication {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private OraganizationRepository organizationRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootexApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
	return args -> {
		
		Organization organization1 = new Organization("Delhi University" , "Delhi University");
		Organization organization2 = new Organization("Karnatak University" , "Karnatak University");
		
		organizationRepository.save(organization1);
		organizationRepository.save(organization2);

		
		studentRepository.save(new Student("Srinivas", "Male", "BE", 25,organization2));
		studentRepository.save(new Student("Nesha", "Female", "BE", 20,organization1));
		studentRepository.save(new Student("Seema", "Female", "BTech", 30,organization2));
		studentRepository.save(new Student("Suraj", "Male", "Electrical Engineer", 35,organization1));
	};
	}

}
