package cl.curso.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Mensaje {
	// POJO: Plain Older Java Object
	private Integer idMensaje;
	private String  tipoMensaje;
	private String  textoMensaje;

	
	public Mensaje(Integer idMensaje, String tipoMensaje, String textoMensaje) {
		this.idMensaje		=	idMensaje;
		this.tipoMensaje 	= 	tipoMensaje;
		this.textoMensaje 	= 	textoMensaje; 
	}
	
}
