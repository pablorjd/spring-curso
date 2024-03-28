package cl.curso.pelicula.main;

import java.util.List;

import cl.curso.pelicula.pojo.Pelicula;
import cl.curso.pelicula.services.IServiciosPelicula;
import cl.curso.pelicula.services.impl.ServiciosPeliculaImpl;
import cl.curso.pelicula.util.ValidadorPeliculas;
import lombok.extern.slf4j.Slf4j;

/**
 * Clase que llama a operaciones CRUD sobre la bd de peliculas
 * 
 * @author Academy
 *
 */
@Slf4j
public class AppPeliculas {

	private static IServiciosPelicula isp = new ServiciosPeliculaImpl();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// listar a todas la peliculas
		if (isp.listarTodasLasPeliculas().size() > 0) {
			isp.listarTodasLasPeliculas().forEach(pel -> {
				log.info("nombre :-> " + pel.getNombrePelicula());
				log.info("director :-> " + pel.getDirectorPelicula());
				log.info("genero :-> " + pel.getGeneroPelicula());
			});
		} else {
			System.out.println("No hay peliculas para listar !");
		}

		// Agregar una nueva pelicula
		Integer numeroIdPelicula = 0;
		if(ValidadorPeliculas.rangoNumerico(numeroIdPelicula)) {
			isp.agregarNuevaPelicula(new Pelicula(numeroIdPelicula, "Barbie", "X", "Comedia"));
		}else {
			System.out.println("Datos incorrectos!");
		}

		if (isp.listarTodasLasPeliculas().size() > 0) {
			isp.listarTodasLasPeliculas().forEach(pel -> {
				log.info("nombre :-> " + pel.getNombrePelicula());
				log.info("director :-> " + pel.getDirectorPelicula());
				log.info("genero :-> " + pel.getGeneroPelicula());
			});
		}

		// buscar x genero

		List<Pelicula> lp = isp.buscarPeliculasPorGenero("Sci-Fi");
		if (lp.size() > 0) {
			System.out.println("Peliculas de Sci-Fi");
			lp.forEach(pel -> {
				log.info("nombre :-> " + pel.getNombrePelicula());
				log.info("director :-> " + pel.getDirectorPelicula());
				log.info("genero :-> " + pel.getGeneroPelicula());
			});
		}else {
			System.out.println("No hay peliculas de ese genero!");
		}
		
		// verificar que es singleton
		ValidadorPeliculas vp1 = ValidadorPeliculas.getInstanciaValidadorPeliculas();
		ValidadorPeliculas vp2 = ValidadorPeliculas.getInstanciaValidadorPeliculas();

		System.out.println(vp1);
		System.out.println(vp2);

	}

}
