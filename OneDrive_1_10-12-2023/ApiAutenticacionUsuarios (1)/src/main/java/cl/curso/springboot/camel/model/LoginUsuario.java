package cl.curso.springboot.camel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginUsuario {

	private String nombreUsuario;
	private String pwdusuario;
}
