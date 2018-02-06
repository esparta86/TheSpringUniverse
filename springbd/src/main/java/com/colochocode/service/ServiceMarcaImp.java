package com.colochocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colochocode.beans.Marca;
import com.colochocode.dao.DAOMarca;

@Service
public class ServiceMarcaImp implements ServiceMarca {

	@Autowired
    private DAOMarca daoMarca;
	
	public void registrar(Marca marca) throws Exception {
		try{
		daoMarca.registrar(marca);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
