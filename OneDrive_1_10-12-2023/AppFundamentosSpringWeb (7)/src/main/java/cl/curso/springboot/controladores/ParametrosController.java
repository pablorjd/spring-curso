package cl.curso.springboot.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/params") // http://localhost:8081/params/param1?mensaje=Hola a todos!
public class ParametrosController {
	
	@GetMapping("/param1")
	public String param(@RequestParam(name = "mensaje") String mensajeRequest , Model modelo) {
		modelo.addAttribute("valorParametroRequest", mensajeRequest);	
		return "vistasParametros/verParametrosRequest1";
	}
	
	@GetMapping("/param2") //  // http://localhost:8081/params/param1?mensaje=Hola a todos!&cantidadVisitas= 234
	public String param(@RequestParam("mensaje") String mensajeRequest, @RequestParam Integer cantidadVisitas, Model modelo) {
		modelo.addAttribute("valorParametroRequestString", mensajeRequest);
		modelo.addAttribute("valorParametroRequestInteger", cantidadVisitas);
		return "vistasParametros/verParametrosRequest2";
	}
	
	//  http://localhost:8081/params/strMensaje/Hola a todos con path

	@GetMapping("/strMensaje/{textoMensaje}")
	public String paramPathVariable(@PathVariable(name = "textoMensaje") String txtMensaje, Model modelo) {
		modelo.addAttribute("texto", txtMensaje);
		return "vistasParametros/verPathVariables1";
	}
	
	@GetMapping("/strMensaje/{textoMensaje}/{numeroMensaje}")
	public String paramPathVariable(@PathVariable(name = "textoMensaje") String txtMensaje, @PathVariable("numeroMensaje") Integer numMensaje, Model modelo) {
		modelo.addAttribute("texto", txtMensaje);
		modelo.addAttribute("numero", numMensaje);
		return "vistasParametros/verPathVariables1";
	}
	
	@PostMapping("/postStrMensaje/{textoPost}")
	public String paramPathVariablePost(@PathVariable("textoPost") String txtPost, Model modelo) {
		
		modelo.addAttribute("textoEnviadoPost", txtPost);
		return "vistasParametros/verPathVariables2";
	}
	
	
}
