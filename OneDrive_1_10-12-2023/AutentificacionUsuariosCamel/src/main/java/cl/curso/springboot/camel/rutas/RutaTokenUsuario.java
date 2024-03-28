package cl.curso.springboot.camel.rutas;

import java.awt.geom.GeneralPath;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.curso.springboot.camel.bean.GeneraToken;

@Service
public class RutaTokenUsuario extends RouteBuilder {

	@Autowired
	GeneraToken gt;
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from("direct:genera-token-usuario")
		.id("ruta-genera-token")
		.log("BODY y HEADER del mensaje :-> ${body} y Headers :-> ${headers}")
		.bean(this.gt,"nuevoToken")
		.log("BODY y HEADER del mensaje despues de la transformacion del Bean :-> ${body} y Headers :-> ${headers}")
		.end();
		
	}

}
