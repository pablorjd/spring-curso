package cl.curso.springboot.repositorio.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.curso.springboot.pojo.Usuario;
import cl.curso.springboot.repositorio.interfaz.IUsuarioDAODummy;


@Repository
public class UsuarioDaoDummyImpl implements IUsuarioDAODummy{
	
	private List<Usuario> listaUsuarios = new ArrayList<>();
	
	public UsuarioDaoDummyImpl() {
		listaUsuarios.add(new Usuario("Spok","Vulcano","spok@curso.cl"));
		listaUsuarios.add(new Usuario("Obi Wan","Kenobi","obi@curso.cl"));
		listaUsuarios.add(new Usuario("Luke","SkyWalker","like@curso.cl"));
	}

	@Override
	public void agregarUsuario(Usuario nuevoUsuario) {
		
		listaUsuarios.add(nuevoUsuario);
		
	}

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return listaUsuarios;
	}

	@Override
	public Usuario buscarUsuario(String Apellido) {
		// TODO Auto-generated method stub
		return null;
	}

}
