/*Exercici 4. Escriba un metodo que utilitzi un iterador per a recórrer una col·lecció i imprimeixi el 
 * resultat de toString() per a cada objecte del Contenidor. Empleni tots els diferents tipus de Java 
 * Collections amb una sèrie d'objectes i aplicació el mètode que hagi dissenyat a cada Contenidor.*/

package s103Nivell1Exercici4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Persona> tipoArrayList = new ArrayList<Persona>();
		tipoArrayList.add(new Persona("Maria"));
		tipoArrayList.add(new Persona("Luis"));
		tipoArrayList.add(new Persona("Pepe"));
		tipoArrayList.add(new Persona("Antonio"));

		Iterador.iterador(tipoArrayList);
		System.out.println();

		// creo y utilizo LinkedList
		LinkedList<Persona> tipoLinkedList = new LinkedList(tipoArrayList);
		Iterador.iterador(tipoLinkedList);
		System.out.println();

		// creo y utilizo HashSet
		HashSet<Persona> tipoHashSet = new HashSet(tipoArrayList);
		Iterador.iterador(tipoHashSet);
		System.out.println();

		// creo y utilizo TreeSet
		//para utilizar treeset necesito implementar la clase persona con Comparable para que pueda ordenar
		TreeSet<Persona> tipoTreeSet = new TreeSet<Persona>(tipoArrayList);
		Iterador.iterador(tipoTreeSet);
		System.out.println();


	}

}
