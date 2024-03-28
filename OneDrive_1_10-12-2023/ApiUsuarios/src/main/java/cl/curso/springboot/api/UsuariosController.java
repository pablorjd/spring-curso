package cl.curso.springboot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.curso.springboot.entidades.UsuarioJPA;
import cl.curso.springboot.servicios.interfaz.IServiciosUsuario;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

	@Autowired
	private IServiciosUsuario isu;
	
	@GetMapping(value = "/listado")
	public List<UsuarioJPA> listarUsuarios(){
		return this.isu.obtenerTodosLosUsuarios();
	}
	
	@PostMapping("/actualizar")
	public UsuarioJPA actualizarUsuario(@RequestBody UsuarioJPA usua) {
		
		return this.isu.actualizarUsuario(usua);
	}
	
	@PostMapping("/buscar/apellido/{ape}")
	public List<UsuarioJPA> buscarPorApellido(@PathVariable("ape") String apellidousuario) {
		return this.isu.buscarUsuarioPorApellido(apellidousuario);
	}
	
	/*
	 * buscar un usuario por su email
	 * asumir que email es unico
	 */
	
	@PostMapping("/buscar/email/{em}")
	public UsuarioJPA buscarPorEmail(@PathVariable("em") String emailUsuario) {
		return this.isu.findByEmail(emailUsuario);
	}
	
}
