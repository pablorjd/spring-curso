package cl.curso.pelicula.services.impl;

import java.util.ArrayList;
import java.util.List;

import cl.curso.pelicula.pojo.Pelicula;
import cl.curso.pelicula.repositorio.IRepositorioPeliculas;
import cl.curso.pelicula.repositorio.impl.RepositorioPeliculasImpl;
import cl.curso.pelicula.services.IServiciosPelicula;
import cl.curso.pelicula.util.ValidadorPeliculas;

public class ServiciosPeliculaImpl implements IServiciosPelicula {

	private IRepositorioPeliculas repoPeliculas = new RepositorioPeliculasImpl();
	
	public List<Pelicula> listarTodasLasPeliculas() {
		// TODO Auto-generated method stub
		return this.repoPeliculas.listarTodasLasPeliculas();
	}

	public void agregarNuevaPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		if(ValidadorPeliculas.rangoNumerico(pelicula.getIdPelicula())) {
			this.repoPeliculas.agregarNuevaPelicula(pelicula);
		}
	}

	@Override
	public void modificarPelicula(Integer idPelicula, String nombreDirector) {
		// TODO Auto-generated method stub
		this.repoPeliculas.modificarPelicula(idPelicula, nombreDirector);
		
	}

	@Override
	public void eliminarPelicula(Integer idPelicula) {
		// TODO Auto-generated method stub
		this.repoPeliculas.eliminarPelicula(idPelicula);
	}

	@Override
	public List<Pelicula> buscarPeliculasPorGenero(String generoPelicula) {
		// TODO Auto-generated method stub
		if(!ValidadorPeliculas.textoVacio(generoPelicula)) {
			return this.repoPeliculas.buscarPeliculasPorGenero(generoPelicula);
		}
		List<Pelicula> listaVacia = new  ArrayList<Pelicula>();
		return listaVacia;
	}

}
