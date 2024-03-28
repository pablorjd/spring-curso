package cl.curso.pelicula.util;

import java.util.Objects;

/**
 * Clase que realiza operaciones de validacion sobre los datos de una Pelicula
 * Implementa el patron Singleton
 * 
 * @author Academy
 *
 */
public class ValidadorPeliculas {

	private static ValidadorPeliculas instanciaValidadorPeliculas;

	// bloque estatico
	static {
		instanciaValidadorPeliculas = new ValidadorPeliculas();
	}

	private ValidadorPeliculas() {

	}

	/**
	 * Retorna la unica instancia de la clase
	 * 
	 * @return
	 */
	public static ValidadorPeliculas getInstanciaValidadorPeliculas() {
		return instanciaValidadorPeliculas;
	}

	/**
	 * Valida que un texto no este vacio
	 * 
	 * @param texto
	 * @return
	 */
	public static Boolean textoVacio(String texto) {
		return Objects.nonNull(texto) ? texto.trim().isEmpty() : false;
	}

	/**
	 * Validar que un numero sea > 0 y < 1000
	 */
	public static Boolean rangoNumerico(Integer numero) {
		if (numero <= 0 || numero >= 1000) {
			return false;
		}
		return true;
	}
}
