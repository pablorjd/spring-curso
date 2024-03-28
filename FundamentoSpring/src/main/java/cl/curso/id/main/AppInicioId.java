package cl.curso.id.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.curso.id.tipo.IFuncion;

public class AppInicioId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		IFuncion defensa = contexto.getBean("defensa", IFuncion.class);
		
		System.out.println(defensa.suFuncion());
		System.out.println(defensa.suPosicion());
		
		IFuncion delantero = contexto.getBean("delantero", IFuncion.class);
		System.out.println(delantero.suFuncion());
		System.out.println(delantero.suPosicion());
		
		IFuncion delantero1 = contexto.getBean("delantero", IFuncion.class);
		System.out.println(delantero1.suFuncion());
		System.out.println(delantero1.suPosicion());
		
		// spring cuando crea instancia por defecto las crea con el patrón singleton
		// esto se puede cambiar por cada bean que se maneja 
		
		if(delantero.equals(delantero1)) {
			System.out.println("Son la misma instancia");
		}else {
			System.out.println("No la misma instancia");
			
		}
		
		IFuncion arquero = contexto.getBean("arquero", IFuncion.class);
		System.out.println(arquero.suFuncion());
		
		contexto.close();
	}

}
