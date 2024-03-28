package cl.curso.springboot.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// la url:  http://localhost:8080/ sea recibida por el controlador HomeController y por el metodo home()

// url: http://localhost:8080/start

// el controlador atiende el request a localhost:8080
@Controller
public class HomeController {
	
	@GetMapping(value = "/")
	public String home() {
		System.out.println("En el metodo home del controlador !");
		return "index";
	}
	
	// el metodo inicio atiende la parte del rewquest /start
	@GetMapping("/start")
	public String inicio() {
		return "vistaInicio";
	}
	
	// redireccionamiento a una url externa
	@GetMapping("/san")
	public String santander() {
		return "redirect:https://www.santander.cl";
	}
	// redeirect a una url interna
	@GetMapping(value = "/otro")
	public String otroStart() {
		return "forward:/start";
	}

}
