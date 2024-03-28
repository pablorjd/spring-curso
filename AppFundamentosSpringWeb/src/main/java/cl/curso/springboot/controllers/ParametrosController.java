package cl.curso.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/params")
public class ParametrosController {
	
	
	@GetMapping("/params1") // ruta = http://localhost:9090/params/params1?mensaje=hp
	public String params(@RequestParam(name = "mensaje")String mensajerequest, Model model) {
		model.addAttribute("valorParametroRequest1", mensajerequest);
		return "vistasParametros/verParametroRequest1";
	}
	
	@GetMapping("/params2") // ruta = http://localhost:9090/params/params1?mensaje=hp&cantidadVisitas
	public String params2(@RequestParam(name = "mensaje")String mensajerequest,@RequestParam Integer cantidadVisitas, Model model) {
		model.addAttribute("valorParametroRequest1", mensajerequest);
		model.addAttribute("cantidadVisitas", cantidadVisitas);
		return "vistasParametros/verParametroRequest2";
	}
	
	@GetMapping("/strMensaje/{textMensaje}") // ruta = http://localhost:9090/params/strMensaje/textmensaje
	public String paramPathVariable(
			@PathVariable(name = "textMensaje")String textMensaje,
			//@PathVariable("numeroMensaje") Integer numeroMensaje, 
			Model model) {
		model.addAttribute("valorParametroRequest1", textMensaje);
		model.addAttribute("cantidadVisitas", textMensaje);
		return "vistasParametros/verPathVariable";
	}
	
	@PostMapping("/postStrMensaje/{textoPost}")
	public String paramPathVariablePost(@PathVariable("textoPost") String txtPost,  Model model) {
		model.addAttribute("textoEnviadoPost", txtPost);
		return "vistasParametros/verPathVariable2";
	}
	
	

}
