package cl.curso.pelicula.repositorio.impl;

import javax.persistence.EntityManager;

import cl.curso.pelicula.entidad.Pelicula;
import cl.curso.pelicula.repositorio.IRepositorioJPAPeliculas;
import cl.curso.pelicula.util.JPAUtil;

public class RepositorioJPAPeliculasImpl implements IRepositorioJPAPeliculas {

	private EntityManager em;
	
	public RepositorioJPAPeliculasImpl() {
		this.em	=	JPAUtil.crearEntityManagerFactory().createEntityManager();
	}
	@Override
	public void agregarPelicula(Pelicula pel) {
		// TODO Auto-generated method stub
		this.em.getTransaction().begin();
		this.em.persist(pel);
		this.em.getTransaction().commit();
	}

}
