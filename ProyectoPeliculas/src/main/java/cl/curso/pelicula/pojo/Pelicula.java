package cl.curso.pelicula.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pelicula {
	
	private Integer idPelicula;
	private String nombrePelicula;
	private String directorPelicula;
	private String generoPelicula;

}
