package com.app.flockitapis.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.flockitapis.dto.JwtResponse;
import com.app.flockitapis.dto.LoginRequest;
import com.app.flockitapis.dto.MessageResponse;
import com.app.flockitapis.dto.SignupRequest;
import com.app.flockitapis.model.ERole;
import com.app.flockitapis.model.Role;
import com.app.flockitapis.model.User;
import com.app.flockitapis.repository.RoleRepository;
import com.app.flockitapis.repository.UserRepository;
import com.app.flockitapis.security.JwtUtils;
import com.app.flockitapis.security.UserDetailsImpl;
import com.app.flockitapis.service.UserService;

@RestController
@RequestMapping("/flockit")
@CrossOrigin("http://localhost:8080")
public class LoginController {
	  private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired UserService userService;
	@PostMapping("/login")
	private ResponseEntity<?>login(HttpServletRequest request,@RequestBody LoginRequest loginRequest){
		
		JwtResponse responseLogin=userService.login(loginRequest);
		return ResponseEntity.ok(responseLogin);

	}
	
	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody SignupRequest signUpRequest) {
		
		ResponseEntity response=userService.registrarse(signUpRequest);
		return ResponseEntity.ok(new MessageResponse("Usuario Registradoª"));

	}

}
