package com.app.flockitapis.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.flockitapis.dto.ProvinciaDTO;
import com.app.flockitapis.dto.ProvinciaResponseDTO;

@RestController
@RequestMapping("/flockit")
public class ProvinciaController {
	
	/*@Autowired
	private RestTemplate clienteRest;*/
	
	@GetMapping("/getProvincia")
	public ResponseEntity<?> getProvincia(HttpServletRequest request, @RequestParam String nombre){
		RestTemplate clienteRest= new RestTemplate();
		ProvinciaResponseDTO provincias= clienteRest.getForObject("https://apis.datos.gob.ar/georef/api/provincias", ProvinciaResponseDTO.class);
		ProvinciaDTO provinciaBuscadaDto=provincias.getProvincias().stream().filter(p->p.getNombre()==nombre).collect(Collectors.toList()).get(0);
		return ResponseEntity.ok(provinciaBuscadaDto);
	}

}
