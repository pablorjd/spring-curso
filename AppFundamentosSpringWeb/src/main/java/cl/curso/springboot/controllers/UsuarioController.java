package cl.curso.springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.curso.springboot.pojo.Usuario;
import cl.curso.springboot.servicio.interfaz.IUsuarioServicio;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	
	//@Autowired 
	//IUsuarioServicio iUsuarioServicio;
	private List<Usuario> listaUsuario = new ArrayList<>();
	
	//@RequestMapping("/llamarVistaAgregar")
	//public String agregarUsuario(Model modeloUsuario) {
	//	Usuario usu = new Usuario();
	//	modeloUsuario.addAttribute("nuevoUsuario", usu);
	//	return "vistaUsuario/agregarUsuarioPost";
	//}

}
