package cl.curso.services;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public interface IServiciosMensajes {
	
	public String concatenaMensajes(String m1, String m2);
	
	public String concatenaMensajes(String...  mensajes);
	
	public String concatenaMensajes(List<String> listaMensajes);
	
	public Boolean comparaMensajes(String m1, String m2);
}
