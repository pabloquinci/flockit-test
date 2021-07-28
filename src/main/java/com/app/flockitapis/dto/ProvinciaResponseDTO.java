package com.app.flockitapis.dto;

import java.math.BigDecimal;
import java.util.List;

public class ProvinciaResponseDTO {

	private BigDecimal cantidad;
	private ParametrosDTO parametros;
	private List<ProvinciaDTO> provincias;
	private BigDecimal total;

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public ParametrosDTO getParametros() {
		return parametros;
	}

	public void setParametros(ParametrosDTO parametros) {
		this.parametros = parametros;
	}

	public List<ProvinciaDTO> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<ProvinciaDTO> provincias) {
		this.provincias = provincias;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
