package cl.curso.main;

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

}
