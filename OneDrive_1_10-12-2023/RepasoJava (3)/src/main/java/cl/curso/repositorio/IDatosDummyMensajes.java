package cl.curso.repositorio;

import java.util.List;
import cl.curso.pojo.Mensaje;

public interface IDatosDummyMensajes {

	public List<Mensaje> buscarMensajePorTipo(String tipoMensaje);
}
