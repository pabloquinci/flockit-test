package com.app.flockitapis.service;

import org.springframework.http.ResponseEntity;

import com.app.flockitapis.dto.JwtResponse;
import com.app.flockitapis.dto.LoginRequest;
import com.app.flockitapis.dto.SignupRequest;

public interface UserService {
	
	public JwtResponse login(LoginRequest request);
	
	public ResponseEntity<?> registrarse(SignupRequest request);

}
