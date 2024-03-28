package cl.curso.springboot.camel.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/camel/aut")
public class AutentificacionCamelController {
	@Autowired
	ProducerTemplate pt;
	
	@PostMapping(value = "/login/{usuario}/{clave}")
	public String autentificaUsuario(@PathVariable("usuario") String usua, @PathVariable("clave") String pass) {
		this.pt.start();
		
		Map<String, Object> parametrosHeaders = new HashMap<>();
		parametrosHeaders.put("nombre", usua);
		parametrosHeaders.put("pwd", pass);
		
		Object respuestaApi = this.pt.sendBodyAndHeaders("direct:autentifica-usuario-2", null, null, parametrosHeaders);
		
		this.pt.stop();
		return respuestaApi.toString();
	}

}
