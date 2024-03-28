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
		.transform()
		.body(String.class)
		// llamar al bean ProcesaRespuestaApi y segun esa respuesta 
		// definir las opciones del choice
		.choice()
			.when(simple("${body} contains 'true'"))
				.log("las credenciales del usuario son correctas")
			.otherwise()
				.log("las credenciales del usuario NO son correctas")
		.to("direct:recibe-respuesta")
		.end();
		
		
		
		from("direct:recibe-respuesta")
		.id("ruta_recibe_respuesta")
		.log("BODY y HEADER despues de la llamada a la API :-> ${body} y Headers :-> ${headers}")
		.end();
	}

}
