package cl.curso.springboot.servicios.interfaz;

import java.util.List;

import cl.curso.springboot.entidades.UsuarioJPA;

public interface IServiciosUsuario {
	public List<UsuarioJPA> obtenerTodosLosUsuarios();
	
	public List<UsuarioJPA> buscarUsuarioPorApellido(String apellidoUsuario);
	public UsuarioJPA actualizarUsuario(UsuarioJPA ujpa);
	public UsuarioJPA findByEmail(String emailUsuario);
}
