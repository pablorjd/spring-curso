package cl.curso.springboot.repositorio.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.curso.springboot.entidades.UsuarioJPA;

public interface IUsuariosRepositorioJPA extends JpaRepository<UsuarioJPA, Integer> {
	
	public List<UsuarioJPA> findByApellido(String apellidoUsuario);
	public UsuarioJPA findByEmail(String emailUsuario);

}
