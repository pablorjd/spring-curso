package cl.curso.springboot.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	 * Para buscar un usuario x apellido se requieren dos metodos y una vista
	 * metodo 1: llama a la vista para buscar el Usuario
	 * metodo 2: es convocado por al vista y este llama al servicio de busqueda (POST)
	 * en este metodo se debe analizar si el usuairo buscado existe. Si existe crear un vista que muestre todos lo datos
	 * del Usuario encontrado y de los contrario crear una vista que diga usuario no encontrado.
	 */
	
	// metodo 1: llamar a la vista para ingresar el apellido a buscar
	@GetMapping(value = "/vistabuscar")
	public String vistaBuscarUsuario() {
		return "vistasUsuarios/buscarUsuario";
	}
	
	// metodo 2: llamado x la vista buscarUsuario
	@PostMapping("/buscarusuario")
	public ModelAndView buscarUsuario(@RequestParam("apellidoUsuario") String apellidoUsuario, ModelAndView modelView) {
		
		Usuario us	=	this.serviciosUsuario.buscarUsuario(apellidoUsuario);
		
		String nombreVista	=	Objects.isNull(us) ? "vistasUsuarios/vistaNoExisteUsuario" : "vistasUsuarios/vistaDatosUsuario";
		
		modelView.addObject("usuario", us);
		modelView.setViewName(nombreVista);
		
		return modelView;
	}
	/*
	 * Crear las operaciones de:
	 * 1. Actualizar el email de un usuario dado el apellido
	 * 2. Eliminar un usuario dado su nombre y apellido
	 * 
	 */
	
}
