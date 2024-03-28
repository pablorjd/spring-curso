package cl.curso.springboot.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.curso.springboot.entidades.UsuarioJPA;
import cl.curso.springboot.integracion.api.interfaz.IUsuariosAPI;
import cl.curso.springboot.pojo.Usuario;
import cl.curso.springboot.repositorio.interfaz.IUsuarioDAODummy;
import cl.curso.springboot.repositorio.interfaz.IUsuarioJPA;
import cl.curso.springboot.servicios.interfaz.IUsuarioServicios;

@Service
public class UsuarioServiciosImpl implements IUsuarioServicios {
	
	@Autowired
	private IUsuarioDAODummy repoUsuarioDAODummy;
	@Autowired
	private IUsuarioJPA repoUsuariosJPA;
	@Autowired
	private IUsuariosAPI integracionAPI;

	@Override
	public void agregarNuevoUsuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		repoUsuarioDAODummy.agregarNuevoUsuario(nuevoUsuario);

	}

	@Override
	public List<Usuario> listarTodosLosUsuarios() {
		// TODO Auto-generated method stub
		return repoUsuarioDAODummy.listarTodosLosUsuarios();
	}

	@Override
	public Usuario buscarUsuario(String apellidoUsuario) {
		// TODO Auto-generated method stub
		return this.repoUsuarioDAODummy.buscarUsuario(apellidoUsuario);
	}
	
	// metodos JPA

	@Override
	public List<Usuario> listarTodosLosUsuariosJPA() {
		// TODO Auto-generated method stub
		return this.repoUsuariosJPA.listarTodosLosUsuarios();
	}

	@Override
	public Usuario buscarUsuarioPorId(Integer idUsuario) {
		// TODO Auto-generated method stub
		return this.repoUsuariosJPA.buscarUsuarioPorId(idUsuario);
	}

	@Override
	public void agregarUsuarioJPA(String nombre, String apellido, String email) {
		// TODO Auto-generated method stub
		 this.repoUsuariosJPA.agregarUsuarioJPA(nombre, apellido, email);
	}

	@Override
	public void eliminaUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		this.repoUsuariosJPA.eliminaUsuario(idUsuario);
	}

	@Override
	public List<UsuarioJPA> listarTodosLosUsuariosAPI() {
		// TODO Auto-generated method stub
		return this.integracionAPI.listarTodosLosUsuariosAPI();
	}

}
