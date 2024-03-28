package cl.curso.springboot.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.curso.springboot.pojo.Usuario;
import cl.curso.springboot.repositorio.interfaz.IUsuarioDAODummy;
import cl.curso.springboot.repositorio.interfaz.IUsuarioJPA;
import cl.curso.springboot.servicio.interfaz.IUsuarioServicio;

@Service
public class UsuarioServicioImpl implements IUsuarioServicio{
	
	@Autowired
	private IUsuarioDAODummy repoUsuarioDAODummy;
	@Autowired
	private IUsuarioJPA iUsuarioJPA;

	@Override
	public void agregarUsuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		repoUsuarioDAODummy.agregarUsuario(nuevoUsuario);
		
	}

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return repoUsuarioDAODummy.listarUsuarios();
	}

	@Override
	public Usuario buscarUsuario(String Apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listarUsuariosJPA() {
		// TODO Auto-generated method stub
		return iUsuarioJPA.listaUsuario();
	}

}

