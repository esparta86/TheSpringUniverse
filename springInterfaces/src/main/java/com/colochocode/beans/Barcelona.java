package com.colochocode.beans;

import org.springframework.stereotype.Component;

import com.colochocode.interfaces.IEquipo;
@Component
public class Barcelona implements IEquipo {

	@Override
	public String mostrar() {
		return "Barcelona FC";
	}

}
