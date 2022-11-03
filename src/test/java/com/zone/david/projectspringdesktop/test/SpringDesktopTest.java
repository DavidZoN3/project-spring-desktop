/**
 * 
 */
package com.zone.david.projectspringdesktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zone.david.projectspringdesktop.dao.DisqueraDAO;

/**
 * @author david ZoNe Clase de prueba unitaria, que permite realizar pruebas con
 *         el framework spring
 *
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);

		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);

		DisqueraDAO disqueraDAONuevo = (DisqueraDAO) context.getBean("disqueraDAO");

		System.out.println("Contexto cargado exitosamente");
		System.out.println(disqueraDAO);
		System.out.println(disqueraDAONuevo);

		// :::::::::::PROPERTIES :::::::::::::::::::::.
		Properties properties = (Properties) context.getBean("properties");
		System.out.println(properties.get("spring-username"));
	}
}
