package com.app.flockitapis.service.serviceImpl;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.flockitapis.dto.ProvinciaDTO;
import com.app.flockitapis.dto.ProvinciaResponseDTO;
import com.app.flockitapis.service.ProvinciaService;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {
	RestTemplate clienteRest= new RestTemplate();

	@Override
	public ProvinciaDTO buscarProvincia(String nombreProvincia) {
		ProvinciaResponseDTO provincias= clienteRest.getForObject("https://apis.datos.gob.ar/georef/api/provincias", ProvinciaResponseDTO.class);
		ProvinciaDTO provinciaBuscadaDto=provincias.getProvincias().stream().filter(p->p.getNombre().contentEquals(nombreProvincia)).collect(Collectors.toList()).get(0);

		return provinciaBuscadaDto;
	}
}
