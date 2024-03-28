package cl.curso.springboot.servicios.interfaz;

import java.util.List;

import cl.curso.springboot.pojo.Usuario;

public interface IUsuarioServicios {

	public void agregarNuevoUsuario(Usuario nuevoUsuario);
	public List<Usuario> listarTodosLosUsuarios();
	
	public Usuario buscarUsuario(String apellidoUsuario);
	
	public List<Usuario> listarTodosLosUsuariosJPA();
}
