package cl.curso.springboot.camel.bean;

import java.time.LocalDateTime;
import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.springframework.stereotype.Component;


@Component
public class CodigoCamelBean {
	
public String nuevoCode(@Body String code1, @Headers Map<String, String> headersMensaje) {
		
		String code;
		code = headersMensaje.get("code2")+""+headersMensaje.get("code1");
		return code;
	}

}
