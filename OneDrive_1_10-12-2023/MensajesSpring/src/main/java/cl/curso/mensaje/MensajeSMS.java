package cl.curso.mensaje;

import org.springframework.stereotype.Component;

import cl.curso.tipo.IMensaje;

@Component("mensajeSMS")
public class MensajeSMS implements IMensaje {

	@Override
	public void enviarMensaje() {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensaje SMS ...");
	}

}
