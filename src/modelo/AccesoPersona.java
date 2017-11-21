package modelo;

public class AccesoPersona {
	public static float cuantoAvanza(Persona quien, int numPasos) {
       return quien.getLongPaso() * numPasos/100;
	}
	
	
}
