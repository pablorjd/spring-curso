package cl.curso.springboot.repository.intefaces;

import java.util.List;

import cl.curso.springboot.pojo.Usuario;

public interface IUsuarioRespository {
	
	public List<Usuario> listarTodosLosUsuarioJPA();
	

	public Usuario buscarporID(Integer id);
	public void agregarUsuarioJPA(String nombre, String apellido, String email);
	public void editEmail(Integer id, String correo);

}
