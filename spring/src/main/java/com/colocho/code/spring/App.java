package com.colocho.code.spring;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.colocho.code.beans.AppConfig;
import com.colocho.code.beans.AppConfig2;
import com.colocho.code.beans.Ciudad;
import com.colocho.code.beans.Mundo;
import com.colocho.code.beans.Persona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  appContext = new 
        		ClassPathXmlApplicationContext("com/colocho/code/xml/beans.xml");
    	
    	/*ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);
    	AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.register(AppConfig.class);
        appContext.register(AppConfig2.class);
        appContext.refresh();*/
    	
    	
        try{
        Persona persona = (Persona)appContext.getBean("persona");
        
        //Persona persona2 = (Persona)appContext.getBean("persona");
        
        
        System.out.println("id:"+persona.getId());
        System.out.println("apodo:"+persona.getApodo());
        System.out.println("Pais:"+persona.getPais().getNombre());
        
        System.out.println("Ciudad:"+persona.getCiudad().getNombre());
       
        /*for(Ciudad ciudad : persona.getPais().getCiudades()){
        	System.out.println("Ciudad :"+ciudad.getNombre());
        }*/
        
        
        System.out.println("id clas persona"+persona);
        //System.out.println("id clas persona2"+persona2);
        
        
        
        }catch (NoSuchBeanDefinitionException e) {
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
