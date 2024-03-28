package cl.curso.springboot.camel.api;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rutasimple")
public class CamelFundamentosController {

	@Autowired
	private ProducerTemplate pt;
	
	@GetMapping("/r1")
	public void rutaSimple1() {
		pt.start();
		pt.requestBody("direct:ruta-1",null,String.class);
		pt.stop();
	}
	
	@GetMapping("/rfh")
	public void rutaFechaHora() {
		pt.start();
		pt.requestBody("direct:ruta-fechahora",null,String.class);
		pt.stop();
	}
}
