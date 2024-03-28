package cl.curso.services.impl;

import java.util.List;
import java.util.Objects;

import cl.curso.pojo.Mensaje;
import cl.curso.repositorio.IDatosDummyMensajes;
import cl.curso.repositorio.impl.DatosDummyMensajesImpl;
import cl.curso.services.IServiciosMensajes;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServiciosMensajesImpl implements IServiciosMensajes {

	//@Override
	public String concatenaMensajes(String m1, String m2) {
		// TODO Auto-generated method stub
		if(!m1.trim().isEmpty() && !m2.trim().isEmpty()) {
			return m1 + " , " + m2;
		}
		
		return "mensaje invalido ";
	}

	//@Override
	public String concatenaMensajes(String... mensajes) {
		if(mensajes.length > 0) {
			String mTmp = "";
			for(String m : mensajes) {
				mTmp += m;
			}
			return mTmp;
		}
		
		return "No vienen mensajes !";
	}

	public String concatenaMensajes(List<String> listaMensajes) {
		if(!listaMensajes.isEmpty()) {
			String mTmp = " - ";
			for(String m : listaMensajes) {
				mTmp += m;
			}
			return mTmp;
		}
		return "No vienen mensajes en la lista !";
	}

	public Boolean comparaMensajes(String m1, String m2) {
		//System.out.println(" Son = con equals ? " + m1.equals(m2));
		
		return m1.equalsIgnoreCase(m2);
	}

	@Override
	public Mensaje mensajePorDefecto() {
		log.info("Se crea el mensaje por defecto");
		Mensaje m = new Mensaje();
		
		m.setIdMensaje(0);
		m.setTipoMensaje("WSP");
		m.setTextoMensaje("Hola mundo !");
		
		return m;
	}

	@Override
	public Mensaje crearMensaje(Integer idMensaje, String tipoMensaje, String textoMensaje) {
		// TODO Auto-generated method stub
		
		Mensaje m =new  Mensaje();
		m.setIdMensaje(idMensaje);
		m.setTipoMensaje(tipoMensaje);
		m.setTextoMensaje(textoMensaje);
		
		return m;
	}

	@Override
	public Boolean compara2Mensajes(Mensaje m1, Mensaje m2) {
		// TODO Auto-generated method stub
		if(Objects.nonNull(m1) && Objects.nonNull(m2)) {
			if(m1.getTipoMensaje().trim().equalsIgnoreCase(m2.getTipoMensaje().trim()) && 
					m1.getTextoMensaje().trim().equalsIgnoreCase(m2.getTextoMensaje().trim())	) {
				return true;
			}
			//return m1.getTipoMensaje().trim().equalsIgnoreCase(m2.getTipoMensaje().trim()) && 
			//		m1.getTextoMensaje().trim().equalsIgnoreCase(m2.getTextoMensaje().trim());
		}

		return false;
		
	}

	public List<Mensaje> buscarMensajePorTipo(String tipoMensaje){
		// llamar al repositorio
		IDatosDummyMensajes repositorio = new DatosDummyMensajesImpl();
		return repositorio.buscarMensajePorTipo(tipoMensaje);
	}
}
