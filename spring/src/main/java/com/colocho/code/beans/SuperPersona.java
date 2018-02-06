package com.colocho.code.beans;

import javax.annotation.PostConstruct;

public abstract class SuperPersona {
	
	@PostConstruct
	private void inicializarBean(){
		System.out.println("Inicializando Bean en SuperClase");
	}
	
	
	private void cerrandoBean(){
		System.out.println("Cerrando Bean en SuperClase");
	}

}
