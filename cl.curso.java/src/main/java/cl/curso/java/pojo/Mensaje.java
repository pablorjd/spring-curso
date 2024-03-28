package cl.curso.java.pojo;

public class Mensaje {

	Integer idMensaje;
	String tpMensaje;
	String txtMensaje;
	
	public Mensaje() {}
	
	
	public Mensaje(Integer idMensaje, String tpMensaje, String txtMensaje) {

		this.idMensaje = idMensaje;
		this.tpMensaje = tpMensaje;
		this.txtMensaje = txtMensaje;
	}
	
	public Integer getIdMensaje() {
		return idMensaje;
	}
	public void setIdMensaje(Integer idMensaje) {
		this.idMensaje = idMensaje;
	}
	public String getTpMensaje() {
		return tpMensaje;
	}
	public void setTpMensaje(String tpMensaje) {
		this.tpMensaje = tpMensaje;
	}
	public String getTxtMensaje() {
		return txtMensaje;
	}
	public void setTxtMensaje(String txtMensaje) {
		this.txtMensaje = txtMensaje;
	}
	
	
	
}
