package com.colocho.code.springInterfaces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.colochocode.beans.Jugador;
import com.colochocode.interfaces.IEquipo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext  appContext = new 
        		ClassPathXmlApplicationContext("com/colochocode/xml/beans.xml");
    	List<String> lista = new ArrayList<>();
    	lista.add("jugador");
    	lista.add("jugador");
    	
    	try{
    		
    		for(String equipo : lista){
    			Jugador jugador= (Jugador)appContext.getBean(equipo);	
    			System.out.println("Nombre Jugador :"+jugador.getNombre());
    			System.out.println("Numero Jugador :"+jugador.getNumero());
    			System.out.println("FC  :"+jugador.getEquipo().mostrar());
    		}
    	  
    	} catch (NoSuchBeanDefinitionException e) {
			System.err.println("Bean no encontrado :"+e.getMessage());
		}
        catch (Exception e) {
        	e.printStackTrace();
			System.out.println("Otro error "+e.getMessage());
		}finally {
			((ConfigurableApplicationContext)appContext).close();	
		}
        
    }
}
