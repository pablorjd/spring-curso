package cl.curso.id.anotaciones.funcion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.curso.id.anotaciones.tipo.IFuncion;
import cl.curso.id.anotaciones.tipo.IPosicion;

@Component("reserva")
public class Reserva implements IFuncion {

	@Autowired
	private IPosicion posicionDefensa;
	
	@Override
	public String suFuncion() {
		// TODO Auto-generated method stub
		return "Remeplzar a otros jugadores cuasndo el entrenador lo solicite";
	}

	@Override
	public String suPosicion() {
		// TODO Auto-generated method stub
		return this.posicionDefensa.posicionAsignada() + " desde el reserva!";
	}

}
