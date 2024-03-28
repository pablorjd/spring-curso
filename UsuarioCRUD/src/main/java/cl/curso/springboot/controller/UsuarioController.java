package cl.curso.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.curso.springboot.service.intefaces.IUsuarioServices;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	IUsuarioServices servicio;
	
	@GetMapping(value = "/listarusuariojpa")
	public ModelAndView listarUsuarioJPA(ModelAndView mv) {
		//mv.addObject("lista", this.servicio.listarTodosLosUsuarioJPA());
		mv.addObject("lista", this.servicio.buscarporID(1));
		System.out.println(this.servicio.buscarporID(1));
		mv.setViewName("vistaUsuario/listar");
		return mv;
	}

}
