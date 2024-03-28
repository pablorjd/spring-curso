package cl.curso.repositorio.impl;

import java.util.ArrayList;
import java.util.List;

import cl.curso.pojo.Mensaje;
import cl.curso.repositorio.IDatosDummyMensajes;

public class DatosDummyMensajesImpl implements IDatosDummyMensajes{

	private List<Mensaje> listaDeMensajes; // = new ArrayList<Mensaje>();
	
	public DatosDummyMensajesImpl() {
		listaDeMensajes.add(new Mensaje(1,"SMS","texto 1 SMS"));
		listaDeMensajes.add(new Mensaje(2,"EMA","texto 1 EMA"));
		listaDeMensajes.add(new Mensaje(3,"SMS","texto 3 SMS"));
		listaDeMensajes.add(new Mensaje(4,"TWI","texto 4 TWI"));
		listaDeMensajes.add(new Mensaje(5,"WSP","texto 5 WSP"));
		listaDeMensajes.add(new Mensaje(6,"WSP","texto 6 WSP"));
	}

	@Override
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
}
