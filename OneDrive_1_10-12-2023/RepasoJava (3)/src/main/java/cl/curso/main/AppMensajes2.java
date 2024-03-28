package cl.curso.main;

import java.util.List;

import cl.curso.pojo.Mensaje;
import cl.curso.services.IServiciosMensajes;
import cl.curso.services.impl.ServiciosMensajesImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppMensajes2 {

	public static void main(String[] args) {
		// TODO convocar un servicios desde la capa de servicios
		IServiciosMensajes servicioMensaje = new ServiciosMensajesImpl();
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
		
		List<Mensaje> mensajesPorTipo = servicioMensaje.buscarMensajePorTipo("WSP");
		
		mensajesPorTipo.forEach(m -> System.out.println(m.getIdMensaje()));
		//log.info("Mensaje desde el logger Slf4j");

	}

}
