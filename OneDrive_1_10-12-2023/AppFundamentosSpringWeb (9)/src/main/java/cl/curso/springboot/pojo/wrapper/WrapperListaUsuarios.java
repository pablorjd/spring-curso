package cl.curso.springboot.pojo.wrapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cl.curso.springboot.entidades.UsuarioJPA;

@Component
public class WrapperListaUsuarios {

	private List<UsuarioJPA> listaUsuarios;
	
	public WrapperListaUsuarios() {
		listaUsuarios	=	new ArrayList<>();
	}

	public List<UsuarioJPA> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<UsuarioJPA> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	
}
