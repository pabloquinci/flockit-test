package com.app.flockitapis.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.flockitapis.dto.ProvinciaDTO;

@RestController
@RequestMapping("/flockit")
public class ProvinciaController {
	
	/*@Autowired
	private RestTemplate clienteRest;*/
	
	@GetMapping("/getProvincia/{nombre}")
	public ResponseEntity<?> getProvincia(HttpServletRequest request, @RequestParam String nombre){
		RestTemplate clienteRest= new RestTemplate();
		List<ProvinciaDTO> provincias= Arrays.asList(clienteRest.getForObject("https://apis.datos.gob.ar/georef/api/provincias", ProvinciaDTO[].class));
		
		return ResponseEntity.ok(provincias);
	}

}
