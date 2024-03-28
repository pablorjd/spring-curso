package cl.curso.springboot.servicio.interfaz;

import java.util.List;

import cl.curso.springboot.pojo.Usuario;


public interface IUsuarioServicio {
	
	public void agregarUsuario(Usuario nuevoUsuario);
	public List<Usuario> listarUsuarios();
	public Usuario buscarUsuario(String Apellido);
	
	
	public List<Usuario> listarUsuariosJPA();

}
