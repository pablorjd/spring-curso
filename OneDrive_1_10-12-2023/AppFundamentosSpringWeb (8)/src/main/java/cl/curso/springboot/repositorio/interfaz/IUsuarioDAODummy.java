package cl.curso.springboot.repositorio.interfaz;

import java.util.List;

import cl.curso.springboot.pojo.Usuario;

public interface IUsuarioDAODummy {

	public void agregarNuevoUsuario(Usuario nuevoUsuario);
	public List<Usuario> listarTodosLosUsuarios();
	
	public Usuario buscarUsuario(String apellidoUsuario);
	
}
