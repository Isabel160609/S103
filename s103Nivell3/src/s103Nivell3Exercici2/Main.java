/*Creu un contenidor que encapsuli una matriu d'objectes String i que només permeti afegir i extreure cadenes de 
 * caràcters. Si la matriu no és prou gran per a la següent inserció, el contenidor ha de redimensionar automàticament
 *  la matriu. En main(), compari el rendiment d'aquest contenidor amb el de ArrayList<String>.*/
package s103Nivell3Exercici2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		//aqui esta mi codigo implementado segun mi propia clase que redimensiona array
		//inicio contador de tiempo para saber duracion proceso
		final long startTime = System.currentTimeMillis();
		
		//utilizo mis propios metodos add y remove
		Numero paraules = new Numero();
		paraules.add(1);
		paraules.add(2);
		paraules.add(3);
		paraules.add(4);
		paraules.add(5);
		System.out.println("aqui la demostracion de la encapsulacion");
		System.out.println(paraules);
		
		paraules.remove(0);
		System.out.println(paraules);
		
		paraules.remove(5);
		System.out.println(paraules);
		//detengo contador tiempo
		final long endTime = System.currentTimeMillis();
		//imprimo el tiempo transcurrido
		System.out.println("Total execution time: " + (endTime - startTime));

		//Aqui esta un arrayList normal para comparar el tiempo
		//inicio contador
		final long startTime2 = System.currentTimeMillis();
		System.out.println("aqui la ArrayList");
		ArrayList <Integer> palabras= new ArrayList <Integer>();
		
		palabras.add(1);
		palabras.add(2);
		palabras.add(3);
		palabras.add(4);
		palabras.add(5);
		
		System.out.println(palabras);
		
		palabras.remove(0);
		System.out.println(palabras);
		//detengo contador
		final long endTime2 = System.currentTimeMillis();
		//imprimo contador
		System.out.println("Total execution time: " + (endTime2 - startTime2));
	}
}
