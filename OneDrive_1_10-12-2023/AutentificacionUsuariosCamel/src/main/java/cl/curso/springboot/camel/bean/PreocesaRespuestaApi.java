package cl.curso.springboot.camel.bean;

import org.apache.camel.Body;
import org.springframework.stereotype.Component;

@Component
public class PreocesaRespuestaApi {

	public String procesamientoRespuesta(@Body String mensajeApi) {
		
		if(mensajeApi.trim().equalsIgnoreCase("true")) {
			return "si";
		}
		return "no";
	}
}
