/*Creu un contenidor que encapsuli una matriu d'objectes String i que només permeti afegir i extreure cadenes de 
 * caràcters. Si la matriu no és prou gran per a la següent inserció, el contenidor ha de redimensionar automàticament
 *  la matriu. En main(), compari el rendiment d'aquest contenidor amb el de ArrayList<String>.*/
package s103Nivell3Exercici1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// aqui esta mi codigo implementado segun mi propia clase que redimensiona array
		// inicio contador de tiempo para saber duracion proceso

		final long startTime = System.currentTimeMillis();

		Cadena paraules = new Cadena();
		// utilizo mis propios metodos add y remove
		paraules.add("hola");
		paraules.add("uno");
		paraules.add("dos");
		paraules.add("tres");
		paraules.add("cuatro");
		System.out.println("aqui la demostracion de la encapsulacion");
		System.out.println(paraules);

		paraules.remove(0);
		System.out.println(paraules);

		paraules.remove(5);
		System.out.println(paraules);
		// detengo contador tiempo

		final long endTime = System.currentTimeMillis();
		// imprimo el tiempo transcurrido
		System.out.println("Total execution time: " + (endTime - startTime));

		// Aqui esta un arrayList normal para comparar el tiempo
		// inicio contador
		final long startTime2 = System.currentTimeMillis();

		System.out.println("aqui la ArrayList");
		ArrayList<String> palabras = new ArrayList<String>();

		palabras.add("hola");
		palabras.add("uno");
		palabras.add("dos");
		palabras.add("tres");
		palabras.add("cuatro");

		System.out.println(palabras);

		palabras.remove(0);
		System.out.println(palabras);

		// detengo contador
		final long endTime2 = System.currentTimeMillis();
		// imprimo contador
		System.out.println("Total execution time: " + (endTime2 - startTime2));
	}
}
