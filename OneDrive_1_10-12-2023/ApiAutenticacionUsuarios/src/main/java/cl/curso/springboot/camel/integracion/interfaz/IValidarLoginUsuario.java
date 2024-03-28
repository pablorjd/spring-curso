package cl.curso.springboot.camel.integracion.interfaz;

public interface IValidarLoginUsuario {

	public Boolean validarLogin(String nombreUsuario, String pwdUsuario);
}
