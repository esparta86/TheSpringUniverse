package com.colocho.code.beans;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
	@Value("Hola Lisandro..............................")
    private String saludo;
	
	@Value("35")
	private String valorBigDecimalStringA;
	
	private BigDecimal valorBigDecimal ;
	
	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public BigDecimal getValorBigDecimal() {
		return valorBigDecimal != null ? valorBigDecimal : new BigDecimal(valorBigDecimalStringA);
	}

	public void setValorBigDecimal(BigDecimal valorBigDecimal) {
		this.valorBigDecimal = valorBigDecimal;
	}

}
