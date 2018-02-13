package com.colochocode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.colochocode.beans.Jugador;

@Repository
public class DAOJugadorImp implements DAOJugador {
	
	@Autowired
	private DataSource dataSourceMysql;

	public void registrar(Jugador jugador) throws Exception {
		String sql="INSERT INTO jugador(id_jugador,id_equipo,id_camiseta,nombre_jugador)"
				+ " VALUES(?,?,?,?)";
		Connection connection = null;
		
		try{
			connection = dataSourceMysql.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, jugador.getIdJugador());
			preparedStatement.setInt(2, jugador.getEquipo().getIdEquipo());
			preparedStatement.setInt(3, jugador.getCamiseta().getIdCamiseta());
			preparedStatement.setString(4,jugador.getNombreJugador());
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}finally {
			if(connection != null)
			    connection.close();
		}
		
	}

	@Override
	public List<Jugador> listarJugadores() throws Exception {
		 List<Jugador>  lista ;
		String sql="SELECT * FROM jugador";
				
		Connection connection = null;
		ResultSet resulset = null;
		try{
			connection = dataSourceMysql.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			resulset = preparedStatement.executeQuery();
			
			lista = recuperarListaResultSet(resulset);
			
			preparedStatement.close();
			
			return lista;
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}finally {
			if(connection != null)
			    connection.close();
		}
		
	}

	@Override
	public List<Jugador> recuperarListaResultSet(ResultSet resultSet) throws Exception {
	   List<Jugador>  lista = new ArrayList<>();
	   try{
		   while(resultSet.next()){
			   Jugador jugador = new Jugador();
			   jugador.setIdJugador(resultSet.getInt("ID_JUGADOR"));
			   jugador.setNombreJugador(resultSet.getString("NOMBRE_JUGADOR"));
			   
			   lista.add(jugador);
		   }
		   
		   return lista;
	   }catch(Exception e){
		   throw e;
	   }
	}

}
