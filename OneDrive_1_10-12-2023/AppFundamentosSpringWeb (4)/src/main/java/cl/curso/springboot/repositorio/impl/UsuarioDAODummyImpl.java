package cl.curso.springboot.repositorio.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.curso.springboot.pojo.Usuario;
import cl.curso.springboot.repositorio.interfaz.IUsuarioDAODummy;

@Repository
public class UsuarioDAODummyImpl implements IUsuarioDAODummy {
	
	private List<Usuario> listaUsuarios	=	new ArrayList<>();
	
	public UsuarioDAODummyImpl() {
		listaUsuarios.add(new Usuario("Spok", "Vulcano", "spok@curso.cl"));
		listaUsuarios.add(new Usuario("Obi Wan", "Kenobi", "obi@curso.cl"));
		listaUsuarios.add(new Usuario("Luke", "SkyWaker", "luke@curso.cl"));
	}

	@Override
	public void agregarNuevoUsuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		listaUsuarios.add(nuevoUsuario);
	}

	@Override
	public List<Usuario> listarTodosLosUsuarios() {
		// TODO Auto-generated method stub
		return listaUsuarios;
	}

	@Override
	public Usuario buscarUsuario(String apellidoUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
