package cl.curso.springboot.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.curso.springboot.pojo.Usuario;
import cl.curso.springboot.servicios.interfaz.IUsuarioServicios;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private IUsuarioServicios serviciosUsuario;	
	private List<Usuario> listaUsuarios = new ArrayList<>();

	@RequestMapping("/llamarVistaAgregar")
	public String agregarUsuario(Model modeloUsuario) {
		Usuario usua = new Usuario();
		modeloUsuario.addAttribute("nuevoUsuario", usua);
		// return "vistasUsuarios/agregarUsuario";  // Caso: GET
		return "vistasUsuarios/agregarUsuarioPOST"; // Caso: POST
	}	
	@RequestMapping("/agregarNuevoUsuarioGET")
	public String datosNuevoUsuario(@RequestParam("nombreUsuario") String nombreUsuario
			, @RequestParam String apellidoUsuario, @RequestParam String emailUsuario, Model modelo) {	
		listaUsuarios	=	serviciosUsuario.listarTodosLosUsuarios();
		listaUsuarios.add(new Usuario(nombreUsuario, apellidoUsuario, emailUsuario));
		modelo.addAttribute("lista", listaUsuarios);
		return "vistasUsuarios/listadoUsuarios";
	}	
	@PostMapping("/agregarNuevoUsuarioPOST")
	public String datosNuevoUsuarioPOST(Usuario usua, Model modelo) {		
		listaUsuarios	=	serviciosUsuario.listarTodosLosUsuarios();
		listaUsuarios.add(usua);
		modelo.addAttribute("lista", listaUsuarios);
		return "vistasUsuarios/listadoUsuarios";
	}
	
	/*
	 * Para buscar un usuario x apellido se requeiren dos metodos y una vista
	 * metodo 1: llama a la vista para buscar el Usuario
	 * metodo 2: es convocado por al vista y este llama al servicio de busqueda
	 */
}
