package com.colochocode.beans;

public class Camiseta {
	
	
	public Integer getIdCamiseta() {
		return idCamiseta;
	}
	public void setIdCamiseta(Integer idCamiseta) {
		this.idCamiseta = idCamiseta;
	}
	public String getNumeroCamiseta() {
		return numeroCamiseta;
	}
	public void setNumeroCamiseta(String numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	private String numeroCamiseta;
	private Marca marca;
	private Integer idCamiseta;

}
