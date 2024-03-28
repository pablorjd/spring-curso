package cl.curso.id.anotaciones.funcion;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;

import cl.curso.id.anotaciones.tipo.IFuncion;
import cl.curso.id.anotaciones.tipo.IPosicion;



//  con esta marca que le pusimos a clase reserva spring 
//  se da cuenta que debe de manejar el ciclo de vida de la clase que definimos como bean 
@Component
public class Reserva implements IFuncion {
	
	@Autowired
	private IPosicion posicionDefensa;

	@Override
	public String suFuncion() {
		// TODO Auto-generated method stub
		return "Remplazar a otros jugadores cuando el entrenador lo solicite";
	}

	@Override
	public String suPosicion() {
		// TODO Auto-generated method stub
		return this.posicionDefensa.posicionAsignada() + "desde el reserva";
	}

}
