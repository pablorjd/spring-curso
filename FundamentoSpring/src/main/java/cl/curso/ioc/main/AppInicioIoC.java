package cl.curso.ioc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.curso.ioc.funcion.Defensa;
import cl.curso.ioc.funcion.Delantero;
import cl.curso.ioc.tipo.IFuncion;

public class AppInicioIoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delantero delantero = new Delantero();	
		System.out.println(delantero.suFuncion());
		
		
		Defensa def = new Defensa();
		System.out.println(def.suFuncion());
		
	
		
		// Intancias con el cod IoC buscar sobre el Patrón Inversion of Control
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IFuncion del = contexto.getBean("delantero", IFuncion.class);
		System.out.println(del.suFuncion());
		
		IFuncion def1 = contexto.getBean("defensa", IFuncion.class);
		
		System.out.println(def1.suFuncion());
		
		IFuncion arquero = contexto.getBean("arquero", IFuncion.class);
		
		System.out.println(arquero.suFuncion());
		contexto.close();
	}

}
