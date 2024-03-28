package cl.curso.pelicula.util;

import java.util.Objects;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Crear un EntityManagerFactory
 * @author Academy
 *
 */
public class JPAUtil {

	private static EntityManagerFactory factory;
	private static final String PERSISTENCE_UNIT_NAME = "BDCurso";
	
	public static EntityManagerFactory crearEntityManagerFactory() {
		if(Objects.isNull(factory)) {
			return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}
	
	public static void cerraEntitymanagerFactory() {
		if(factory != null) {
			factory.close();
		}
	}
}
