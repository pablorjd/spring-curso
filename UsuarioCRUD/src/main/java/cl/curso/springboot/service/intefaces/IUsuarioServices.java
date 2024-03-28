package cl.curso.springboot.service.intefaces;

import java.util.List;

import cl.curso.springboot.pojo.Usuario;

public interface IUsuarioServices {
	
	public void agregarNuevoUsuario(Usuario usuario);
	public List<Usuario> listarTodosLosUsuarios();
	public Usuario buscarUsuario(String apellido);
	public List<Usuario> listarTodosLosUsuarioJPA();
	
	
	public Usuario buscarporID(Integer id);
	public void agregarUsuarioJPA(String nombre, String apellido, String email);
	
	public void editEmail(Integer id, String correo);
	
		
	

}
