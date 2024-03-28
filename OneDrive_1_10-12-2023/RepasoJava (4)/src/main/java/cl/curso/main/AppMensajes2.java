package cl.curso.main;

import java.util.List;

import cl.curso.pojo.Mensaje;
import cl.curso.repositorio.IDatosDummyMensajes;
import cl.curso.repositorio.impl.DatosDummyMensajesImpl;
import cl.curso.services.IServiciosMensajes;
import cl.curso.services.impl.ServiciosMensajesImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppMensajes2 {

	public static void main(String[] args) {
		// TODO convocar un servicios desde la capa de servicios
		IServiciosMensajes servicioMensaje = new ServiciosMensajesImpl();
	/*	
		String strResultado = servicioMensaje.concatenaMensajes("hola ", " mundo !");
		System.out.println(strResultado);
		System.out.println(servicioMensaje.comparaMensajes("mensaje 1", "mensaje 2"));
		
		Mensaje men = servicioMensaje.mensajePorDefecto();
		System.out.println("Mensaje x default: Id :-> " 	+ men.getIdMensaje());
		System.out.println("Mensaje x default: Tipo :-> " 	+ men.getTipoMensaje());
		System.out.println("Mensaje x default: Texto :-> " 	+ men.getTextoMensaje());
		
		men = servicioMensaje.crearMensaje(1, "TWI", "Mensaje 1 de twitter !");
		
		System.out.println("Mensaje creado: Id :-> " 	+ men.getIdMensaje());
		System.out.println("Mensaje creado: Tipo :-> " 	+ men.getTipoMensaje());
		System.out.println("Mensaje creado: Texto :-> " + men.getTextoMensaje());
		
		Mensaje men1 = servicioMensaje.crearMensaje(2, "TWI", "Mensaje 1 de twitter!");
		System.out.println(servicioMensaje.compara2Mensajes(men, men1));
	*/	
		// buscar mensajes por su tipo usando la capa de repositorio
		List<Mensaje> mensajesPorTipo = servicioMensaje.buscarMensajePorTipo("SMS1");
		
		mensajesPorTipo.forEach(m -> System.out.println(m.getIdMensaje()));
		
		List<Mensaje> todosLosMensajes = servicioMensaje.todosLosMensajes();
		todosLosMensajes.forEach(m -> {
			log.info("Id mensaje :-> " + m.getIdMensaje());
			log.info("Tipo mensaje :-> " + m.getTipoMensaje());
			log.info("Texto mensaje :-> " + m.getTextoMensaje());
		});
		// modificar un texto de un mensaje
		servicioMensaje.modificaMensaje(3, "Este es un nuevo texto!");
		todosLosMensajes.forEach(m -> {
			log.info("Id mensaje :-> " + m.getIdMensaje());
			log.info("Tipo mensaje :-> " + m.getTipoMensaje());
			log.info("Texto mensaje :-> " + m.getTextoMensaje());
		});
		// agregar un nuevo mensaje al repositorio
		Mensaje nuevoMensaje =  new Mensaje(10, "TWI", "Twitter es ahora un X");
		servicioMensaje.agregarMensaje(nuevoMensaje);
		todosLosMensajes = servicioMensaje.todosLosMensajes();
		todosLosMensajes.forEach(m -> {
			log.info("Id mensaje :-> " + m.getIdMensaje());
			log.info("Tipo mensaje :-> " + m.getTipoMensaje());
			log.info("Texto mensaje :-> " + m.getTextoMensaje());
		});
		// eliminar un mensaje
		servicioMensaje.eliminarMensaje(1);
		todosLosMensajes = servicioMensaje.todosLosMensajes();
		todosLosMensajes.forEach(m -> {
			log.info("Id mensaje :-> " + m.getIdMensaje());
			log.info("Tipo mensaje :-> " + m.getTipoMensaje());
			log.info("Texto mensaje :-> " + m.getTextoMensaje());
		});
	}

}
