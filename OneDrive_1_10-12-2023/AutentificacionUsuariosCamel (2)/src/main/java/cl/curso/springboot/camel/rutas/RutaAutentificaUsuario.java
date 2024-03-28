package cl.curso.springboot.camel.rutas;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cl.curso.springboot.camel.bean.PreocesaRespuestaApi;

@Component
public class RutaAutentificaUsuario extends RouteBuilder {

	@Autowired
	PreocesaRespuestaApi pra;
	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		restConfiguration().host("localhost").port(8087);
		
		from("direct:autentifica-usuario")
		.id("ruta-autentifica-usuarios")
		.log("BODYy HEADER  antes de la llamada a la API :-> ${body} y Headers :-> ${headers}")
		//.setHeader("nombre",() -> "vader")
		.to("rest:post:/aut/validar/{nombre}/{pwd}")
		.bean(this.pra,"procesamientoRespuesta")
		.transform()
		.body(String.class)
		//.log("BODY y HEADER despues de la llamada a la API :-> ${body} y Headers :-> ${headers}")
		.to("direct:recibe-respuesta")
		.end();
		
		// ruta evalua la respuesta del m icroservicio de autentificacion
		// y segun eso realiza un log
		
		from("direct:autentifica-usuario-2")
		.id("ruta-usuario-autentifica-2")
		.to("rest:post:/aut/validar/{nombre}/{pwd}")
		// llamar al bean ProcesaRespuestaApi y segun esa respuesta 
		// definir las opciones del choice
		.bean(this.pra,"procesamientoRespuesta")
		.transform()
		.body(String.class)
		.choice()
			.when(simple("${body} contains 'si'"))
				.log("las credenciales del usuario son correctas")
			.otherwise()
				.log("las credenciales del usuario NO son correctas")
		.to("direct:recibe-respuesta")
		.end();
		
		// ruta que envia a un endpoint de generacion de token
		//
		from("direct:autentifica-usuario-3")
		.id("ruta-usuario-autentifica-3")
		.to("rest:post:/aut/validar/{nombre}/{pwd}")
		.bean(this.pra,"procesamientoRespuesta")
		.to("direct:genera-token-usuario")
		.log("Body recibido :-> ${body}")
		.end();
		
		// Ejercicio:
		// 1. Crear un nuevo microservicio llamado ApiGeneraTokenUsuario y que retorne un token
		// segun las reglas de la clase GeneraToken
		// 2. Crear una  nueva ruta llamada "direct:autentifica-usuario-4" que para generar el token de un usuario
		// llame al microservicio ApiGeneraTokenUsuario
		// Himnt: para obtener el nombre del usuario desde los headers: ${headers.nombre}
		
		from("direct:autentifica-usuario-4")
		.id("ruta-usuario-autentifica-4")
		.to("rest:post:/aut/validar/{nombre}/{pwd}")
		.bean(this.pra,"procesamientoRespuesta")
		.to("rest:post:/token/nuevo/${headers.nombre}/${body}")
		.end();
		
		
		
		from("direct:recibe-respuesta")
		.id("ruta_recibe_respuesta")
		.log("BODY y HEADER despues de la llamada a la API :-> ${body} y Headers :-> ${headers}")
		.end();
	}

}
