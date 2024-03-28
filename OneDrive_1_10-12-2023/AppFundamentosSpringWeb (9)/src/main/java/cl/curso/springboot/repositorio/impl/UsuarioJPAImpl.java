package cl.curso.springboot.repositorio.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.curso.springboot.entidades.UsuarioJPA;
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

	@Override
	public Usuario buscarUsuarioPorId(Integer idUsuario) {
		// TODO Auto-generated method stub
		
		UsuarioJPA ujpa = this.em.find(UsuarioJPA.class, idUsuario);
		if(Objects.nonNull(ujpa)) {
			return new Usuario(ujpa.getNombre(), ujpa.getApellido(), ujpa.getEmail());
		}
		
		return null;
	}

	@Override
	@Transactional
	public void agregarUsuarioJPA(String nombre, String apellido, String email) {
		// TODO Auto-generated method stub
		UsuarioJPA ujpa	=	new UsuarioJPA();
		ujpa.setNombre(nombre);
		ujpa.setApellido(apellido);
		ujpa.setEmail(email);
		
		this.em.persist(ujpa);
	}
	
	// Ejercicios:
	/*
	 * 1. agregar un usuario pero recibiendo un POJO Usuario
	 * 2. this.merge(UsuarioJPA) => Actualizar el email de un Usuario dado su idUsuario
	 * 
	 * public void modificaEmailUsuario(Integer idUsuario, String emailUsuario)
	 */
	
	
	public void agregarUsuarioJPA(UsuarioJPA nuevoUsuario) {
		Usuario usuaTmp	=	this.buscarUsuarioPorId(nuevoUsuario.getIdUsuario());
		if(Objects.isNull(usuaTmp)) {
			this.em.persist(nuevoUsuario);
		}
	}
	
	@Override
	@Transactional
	public void modificaEmailUsuario(Integer idUsuario, String emailUsuario) {
		// TODO Auto-generated method stub
		Usuario u	=	this.buscarUsuarioPorId(idUsuario);
		if(Objects.nonNull(u)) {
			UsuarioJPA ujpa	=	new UsuarioJPA(idUsuario, u.getNombre(), u.getApellido(), emailUsuario);
			this.em.merge(ujpa);
		}
	}

	@Override
	@Transactional
	public void eliminaUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		this.em.remove(this.em.find(UsuarioJPA.class, idUsuario));
	}

}
