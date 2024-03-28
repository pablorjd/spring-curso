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
		.setHeader("nombre",() -> "vader")
		.to("rest:post:/aut/validar/{nombre}/{pwd}")
		.bean(this.pra,"procesamientoRespuesta")
		.transform()
		.body(String.class)
		.log("BODY y HEADER despues de la llamada a la API :-> ${body} y Headers :-> ${headers}");
		
	}

}
