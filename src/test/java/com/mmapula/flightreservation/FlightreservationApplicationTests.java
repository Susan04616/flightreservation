package com.mmapula.flightreservation;

import com.mmapula.flightreservation.beans.User;
import com.mmapula.flightreservation.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlightreservationApplicationTests {

	@Autowired
	private UserRepository userRepository;
	@Test
	void contextLoads() {
		User user = new User();
		user.setEmail("susansusie04@gmail.com");
		user.setFirstName("Susan");
		user.setLastName("Phasha");

		userRepository.save(user);
	}

}
