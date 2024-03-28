package cl.curso.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AppMensajes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola  mundo Java!! ");
		String mensajeSaludo = "Mensaje de saludo!";
		// syso + Ctrl Space
		System.out.println(mensajeSaludo);
		mensajeSaludo = null;
		imprimeMensaje(mensajeSaludo);
		
		String m = retornaMensaje("   ");
		System.out.println("El mensaje retornado es: " + m);
		
		String men1 = "mensaje 1"; // JVM stack - heap
		String men2 = "";
		System.out.println(concatenaMensajes(men1, men2));
		
		String men3 = "mensaje 3";
		String men4 = "mensaje 4";
		
		System.out.println(concatenaMensajes(men1,men2,men3,men4));
		
		List<String> listaMensajesInput = new ArrayList<String>();
		listaMensajesInput.add(men1);
		listaMensajesInput.add(men2);
		listaMensajesInput.add(men3);
		listaMensajesInput.add(men4);
		
		System.out.println(concatenaMensajes(listaMensajesInput));
		
		men1 = "Jueves";
		men2 = "jueves";
		Boolean res = comparaMensajes(men1, men2);
		System.out.println("Son iguales con equalsIgnoreCase ? " + res);
	}
	
	private static void imprimeMensaje(String mensaje) {
		// validar el parametro mensaje	
		if(!Objects.isNull(mensaje) && mensaje.trim().length() > 0) {
			System.out.println(" El mensaje a imprimir es :-> " + mensaje);
		}else {
			System.out.println("No viene mensaje !");
		}		
		/*
		if(mensaje != null && mensaje.trim().length() > 0) {
			System.out.println(" El mensaje a imprimir es :-> " + mensaje);
		}else {
			System.out.println("No viene mensaje !");
		}
		*/
	}
	private static String retornaMensaje(String mensajeBase) {
		final String MENSAJE_INTERNO = " este es el mensaje interno.";
		// operador ternario
		String mensajeResultado = 
		Objects.nonNull(mensajeBase) && mensajeBase.trim().length() > 0 ? mensajeBase + " , " + MENSAJE_INTERNO : "sin mensaje"; 
		return mensajeResultado;
	}
	// Micro ejercicio:
	// retornar la concatenacion de m1 y m2 si es que ambos no son vacios ... "mensaje invalido" de lo contrario
	private static String concatenaMensajes(String m1, String m2) {
		if(!m1.trim().isEmpty() && !m2.trim().isEmpty()) {
			return m1 + " , " + m2;
		}
		return "mensaje invalido ";
	}
	
	// sobrecarga de metodo concatenaMensajes	
	// alt+60   alt+62
	private static String concatenaMensajes(String...  mensajes) {	
		if(mensajes.length > 0) {
			String mTmp = "";
			for(String m : mensajes) {
				mTmp += m;
			}
			return mTmp;
		}
		
		return "No vienen mensajes !";
	}
	// lo mismo pero con Collection
	private static String concatenaMensajes(List<String> listaMensajes) {
		if(!listaMensajes.isEmpty()) {
			String mTmp = " - ";
			for(String m : listaMensajes) {
				mTmp += m;
			}
			return mTmp;
		}
		return "No vienen mensajes en la lista !";
	}
	// wrapper de boolean ... autoboxing
	private static Boolean comparaMensajes(String m1, String m2) {
		
		System.out.println(" Son = con equals ? " + m1.equals(m2));
		return m1.equalsIgnoreCase(m2);
	}
}
