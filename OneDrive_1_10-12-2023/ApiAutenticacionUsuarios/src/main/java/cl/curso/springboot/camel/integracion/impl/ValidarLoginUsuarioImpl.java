package cl.curso.springboot.camel.integracion.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.curso.springboot.camel.integracion.interfaz.IValidarLoginUsuario;
import cl.curso.springboot.camel.model.LoginUsuario;

@Repository
public class ValidarLoginUsuarioImpl implements IValidarLoginUsuario {

	private List<LoginUsuario> listaLogin = new ArrayList<>();
	
	public ValidarLoginUsuarioImpl() {
		listaLogin.add(new LoginUsuario("luke", "alfa"));
		listaLogin.add(new LoginUsuario("vader", "beta"));
	}
	
	@Override
	public Boolean validarLogin(String nombreUsuario, String pwdUsuario) {
		// TODO Auto-generated method stub
		
		for(LoginUsuario lu : listaLogin) {
			if(lu.getNombreUsuario().equalsIgnoreCase(nombreUsuario) && lu.getPwdusuario().equals(pwdUsuario)) {
				return true;
			}
		}
		return false;
	}

}
