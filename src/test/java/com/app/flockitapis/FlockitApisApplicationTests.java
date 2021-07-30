package com.app.flockitapis;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.AssertionErrors;

import com.app.flockitapis.dto.LoginRequest;
import com.app.flockitapis.model.User;
import com.app.flockitapis.repository.UserRepository;
import com.app.flockitapis.service.ProvinciaService;
import com.app.flockitapis.service.UserService;
import com.app.flockitapis.service.serviceImpl.ProvinciaServiceImpl;

import junit.framework.Assert;

//@SpringBootTest(classes= {ProvinciaService.class})
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)

class FlockitApisApplicationTests {
	
	@Autowired UserRepository userRepository;
	@InjectMocks ProvinciaServiceImpl provinciaService;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testUsuarioExistenteEnBD() {
		User userTest=new User("pquinci","pquinci@gmail.com","1234");
		
		List<User> usuarios= userRepository.findAll();
		assertNotNull(usuarios.stream().filter(p->p.getUsername().contentEquals(userTest.getUsername())).collect(Collectors.toList()).get(0));
	}
	
	@Test	
	public void testUsuarioInexistenteEnBD() {
		User userTest=new User("pquinci2","pquinci2@gmail.com","1234");
		
		List<User> usuarios= userRepository.findAll();
		assertNotNull(usuarios.stream().filter(p->p.getUsername().contentEquals(userTest.getUsername())).collect(Collectors.toList()).get(0));
	}
	
	@Test
	public void testProvinciaExistente() {
		String prov=provinciaService.buscarProvincia("Misiones").getNombre();
		assertEquals("Misiones",prov);
	}
	
	public void testProvincias() {
		
	}

}
