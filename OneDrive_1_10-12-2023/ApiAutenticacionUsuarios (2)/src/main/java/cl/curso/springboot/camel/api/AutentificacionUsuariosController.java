package cl.curso.springboot.camel.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.curso.springboot.camel.servicios.interfaz.IServicioLoginUsuario;

@RestController
@RequestMapping(value = "/aut")
public class AutentificacionUsuariosController {
	@Autowired
	private IServicioLoginUsuario slu;
	
	@PostMapping("/validar/{nombre}/{pwd}")
	public String autenticaUsuario(@PathVariable("nombre") String nom, @PathVariable("pwd") String pwd) {
		
		String respuesta;
		return respuesta = this.slu.validarLogin(nom, pwd) ? "true" : "false";
	}

}
