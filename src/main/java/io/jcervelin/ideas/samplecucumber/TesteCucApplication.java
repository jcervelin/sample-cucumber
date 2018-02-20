package io.jcervelin.ideas.samplecucumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TesteCucApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteCucApplication.class, args);
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable Long id) {
		User user = null;
		if (id == 1) {
			user = new User();
			user.setId(id);
			user.setName("John");
		}
		return user;
	}
}
