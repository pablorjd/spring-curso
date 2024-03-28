package cl.curso.pelicula.service;

import java.util.List;

import cl.curso.pelicula.pojo.Pelicula;

public interface IServicioPelicula {
	
	public List<Pelicula> buscarPelicula();
	public List<Pelicula> getAllPelicula();
	public void addPelicula(Pelicula pe);
	public void deletePelicula(Integer idPelicula);
	public void editPelicula(Integer idPelicula);

}
