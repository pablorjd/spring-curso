package cl.curso.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/casa")
public class HomeController {
	
	@GetMapping(value = "/")
	public String home() {
		System.out.println("En el metodo home del controlador ");
		return "index1";
	}
	
	@GetMapping(value = "/start")
	public String inicio() {
		return "vistaInicio";
	}
	
	// redireccionado a un URL externa 
	@GetMapping("/santander")
	public String santander() {
		return "redirect:https://www.santander.cl";
	}
	
	// rediect a una url interna
	@GetMapping("/forward1")
	public String otroStart() {
		return "forward:/start";
	}

}
