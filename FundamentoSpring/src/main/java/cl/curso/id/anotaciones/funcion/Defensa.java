package cl.curso.id.anotaciones.funcion;

import cl.curso.id.anotaciones.tipo.IFuncion;
import cl.curso.id.anotaciones.tipo.IPosicion;



public class Defensa implements IFuncion {
	
	// Inyeccion de dependencias por constructor
	private IPosicion posicion;
	
	public Defensa() {
		
	}
	
	public Defensa(IPosicion posicion) {
		this.posicion = posicion;
	}
	
	public String suFuncion() {
		return "Defender la porteria de los ataques del oponente";
	}

	@Override
	public String suPosicion() {
		// TODO Auto-generated method stub
		// Se mostrara la posicion asignada a Defensa
		return this.posicion.posicionAsignada();
	}

}