package cl.curso.springboot.api.servicios;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class GeneraToken {

	public String nuevoToken(String bodyMensaje,String headersMensaje) {
		
		String token;
		if(!bodyMensaje.trim().isEmpty() && bodyMensaje.trim().contains("si")) {
			token = headersMensaje.trim() + "_" + String.valueOf(LocalDateTime.now()) + "_API";
		}else {
			token = headersMensaje.trim() + "_" + "NO_AUTENTIFICADO" + "_API";
		}
		return token;
	}
}
