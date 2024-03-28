package cl.curso.springboot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/textos", method = RequestMethod.GET)
public class TextosController {

	@GetMapping(value = "/saludo")
	public String saludoFormal() {
		return "Hola desde el primer microservicio del curso";
	}

	@RequestMapping(value = "/largo/{texto1}/{texto2}", method = RequestMethod.GET)
	public String textoMasLargo(@PathVariable("texto1") String texto1, @PathVariable("texto2") String texto2) {
		String resultado = texto1.trim().length() >= texto2.trim().length() ? texto1 : texto2;
		return resultado;
	}

}
