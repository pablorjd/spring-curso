package cl.curso.pelicula.entidad;

import javax.persistence.Column;
import javax.persistence.Entity; //jakarta
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pelicula")
public class Pelicula {
	@Id
	private Integer idPelicula;
	@Column(name = "nombrePelicula")
	private String  nombrePelicula;
	private String  directorPelicula;
	private String	generoPelicula;
}
