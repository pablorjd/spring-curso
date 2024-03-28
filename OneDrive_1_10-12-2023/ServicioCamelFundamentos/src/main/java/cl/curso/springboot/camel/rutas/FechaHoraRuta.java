package cl.curso.springboot.camel.rutas;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.curso.springboot.camel.bean.TiempoActualBean;

@Component
public class FechaHoraRuta extends RouteBuilder {

	@Autowired
	private TiempoActualBean tab;
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("direct:ruta-fechahora")
		.bean(tab, "tiempoActual")
		.to("log:log-2");
		
	}

	
}
