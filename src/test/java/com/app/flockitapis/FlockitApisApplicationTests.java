package com.app.flockitapis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.flockitapis.model.User;
import com.app.flockitapis.repository.UserRepository;

//@SpringBootTest
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
class FlockitApisApplicationTests {
	
	@Autowired UserRepository userRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testUsuarioLogueado() {
		
		List<User> usuarios= userRepository.findAll();
		
		
		
		assertEquals(1, 1);
		
	}
	
	public void testProvincias() {
		
	}

}
