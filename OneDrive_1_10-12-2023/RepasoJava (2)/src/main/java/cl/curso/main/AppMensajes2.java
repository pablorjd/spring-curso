package cl.curso.main;

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
	}

}
