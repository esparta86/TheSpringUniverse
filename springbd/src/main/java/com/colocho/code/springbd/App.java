package com.colocho.code.springbd;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.colochocode.beans.Marca;
import com.colochocode.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Marca marca = new Marca();
       marca.setIdMarca(2);
       marca.setNombreMarca("Adidas");
       
       ApplicationContext  appContext = new 
       		ClassPathXmlApplicationContext("com/colochocode/xml/beans.xml");
       
       try{
    	   
    	   ServiceMarca serviceMarca = (ServiceMarca)appContext.getBean("serviceMarcaImp");
    	   serviceMarca.registrar(marca);
    	   
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
