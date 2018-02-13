package com.colochocode.service;

import java.util.List;

import com.colochocode.beans.Jugador;

public interface ServiceJugador {
	
	public void registrar(Jugador jugador) throws Exception;
	
	public List<Jugador> enlistarJugadores() throws Exception;

}
