package cl.curso.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.curso.springboot.pojo.Usuario;
import cl.curso.springboot.repository.intefaces.IUsuarioRespository;
import cl.curso.springboot.service.intefaces.IUsuarioServices;

@Service
public class UsuarioServicioImpl implements IUsuarioServices{
	
	@Autowired
	private IUsuarioRespository repoUsuarioJPA; 

	@Override
	public void agregarNuevoUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listarTodosLosUsuarios() {
		// TODO Auto-generated method stub
		return this.repoUsuarioJPA.listarTodosLosUsuarioJPA();
	}

	@Override
	public Usuario buscarUsuario(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listarTodosLosUsuarioJPA() {
		// TODO Auto-generated method stub
		return this.repoUsuarioJPA.listarTodosLosUsuarioJPA();
	}

	@Override
	public Usuario buscarporID(Integer id) {
		// TODO Auto-generated method stub
		return this.repoUsuarioJPA.buscarporID(id);
	}

	@Override
	public void agregarUsuarioJPA(String nombre, String apellido, String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editEmail(Integer id, String correo) {
		// TODO Auto-generated method stub
		
	}
	

}

