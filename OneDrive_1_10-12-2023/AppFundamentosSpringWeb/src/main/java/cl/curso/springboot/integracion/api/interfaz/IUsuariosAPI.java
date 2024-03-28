package cl.curso.springboot.integracion.api.interfaz;

import java.util.List;

import cl.curso.springboot.entidades.UsuarioJPA;

public interface IUsuariosAPI {

	public List<UsuarioJPA> listarTodosLosUsuariosAPI();
	public UsuarioJPA actualizarUsuarioAPI(UsuarioJPA usuario);
}
