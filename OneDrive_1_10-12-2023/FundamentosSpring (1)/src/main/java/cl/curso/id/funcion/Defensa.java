package cl.curso.id.funcion;

import cl.curso.id.tipo.IFuncion;
import cl.curso.id.tipo.IPosicion;

public class Defensa implements IFuncion {
	
	// ID x constructor
	private IPosicion posicion;
	
	public Defensa() {
		
	}
	
	public Defensa(IPosicion posicion) {
		this.posicion	=	posicion;
	}

	public String suFuncion() {
		return "Defender mi arco de ataques del rival";
	}

	@Override
	public String suPosicion() {
		// TODO Auto-generated method stub
		// se mostrara la posicion asignada a defensa
		return this.posicion.posicionAsignada();
	}
}
