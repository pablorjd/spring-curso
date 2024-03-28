package cl.curso.id.anotaciones.funcion;

import cl.curso.id.anotaciones.tipo.IFuncion;

public class Arquero implements IFuncion {

	@Override
	public String suFuncion() {
		// TODO Auto-generated method stub
		return "Mi Función es tapar todos los tiros de mi Oponente";
	}

	@Override
	public String suPosicion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * Metodos del ciclo de vida del bean Arquero 
	 * */
	public void initBeanArquero() {
		System.out.println("Inicio del ciclo de vida de una intancia o bean Arquero, Se ejecuto el metodo initBeanArquero");
	}
	public void destroyBeanArquero() {
		System.out.println("Destruccion del ciclo de vida del bean Arquero, Se ejecuto el metodo destroyBeanArquero()");
	}
}
