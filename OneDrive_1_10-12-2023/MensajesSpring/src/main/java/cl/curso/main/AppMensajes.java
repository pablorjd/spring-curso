package cl.curso.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.curso.tipo.IMensaje;

public class AppMensajes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext contexto	=	
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// crear una instancia de MensajeWSP
		IMensaje mensajeSms	=	contexto.getBean("mensajeSMS",IMensaje.class);
		
		mensajeSms.enviarMensaje();

	}

}
