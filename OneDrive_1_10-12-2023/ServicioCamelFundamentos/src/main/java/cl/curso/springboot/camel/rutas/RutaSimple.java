package cl.curso.springboot.camel.rutas;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RutaSimple extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// Definir una ruta Camel
		// Se utiliza Java DSL (Lenguaje Especifico de Dominio)
		from("direct:ruta-1")
		.transform()
		.constant("estamos en la ruta 1")
		.to("log:log-1");
		
	}

}
