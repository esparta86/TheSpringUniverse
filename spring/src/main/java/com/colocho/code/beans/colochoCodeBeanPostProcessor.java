package com.colocho.code.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class colochoCodeBeanPostProcessor implements BeanPostProcessor {
	
	public Object postProcessAfterInitialization(Object arg0,String arg1) throws BeansException{
		
		System.out.println("EJECUTANDO postProcessAfterInitialization DESPUES DE INICIALIZACION para "+arg1);
		return null;
	}
	
	public Object postProcessBeforeInitialization(Object arg0,String arg1) throws BeansException{
		System.out.println("EJECUTANDO postProcessBeforeInitialization ANTES  DE INICIALIZACION para "+arg1);
		return null;
		
	}
 
}
