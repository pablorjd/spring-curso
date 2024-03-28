package cl.curso.pelicula.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pelicula {
	
	private Integer idPelicula;
	private String  nombrePelicula;
	private String  directorPelicula;
	private String	generoPelicula;
	
	

}
