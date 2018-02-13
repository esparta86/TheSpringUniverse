package com.colochocode.dao;

import java.sql.ResultSet;
import java.util.List;

import com.colochocode.beans.Jugador;

public interface DAOJugador {
	
	public void registrar(Jugador jugador) throws Exception;
	
	public List<Jugador> listarJugadores() throws Exception;
	
	public List<Jugador> recuperarListaResultSet(ResultSet resultSet) throws Exception;
		
	

}
