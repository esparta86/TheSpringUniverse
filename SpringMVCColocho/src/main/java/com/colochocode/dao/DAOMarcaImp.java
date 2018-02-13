package com.colochocode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.colochocode.beans.Marca;

@Repository
public class DAOMarcaImp implements DAOMarca {
    
	@Autowired
    private DataSource dataSourceMysql;
    
	
	public void registrar(Marca marca) throws Exception {
		String sql="INSERT INTO marca(id_marca,nombre_marca)"
				+ " VALUES(?,?)";
		Connection connection = null;
		try{
		connection = dataSourceMysql.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, marca.getIdMarca());
		preparedStatement.setString(2, marca.getNombreMarca());
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

}
