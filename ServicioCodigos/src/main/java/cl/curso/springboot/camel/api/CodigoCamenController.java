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
@RequestMapping(value = "/api")
public class CodigoCamenController {
	
	@Autowired
	ProducerTemplate pt;
	
	@PostMapping(value = "/codigos/{code1}/{code2}")
	public String getProductoByCode(@PathVariable("code1") String code1, @PathVariable("code2") String code2) {
		this.pt.start();
		
		Map<String, Object> parametrosHeaders = new HashMap<>();
		parametrosHeaders.put("code1", code1);
		parametrosHeaders.put("code2", code2);
		
		Object respuestaApi = this.pt.sendBodyAndHeaders("direct:product-code", null, null, parametrosHeaders);
		
		this.pt.stop();
		return respuestaApi.toString();
	}

}
