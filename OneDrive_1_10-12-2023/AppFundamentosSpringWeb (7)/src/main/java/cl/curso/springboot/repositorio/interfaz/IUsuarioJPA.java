package cl.curso.springboot.repositorio.interfaz;

import java.util.List;

import cl.curso.springboot.pojo.Usuario;

public interface IUsuarioJPA {
	// DTO : Data Transfer Objects
	public List<Usuario> listarTodosLosUsuarios();
	
	public Usuario buscarUsuarioPorId(Integer idUsuario);
	
	public void agregarUsuarioJPA(String nombre, String apellido, String email) ;
	
	public void modificaEmailUsuario(Integer idUsuario, String emailUsuario);

}
