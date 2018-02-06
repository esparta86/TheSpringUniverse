package com.colochocode.beans;

public class Jugador {
   private Integer idJugador;
   private Equipo equipo;
   private Camiseta camiseta;
   private String nombreJugador;
   
   
   public Integer getIdJugador() {
	return idJugador;
}
public void setIdJugador(Integer idJugador) {
	this.idJugador = idJugador;
}
public Equipo getEquipo() {
	return equipo;
}
public void setEquipo(Equipo equipo) {
	this.equipo = equipo;
}
public Camiseta getCamiseta() {
	return camiseta;
}
public void setCamiseta(Camiseta camiseta) {
	this.camiseta = camiseta;
}
public String getNombreJugador() {
	return nombreJugador;
}
public void setNombreJugador(String nombreJugador) {
	this.nombreJugador = nombreJugador;
}

}
