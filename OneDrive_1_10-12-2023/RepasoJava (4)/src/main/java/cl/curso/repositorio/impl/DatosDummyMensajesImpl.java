package cl.curso.repositorio.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import cl.curso.pojo.Mensaje;
import cl.curso.repositorio.IDatosDummyMensajes;

public class DatosDummyMensajesImpl implements IDatosDummyMensajes{

	private List<Mensaje> listaDeMensajes = new ArrayList<Mensaje>();
	
	public DatosDummyMensajesImpl() {
		listaDeMensajes.add(new Mensaje(1,"SMS","texto 1 SMS"));
		listaDeMensajes.add(new Mensaje(2,"EMA","texto 1 EMA"));
		listaDeMensajes.add(new Mensaje(3,"SMS","texto 3 SMS"));
		listaDeMensajes.add(new Mensaje(4,"TWI","texto 4 TWI"));
		listaDeMensajes.add(new Mensaje(5,"WSP","texto 5 WSP"));
		listaDeMensajes.add(new Mensaje(6,"WSP","texto 6 WSP"));
	}

	@Override
	//Optional<List<Mensaje>>
	public List<Mensaje> buscarMensajePorTipo(String tipoMensaje) {
		// TODO Auto-generated method stub
		List<Mensaje> listaResultado = new ArrayList<Mensaje>();
		/*
		for(Mensaje m : this.listaDeMensajes) {
			if(m.getTipoMensaje().equalsIgnoreCase(tipoMensaje)) {
				listaResultado.add(m);
			}
		}
		*/
		this.listaDeMensajes.stream().filter(me -> me.getTipoMensaje().trim().equalsIgnoreCase(tipoMensaje)).
		forEach(p -> {
			listaResultado.add(p);
		});
		
		return listaResultado;
	}

	@Override
	public List<Mensaje> buscarMensaje(Integer idMensaje) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mensaje> todosLosMensajes() {
		// TODO Auto-generated method stub
		return this.listaDeMensajes;
	}

	@Override
	public void modificaMensaje(Integer idMensaje, String textoMensaje) {
		// TODO Auto-generated method stub
		/*
		for(Mensaje m : this.listaDeMensajes) {
			if(m.getIdMensaje() == idMensaje) {
				m.setTextoMensaje(textoMensaje);
				break;
			}
		}
		*/
		this.listaDeMensajes.stream().filter(p -> p.getIdMensaje() == idMensaje).findFirst().get().setTextoMensaje(textoMensaje);
		
	}

	@Override
	public void agregarMensaje(Mensaje nuevoMensaje) {
		// TODO Auto-generated method stub
		this.listaDeMensajes.add(nuevoMensaje);
		
	}

	@Override
	public void eliminarMensaje(Integer idMensaje) {
		// TODO Auto-generated method stub	
		/*
		for(Mensaje m : this.listaDeMensajes) {
			if(m.getIdMensaje() == idMensaje) {
				this.listaDeMensajes.remove(m);
				break;
			}
		}
		*/
		Predicate<Mensaje> seEliminaElMensaje = mensaje -> mensaje.getIdMensaje() == idMensaje;
		this.listaDeMensajes.removeIf(seEliminaElMensaje);
	}
}
