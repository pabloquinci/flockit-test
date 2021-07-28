package com.app.flockitapis.dto;

import java.math.BigDecimal;

public class ProvinciaDTO {
	private CentroideDTO centroide;
	private Long id;
	private String nombre;

	public CentroideDTO getCentroide() {
		return centroide;
	}

	public void setCentroide(CentroideDTO centroide) {
		this.centroide = centroide;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
