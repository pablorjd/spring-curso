package cl.curso.springboot.camel.bean;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class TiempoActualBean {

	public String tiempoActual() {
		return "La fecha y hora actual es :-> " + LocalDateTime.now();
	}
}
