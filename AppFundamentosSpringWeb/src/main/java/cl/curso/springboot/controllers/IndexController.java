package cl.curso.springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.curso.springboot.pojo.Usuario;

@Controller
@RequestMapping( value = "/i")
public class IndexController {

	@RequestMapping(value = "/",method = RequestMethod.GET)  //method => represeta al getmappgin
	public String index() {
		return "index1";
	}
	
	@GetMapping("/saludo")
	public String saludo( Model model ) {  // el obj modelo esta pensado para enviar datos a la vista
		
		model.addAttribute("titleview", "Este es el titulo de la página");
		model.addAttribute("saludoVista", "Hola! tenga todos un muy buen jueves");
		
		return "saludo";
	}
	
	@GetMapping("/datos")
	public String datosUsuario(Model modelo) {
		Usuario us = new Usuario();
		us.setNombre("Pablo");
		us.setApellido("Jimenez");
		us.setEmail("pabllo.jimenez2221@gmail.com");
		
		modelo.addAttribute("datosusuario", "El nombre del usuario es: "+us.getNombre()+"  "+us.getApellido());
		modelo.addAttribute("usuario", us);
		return "perfilUsuario";
	}
	
	@GetMapping("/listado")
	public String listado(Model model) {
		
		List<Usuario> userList = new ArrayList<Usuario>();
		
		userList.add(new Usuario("Alan","Turin","alan.turing@correo.com"));
		userList.add(new Usuario("Steve","Jobs","steve.jobs@correo.com"));
		userList.add(new Usuario("Elon","Musk","elon.musk@correo.com"));
		
		model.addAttribute("usuarios",userList);
		model.addAttribute("titulo", "Listado de usuarios desde el controlador con un POJO");
		
		return "listado";
	}
}
