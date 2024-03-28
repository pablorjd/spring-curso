package cl.curso.springboot.repository.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Repository;

import cl.curso.springboot.entity.UsuarioEntity;
import cl.curso.springboot.pojo.Usuario;
import cl.curso.springboot.repository.intefaces.IUsuarioRespository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
public class UsuarioJPAImpl implements IUsuarioRespository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Usuario> listarTodosLosUsuarioJPA() {
		return this.em.createQuery("from UsuarioEntity").getResultList();
	}

	@Override
	public Usuario buscarporID(Integer id) {
		// TODO Auto-generated method stub
		UsuarioEntity usu = this.em.find(UsuarioEntity.class, id);
		return new Usuario(usu.getNombre(), usu.getApellido(), usu.getEmail());
		//return null;
	}

	@Override
	@Transactional
	public void agregarUsuarioJPA(String nombre, String apellido, String email) {
		// TODO Auto-generated method stub
		UsuarioEntity user = new UsuarioEntity();
		user.setNombre(nombre);
		user.setApellido(apellido);
		user.setEmail(email);
		
		this.em.persist(user);	
	}

	@Override
	@Transactional
	public void editEmail(Integer id, String correo) {
		// TODO Auto-generated method stub
		Usuario userMod = this.buscarporID(id);
		if (Objects.nonNull(userMod)) {
			UsuarioEntity user = new UsuarioEntity(id,userMod.getNombre(),userMod.getApellido(),correo);
			this.em.merge(user);
		}
		
	}

}
