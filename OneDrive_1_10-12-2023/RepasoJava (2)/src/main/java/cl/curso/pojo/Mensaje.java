package cl.curso.pojo;


public class Mensaje {

	private Integer idMensaje;
	private String  tipoMensaje;
	private String  textoMensaje;
	
	public Integer getIdMensaje() {
		return idMensaje;
	}
	public void setIdMensaje(Integer idMensaje) {
		
		this.idMensaje = idMensaje;
	}
	public String getTipoMensaje() {
		return tipoMensaje;
	}
	public void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}
	public String getTextoMensaje() {
		return textoMensaje;
	}
	public void setTextoMensaje(String textoMensaje) {
		this.textoMensaje = textoMensaje;
	}
	
	
}
