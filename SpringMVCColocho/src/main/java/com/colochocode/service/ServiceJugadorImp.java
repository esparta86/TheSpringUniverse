package com.colochocode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colochocode.beans.Jugador;
import com.colochocode.dao.DAOJugador;

@Service
public class ServiceJugadorImp implements ServiceJugador{
	
	@Autowired
	private DAOJugador daoJugador;

	public void registrar(Jugador jugador) throws Exception {
		try{
			daoJugador.registrar(jugador);
		}catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public List<Jugador> enlistarJugadores() throws Exception {
		try{
			return daoJugador.listarJugadores();
		}catch (Exception e) {
			throw e;
		}
	}

}
