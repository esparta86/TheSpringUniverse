package com.colochocode.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.colochocode.beans.Jugador;
import com.colochocode.service.ServiceJugador;

@Controller
public class HolaController {
	
	@RequestMapping("irHola")
	public ModelAndView redireccion(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hola");
		 List<String> lista = recuperarListaJugadores();
		if(lista != null){
			mav.addObject("listaJugadores", lista);
		}
	
		return mav;
	}
	
	
	private List<String>  recuperarListaJugadores(){
		  ApplicationContext  appContext = new 
		       		ClassPathXmlApplicationContext("com/colochocode/xml/beans.xml");
		  List<String> list = new ArrayList<String>();
		  try{
			  ServiceJugador serviceJugador = (ServiceJugador)appContext.getBean("serviceJugadorImp");
			  List<Jugador> lista =  serviceJugador.enlistarJugadores();
			  for(Jugador juga : lista){
				  list.add("ID : "+juga.getIdJugador()+" NOMBRE :"+juga.getNombreJugador());
			  }
			  
			  return list;
			  
		  }catch (NoSuchBeanDefinitionException e) {
				System.err.println("Bean no encontrado :"+e.getMessage());
			}
	       catch (Exception e) {
	       	e.printStackTrace();
				System.out.println("Otro error "+e.getMessage());
			}finally {
				((ConfigurableApplicationContext)appContext).close();	
			}
		return null;
	}

}
