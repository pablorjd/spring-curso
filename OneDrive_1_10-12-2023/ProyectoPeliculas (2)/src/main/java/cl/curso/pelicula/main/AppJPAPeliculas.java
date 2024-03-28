package cl.curso.pelicula.main;

import cl.curso.pelicula.entidad.Pelicula;
import cl.curso.pelicula.services.IServiciosJPAPelicula;
import cl.curso.pelicula.services.impl.ServiciosJPAPeliculaImpl;

public class AppJPAPeliculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IServiciosJPAPelicula	isj	=	new ServiciosJPAPeliculaImpl();
		
		// agregar una nueva pelicula
		Pelicula pel	=	new Pelicula(1, "Matrix", "Hermanos Wachosky", "sci-fi");
		isj.agregarPelicula(pel);

	}

}
