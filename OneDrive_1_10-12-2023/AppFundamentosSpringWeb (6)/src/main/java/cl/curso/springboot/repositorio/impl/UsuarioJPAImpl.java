package cl.curso.springboot.repositorio.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cl.curso.springboot.pojo.Usuario;
import cl.curso.springboot.repositorio.interfaz.IUsuarioJPA;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class UsuarioJPAImpl implements IUsuarioJPA {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Usuario> listarTodosLosUsuarios() {
		// TODO Auto-generated method stub
		return this.em.createQuery("from UsuarioJPA").getResultList();
	}

}
