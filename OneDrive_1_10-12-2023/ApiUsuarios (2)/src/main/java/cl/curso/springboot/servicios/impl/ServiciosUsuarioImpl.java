package cl.curso.springboot.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.curso.springboot.entidades.UsuarioJPA;
import cl.curso.springboot.repositorio.interfaz.IUsuariosRepositorioJPA;
import cl.curso.springboot.servicios.interfaz.IServiciosUsuario;

@Service
public class ServiciosUsuarioImpl implements IServiciosUsuario {

	@Autowired
	private IUsuariosRepositorioJPA urjpa;
	
	@Override
	public List<UsuarioJPA> obtenerTodosLosUsuarios() {
		// TODO Auto-generated method stub
		return this.urjpa.findAll();
	}

	@Override
	public UsuarioJPA actualizarUsuario(UsuarioJPA ujpa) {
		// TODO Auto-generated method stub
		return this.urjpa.save(ujpa);
	}

	@Override
	public List<UsuarioJPA> buscarUsuarioPorApellido(String apellidoUsuario) {
		// TODO Auto-generated method stub
		return this.urjpa.findByApellido(apellidoUsuario);
	}

	@Override
	public UsuarioJPA findByEmail(String emailUsuario) {
		// TODO Auto-generated method stub
		return this.urjpa.findByEmail(emailUsuario);
	}

	@Override
	public void eliminarUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		this.urjpa.deleteById(idUsuario);
	}

}
