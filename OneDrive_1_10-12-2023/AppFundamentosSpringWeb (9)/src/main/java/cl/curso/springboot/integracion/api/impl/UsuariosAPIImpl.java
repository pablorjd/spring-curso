package cl.curso.springboot.integracion.api.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import cl.curso.springboot.entidades.UsuarioJPA;
import cl.curso.springboot.integracion.api.interfaz.IUsuariosAPI;
import cl.curso.springboot.pojo.wrapper.WrapperListaUsuarios;

@Repository
public class UsuariosAPIImpl implements IUsuariosAPI {

	private String urlBase	=	"http://localhost:8080/api/usuarios";
	
	@Override
	public List<UsuarioJPA> listarTodosLosUsuariosAPI() {
		// TODO Auto-generated method stub
		RestTemplate rt = new RestTemplate();
		
		//List<UsuarioJPA> listaRetronada = rt.getForObject(urlBase + "/listado", List.class);
		WrapperListaUsuarios listaRetronada = rt.getForObject(urlBase + "/listado", WrapperListaUsuarios.class);
		return listaRetronada.getListaUsuarios();
	}

}
