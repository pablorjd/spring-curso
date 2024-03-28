package cl.curso.springboot.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.curso.springboot.pojo.Usuario;

@Controller
@RequestMapping(value = "/i")
public class IndexController {

	@RequestMapping(value = "/",method = RequestMethod.GET) //@GetMapping
	public String index() {
		return "index1";
	}
	
	@GetMapping("/saludo")
	public String saludo(Model modeloSaludo) {
		
		modeloSaludo.addAttribute("tituloVista", "Este es el titulo de la pagina");
		modeloSaludo.addAttribute("saludoVista", "Hola, Tenga todos un muy buen Jueves !!");
		return "saludo";
		
	}
	
	@GetMapping(value = "/datos")
	public String datosUsuario(Model modeloUsuario) {
		Usuario usua = new Usuario();
		usua.setNombre("Alan");
		usua.setApellido("Turing");
		//usua.setEmail("alan@curso.cl");
		
		modeloUsuario.addAttribute("perfilUsuario", "El nombre del usuario es: " + usua.getNombre() + " , " + usua.getApellido());
		modeloUsuario.addAttribute("usuario", usua);
		
		return "perfilUsuario";
	}
	
	@GetMapping(value = "/lista")
	public String listadoUsuarios(Model modeloLista) {
		
		List<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Alan", "Turing", "alan@curso.cl"));
		lista.add(new Usuario("Steve", "Jobs", "jobs@curso.cl"));
		lista.add(new Usuario("Elon", "Musk", "musk@curso.cl"));
		
		modeloLista.addAttribute("listaDeUsuarios", lista);
		modeloLista.addAttribute("tituloBody", "Lista de los actuales usuarios");
		return "listado";
	}
	
	
}
