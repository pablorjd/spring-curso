package cl.curso.id.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.curso.id.tipo.IFuncion;

public class AppInicioID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contexto	=	new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		IFuncion defensa	=	contexto.getBean("defensa", IFuncion.class);
		
		System.out.println(defensa.suFuncion());
		System.out.println(defensa.suPosicion());

	}

}
