package com.colocho.code.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//import javax.annotation.PostConstruct;

public class Persona implements InitializingBean,DisposableBean  /*extends SuperPersona*/{
	   private int id;
	   private String nombre;
	   private String apodo;
	   
	   private Pais pais;
	   private Ciudad ciudad;
	   
	   public Persona(){
		   System.out.println("Inicializando Intancia en Constructor persona id"+id);
	   }
	   
	   /*
	   private void inicializarBean(){
			System.out.println("Inicializando Bean en Consrtructor");
		}*/
	
	
	   
   public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public void destroy() throws Exception {
		System.out.println("PRE Destroy Bean en Consrtructor");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("INICIALIZANDO USANDO InitializingBean "+id);
	}

}
