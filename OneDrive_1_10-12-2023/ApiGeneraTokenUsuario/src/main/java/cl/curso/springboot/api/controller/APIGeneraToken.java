package cl.curso.springboot.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.curso.springboot.api.servicios.GeneraToken;

@RestController
@RequestMapping("/token")
public class APIGeneraToken {

	@Autowired
	private GeneraToken gt;
	
	@PostMapping(value = "/nuevo/{usuario}/{status}")
	public String nuevoTokenUsuario(@PathVariable String usuario, @PathVariable String status) {
		
		return this.gt.nuevoToken(usuario, status);
	}
}
