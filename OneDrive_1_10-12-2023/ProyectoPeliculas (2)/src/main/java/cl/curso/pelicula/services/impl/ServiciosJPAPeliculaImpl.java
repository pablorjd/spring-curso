package cl.curso.pelicula.services.impl;

import cl.curso.pelicula.entidad.Pelicula;
import cl.curso.pelicula.repositorio.IRepositorioJPAPeliculas;
import cl.curso.pelicula.repositorio.impl.RepositorioJPAPeliculasImpl;
import cl.curso.pelicula.services.IServiciosJPAPelicula;

public class ServiciosJPAPeliculaImpl implements IServiciosJPAPelicula {

	private IRepositorioJPAPeliculas irj	=	new RepositorioJPAPeliculasImpl();
	@Override
	public void agregarPelicula(Pelicula pel) {
		// TODO Auto-generated method stub
		irj.agregarPelicula(pel);
	}

}
