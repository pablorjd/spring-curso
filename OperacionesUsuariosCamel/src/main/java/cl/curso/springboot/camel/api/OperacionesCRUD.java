package cl.curso.springboot.camel.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/crud")
public class OperacionesCRUD {
	
	@Autowired
	private ProducerTemplate pt;

	@GetMapping(value = "/lista")
	public String listarUsuarios() {
		
		this.pt.start();
		Object response = this.pt.requestBody("direct:api-usuarios-listado","",String.class);
		this.pt.stop();
		return response.toString();
	}
	
	// Desafio: crear un metodo en el controlador y una ruta para llamar al metodo
	// de la api de usuarios buscar por email
	
	
	@PostMapping(value = "/buscar/{email}")
	public String buscarPorEmail(@PathVariable("email") String email) {
		this.pt.start();
		
		Map<String, Object> parametrosHeaders = new HashMap<>();
		parametrosHeaders.put("email", email);
		
		Object respuestaApi = this.pt.sendBodyAndHeaders("direct:api-usuarios-email", null, null, parametrosHeaders);
		
		this.pt.stop();
		return respuestaApi.toString();
	}
}
