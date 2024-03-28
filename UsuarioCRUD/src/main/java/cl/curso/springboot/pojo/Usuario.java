package cl.curso.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	private String nombre;
	private String apellido;
	private String email;
	
}