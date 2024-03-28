package cl.curso.springboot.servicios.interfaz;

import java.util.List;

import cl.curso.springboot.entidades.UsuarioJPA;
import cl.curso.springboot.pojo.Usuario;

public interface IUsuarioServicios {

	public void agregarNuevoUsuario(Usuario nuevoUsuario);
	public List<Usuario> listarTodosLosUsuarios();
	
	public Usuario buscarUsuario(String apellidoUsuario);
	// operaciones JPA
	public List<Usuario> listarTodosLosUsuariosJPA();
	public Usuario buscarUsuarioPorId(Integer idUsuario);
	public void agregarUsuarioJPA(String nombre, String apellido, String email);
	public void eliminaUsuario(Integer idUsuario);
	// operaciones con API ApiUsuarios
	public List<UsuarioJPA> listarTodosLosUsuariosAPI();
}
