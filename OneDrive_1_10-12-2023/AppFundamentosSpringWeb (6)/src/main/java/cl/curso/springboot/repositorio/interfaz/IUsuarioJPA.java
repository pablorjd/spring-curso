package cl.curso.springboot.repositorio.interfaz;

import java.util.List;

import cl.curso.springboot.pojo.Usuario;

public interface IUsuarioJPA {
	// DTO : Data Transfer Objects
	public List<Usuario> listarTodosLosUsuarios();

}
