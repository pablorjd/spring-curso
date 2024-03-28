package cl.curso.pelicula.repositorio;

import java.util.List;

import cl.curso.pelicula.pojo.Pelicula;

public interface IRepositorioPeliculas {

	public List<Pelicula> listarTodasLasPeliculas();
	public void agregarNuevaPelicula(Pelicula pelicula);
	
	public void modificarPelicula(Integer idPelicula, String nombreDirector);
	public void eliminarPelicula(Integer idPelicula);
	public List<Pelicula> buscarPeliculasPorGenero(String generoPelicula);
}
