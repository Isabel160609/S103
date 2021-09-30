/*Creu una classe que contingui un objecte Integer que s'inicialitzi amb un valor comprès entre 0 i 100 utilitzant 
 * java.util.Random. Implementi Comparable emprant aquest tipus Integer. Empleni una cua de tipus PriorityQueue amb
 *  objectes d'aquesta classe i extregui els valors utilitzant poll() per a demostrar que s'obté l'ordre desitjat.*/

package s103Nivell2;

import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		
		//creamos 4 objetos
		Numero num1 = new Numero();
		Numero num2 = new Numero();
		Numero num3 = new Numero();
		Numero num4 = new Numero();
		
		
		//Los introducimos en la PriorityQueue
		PriorityQueue<Numero> numeros= new PriorityQueue<Numero>();
		numeros.add(num1);
		numeros.add(num2);
		numeros.add(num3);
		numeros.add(num4);
		System.out.println(numeros);
		
		//eliminamos con pool de forma ordenada
		//hasta que se queda vacio 
		for (int i=0;i<4;i++) {
			numeros.poll();
			System.out.println(numeros);
		}

	}
}
