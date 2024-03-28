package cl.curso.springboot.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Service;

@Service
public class RoutesOperacionesUsuario extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		restConfiguration().host("localhost").port(8080);
		
		from("direct:api-usuarios-listado")
		.id("api_usuarios_listado")
		.log("Body and Headers before to call of MS -> ${body} - ${headers}")
		.to("rest:get:/api/usuarios/listado")
		.log("Body and Headers after to call of MS -> ${body} - ${headers}")
		.end();
		
		
		
		//buscar por email 
		from("direct:api-usuarios-email")
		.id("api_usuarios_email")
		.log("Body and Headers before to call of MS -> ${body} - ${headers}")
		.to("rest:post:/api/usuarios/buscar/email/{email}")
		.log("Body and Headers after to call of MS -> ${body} - ${headers}")
		.end();
		
		
		
	}

}
