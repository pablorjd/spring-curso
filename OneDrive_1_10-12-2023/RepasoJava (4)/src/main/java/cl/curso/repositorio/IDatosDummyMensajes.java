package cl.curso.repositorio;

import java.util.List;
import cl.curso.pojo.Mensaje;

public interface IDatosDummyMensajes {

	public List<Mensaje> buscarMensajePorTipo(String tipoMensaje);
	public List<Mensaje> buscarMensaje(Integer idMensaje);
	public List<Mensaje> todosLosMensajes();
	public void modificaMensaje(Integer idMensaje, String textoMensaje);
	public void agregarMensaje(Mensaje nuevoMensaje);
	public void eliminarMensaje(Integer idMensaje);
}
