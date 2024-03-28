package cl.curso.springboot.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.curso.springboot.pojo.Usuario;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	private List<Usuario> listaUsuarios = new ArrayList<>();
	
	public UsuarioController() {
		listaUsuarios.add(new Usuario("Spok", "Vulcano", "spok@curso.cl"));
		listaUsuarios.add(new Usuario("Obi Wan", "Kenobi", "obi@curso.cl"));
		listaUsuarios.add(new Usuario("Luke", "SkyWaker", "luke@curso.cl"));
	}
	
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
		
		listaUsuarios.add(new Usuario(nombreUsuario, apellidoUsuario, emailUsuario));
		modelo.addAttribute("lista", listaUsuarios);
		return "vistasUsuarios/listadoUsuarios";
	}
	
	@PostMapping("/agregarNuevoUsuarioPOST")
	public String datosNuevoUsuarioPOST(Usuario usua, Model modelo) {
		
		listaUsuarios.add(usua);
		modelo.addAttribute("lista", listaUsuarios);
		return "vistasUsuarios/listadoUsuarios";
	}

}
