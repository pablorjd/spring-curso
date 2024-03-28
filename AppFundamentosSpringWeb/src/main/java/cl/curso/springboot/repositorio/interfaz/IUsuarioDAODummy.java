package cl.curso.springboot.repositorio.interfaz;

import java.util.List;

import cl.curso.springboot.pojo.Usuario;

public interface IUsuarioDAODummy {
	
	
	public void agregarUsuario(Usuario nuevoUsuario);
	public List<Usuario> listarUsuarios();
	public Usuario buscarUsuario(String Apellido);

}
