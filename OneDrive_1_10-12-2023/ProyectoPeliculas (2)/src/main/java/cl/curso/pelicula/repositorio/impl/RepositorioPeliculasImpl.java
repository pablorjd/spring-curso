package cl.curso.pelicula.repositorio.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import cl.curso.pelicula.pojo.Pelicula;
import cl.curso.pelicula.repositorio.IRepositorioPeliculas;


public class RepositorioPeliculasImpl implements IRepositorioPeliculas {
	
	private List<Pelicula> listaDePeliculas = new ArrayList<Pelicula>();
	
	public RepositorioPeliculasImpl() {
		listaDePeliculas.add(new Pelicula(1,"Matrix","Hermanos Wachosky","Sci-Fi"));
		listaDePeliculas.add(new Pelicula(2,"Odisea 2001","Kubrik","Sci-Fi"));
		listaDePeliculas.add(new Pelicula(3,"Toys Story","Pixar","Infantil"));
		listaDePeliculas.add(new Pelicula(4,"Mision imposible","Director X","Aventuras"));
		listaDePeliculas.add(new Pelicula(5,"Star Wars","George Lucas","Sci-Fi"));

	}

	public List<Pelicula> listarTodasLasPeliculas() {
		// TODO Auto-generated method stub
		return this.listaDePeliculas;
	}

	public void agregarNuevaPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.listaDePeliculas.add(pelicula);
	}

	@Override
	public void modificarPelicula(Integer idPelicula, String nombreDirector) {
		// TODO Auto-generated method stub
		this.listaDePeliculas.stream().filter(p -> p.getIdPelicula() == idPelicula).findFirst().get().setDirectorPelicula(nombreDirector);
	}

	@Override
	public void eliminarPelicula(Integer idPelicula) {
		// TODO Auto-generated method stub
		Predicate<Pelicula> seEliminaUnaPelicula = pel -> pel.getIdPelicula() == idPelicula;
		this.listaDePeliculas.removeIf(seEliminaUnaPelicula);
	}

	@Override
	public List<Pelicula> buscarPeliculasPorGenero(String generoPelicula) {
		// TODO Auto-generated method stub
		List<Pelicula> listaPel = new ArrayList<Pelicula>();

		for(Pelicula p : this.listaDePeliculas) {
			if(p.getGeneroPelicula().equalsIgnoreCase(generoPelicula)) {
				listaPel.add(p);
			}
		}
		return listaPel;
	}

	
}
