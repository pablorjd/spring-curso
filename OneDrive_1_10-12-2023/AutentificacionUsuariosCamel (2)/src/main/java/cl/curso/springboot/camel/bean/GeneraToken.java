package cl.curso.springboot.camel.bean;

import java.time.LocalDateTime;
import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GeneraToken {

	public String nuevoToken(@Body String bodyMensaje, @Headers Map<String, String> headersMensaje) {
		
		String token;
		if(!bodyMensaje.trim().isEmpty() && bodyMensaje.trim().contains("si")) {
			token = headersMensaje.get("nombre") + "_" + String.valueOf(LocalDateTime.now());
		}else {
			token = headersMensaje.get("nombre") + "_" + "NO_AUTENTIFICADO";
		}
		return token;
	}
}
