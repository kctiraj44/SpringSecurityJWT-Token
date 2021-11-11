package com.springJwt.SpringJwt;

import com.springJwt.SpringJwt.model.User;
import com.springJwt.SpringJwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringJwtApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void init() {

		List<User> users = Stream.of(
				new User(521,"ram","ram","ram@gmail.com"),
				new User(524551,"ram1","ram1","ram@gmail.com")


				).collect(Collectors.toList());
			userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);
	}

}
