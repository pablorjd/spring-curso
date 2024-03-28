package cl.curso.springboot.camen.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.curso.springboot.camel.bean.CodigoCamelBean;

@Service
public class CodigoCamelRoute extends RouteBuilder{
	
	@Autowired
	CodigoCamelBean code;

	@Override
	public void configure() throws Exception {
		restConfiguration().host("localhost").port(8080);
		
		//product-code
		
		from("direct:product-code")
		.id("product-code")
		.log("BODY y HEADER del mensaje :-> ${body} y Headers :-> ${headers}")
		.bean(this.code,"nuevoCode")
		.to("rest:post:/api/product/{code2}+{code1}")
		.log("Body recibido :-> ${body} y Headers :-> ${headers}")
		.end();
		
	}
	
	

}
