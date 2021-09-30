package s103Nivell1Exercici3;

public class Pelicula {

	private static String [] nombresPersonajes= {"Neo","Morfeo","Trinity","Agente Smith","Oráculo","Merovingio",
										"Perséfone","El Hacedor de llaves","El Arquitecto"};
	public static final int size=nombresPersonajes.length;
	public static int contador=0;
	
	public static String next() {
		String dato="";
		if(contador<size) {
			dato=nombresPersonajes[contador];
			contador++;
		}else if (contador==9) {
			contador=0;
			dato=nombresPersonajes[contador];
			contador++;
		}
		
		return dato;
	}
}
