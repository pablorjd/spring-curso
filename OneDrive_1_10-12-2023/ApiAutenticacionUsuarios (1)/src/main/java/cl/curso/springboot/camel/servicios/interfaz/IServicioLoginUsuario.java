package cl.curso.springboot.camel.servicios.interfaz;

public interface IServicioLoginUsuario {

	public Boolean validarLogin(String nombreUsuario, String pwdUsuario);
}
