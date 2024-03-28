package cl.curso.springboot.camel.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.curso.springboot.camel.integracion.interfaz.IValidarLoginUsuario;
import cl.curso.springboot.camel.servicios.interfaz.IServicioLoginUsuario;

@Service
public class ServicioLoginUsuarioImpl implements IServicioLoginUsuario {
	@Autowired
	IValidarLoginUsuario vlu;

	@Override
	public Boolean validarLogin(String nombreUsuario, String pwdUsuario) {
		// TODO Auto-generated method stub
		return this.vlu.validarLogin(nombreUsuario, pwdUsuario);
	}

	// crear un microservicio Camel SpringBoot llamado AutenificacionUsuarioCamel
}
