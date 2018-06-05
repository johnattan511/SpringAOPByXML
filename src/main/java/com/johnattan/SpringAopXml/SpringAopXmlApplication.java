package com.johnattan.SpringAopXml;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ClasePrueba;

@SpringBootApplication
public class SpringAopXmlApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringAopXmlApplication.class, args);
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("Beans.xml");
		
		ClasePrueba p = (ClasePrueba)ap.getBean("ClasePrueba");
		p.metodo1();
		try {
			p.metodo2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
