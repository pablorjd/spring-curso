package cl.curso.id.anotaciones.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.curso.id.anotaciones.tipo.IFuncion;

public class AppInicioAnotaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contexto	=	new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		IFuncion reserva	=	contexto.getBean("reserva", IFuncion.class);
		
		System.out.println(reserva.suFuncion());
		System.out.println(reserva.suPosicion());

	}

}
