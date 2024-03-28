package cl.curso.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultadoOperacion {

	private Integer num1;
	private Integer num2;
	private String operacion;
	private Integer resultado;

}
