package cl.curso.id.anotaciones.posicion;

import org.springframework.stereotype.Component;

import cl.curso.id.anotaciones.tipo.IPosicion;

@Component
public class PosicionAsignada implements IPosicion {

	@Override
	public String posicionAsignada() {
		// TODO Auto-generated method stub
		return "Posicion dada por el entrenador del primer equipo";
	}

}
