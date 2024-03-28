package cl.curso.services.impl;

import java.util.List;

import cl.curso.services.IServiciosMensajes;
import lombok.extern.java.Log;
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

}
