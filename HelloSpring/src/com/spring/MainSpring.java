package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		// abre el contexto a partir del archivo de configuración 
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		obtiene el bean, donde:
		- el primer parámetro es el identificador del bean
		- el segundo parámetro es la interfaz que implementa el 
		bean a recibir, realizando 
		una especie casting
		*/
		Entrenador entrenaFut = context.getBean("mientrenaFut",
				Entrenador.class); 
		System.out.println(entrenaFut.getEntrenamiento());
		Entrenador entrenaBal = context.getBean("mientrenaBal",
				Entrenador.class); 
		System.out.println(entrenaBal.getEntrenamiento());
		// cierra el contexto 
		context.close();
	}

}
