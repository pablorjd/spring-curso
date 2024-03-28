package cl.curso.ioc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.curso.ioc.funcion.Defensa;
import cl.curso.ioc.funcion.Delantero;
import cl.curso.ioc.tipo.IFuncion;

public class AppInicioIoC {

	public static void main(String[] args) {
		// TODO Codigo para crear instancias sin IoC
		Delantero delantero = new Delantero();
		System.out.println(delantero.suFuncion());
		
		Defensa defensa = new Defensa();
		System.out.println(defensa.suFuncion());
		
		// Codigo opara crear instancias con IoC ... utilizando Spring
		ClassPathXmlApplicationContext contexto	=	new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IFuncion delantero1		=	contexto.getBean("delantero", IFuncion.class);
		System.out.println(delantero1.suFuncion());
		
		IFuncion defensa1		=	 contexto.getBean("defensa", IFuncion.class);
		System.out.println(defensa1.suFuncion());
		
		IFuncion arquero		=	contexto.getBean("arquero", IFuncion.class);
		System.out.println(arquero.suFuncion());
		
	}

}
