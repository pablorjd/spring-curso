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
		
		
		IFuncion delantero	=	contexto.getBean("delantero", IFuncion.class);
		
		System.out.println(delantero.suFuncion());
		System.out.println(delantero.suPosicion());
		
		IFuncion delantero1	=	contexto.getBean("delantero", IFuncion.class);
		
		System.out.println(delantero1.suFuncion());
		System.out.println(delantero1.suPosicion());
		
		if(delantero.equals(delantero1)) {
			System.out.println("Son la misma instancia !");
		}else {
			System.out.println("Son distintas instancias !");
		}
		
		IFuncion arquero	=	contexto.getBean("arquero", IFuncion.class);
		
		System.out.println(arquero.suFuncion());
		// terminar el conetxto de Spring
		contexto.close();

	}

}
