package cl.curso.id.funcion;

import cl.curso.id.tipo.IFuncion;

public class Arquero implements IFuncion{

	@Override
	public String suFuncion() {
		// TODO Auto-generated method stub
		return "Atajar todos los posibles goles";
	}

	@Override
	public String suPosicion() {
		// TODO Auto-generated method stub
		return null;
	}
	// metodos del ciclo de vidd del bean Arquero
	public void inicioBeanArquero() {
		System.out.println("Inicio del ciclo de vida de una instancia o bean de Arquero !");
	}
	
	public void finBeanArquero() {
		System.out.println("Fin del ciclo de vida de la instancia de Arquero !");
	}

}
