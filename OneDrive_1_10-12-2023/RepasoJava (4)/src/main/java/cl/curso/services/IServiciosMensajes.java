package cl.curso.services;

import java.util.List;

import cl.curso.pojo.Mensaje;


public interface IServiciosMensajes {
	
	public String concatenaMensajes(String m1, String m2);
	
	public String concatenaMensajes(String...  mensajes);
	
	public String concatenaMensajes(List<String> listaMensajes);
	
	public Boolean comparaMensajes(String m1, String m2);
	
	public Mensaje mensajePorDefecto();
	// id 0,1,2,3,4 tipo: WSP, TWI, EMA, SMS
	public Mensaje crearMensaje(Integer idMensaje, String tipoMensaje, String textoMensaje);
	
	// Dos mensajes son = si son del mismo tipo y tienen el mismo texto
	// validar que ambos mensajes no sean nulos
	public Boolean compara2Mensajes(Mensaje m1, Mensaje m2);
	// metodo llama ala cap de repositorio
	List<Mensaje> buscarMensajePorTipo(String tipoMensaje);
	public List<Mensaje> todosLosMensajes();
	public void modificaMensaje(Integer idMensaje, String textoMensaje);
	public void agregarMensaje(Mensaje nuevoMensaje);
	public void eliminarMensaje(Integer idMensaje);
}
