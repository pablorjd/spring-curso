package cl.curso.id.funcion;

import cl.curso.id.tipo.IFuncion;
import cl.curso.id.tipo.IPosicion;

public class Delantero implements IFuncion {
	
	private IPosicion posicion;
	
	
	
	public void setPosicion(IPosicion posicion) {
		this.posicion = posicion;
	}

	public String suFuncion() {
		return "Intentar anotar goles en la porteria oponente";
	}

	@Override
	public String suPosicion() {
		// TODO Auto-generated method stub
		return this.posicion.posicionAsignada()+ " a un delantero ";
	}
}
