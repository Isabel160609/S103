/*Exercici 3. Creu una classe generadora que retorni noms de personatges (com String) de la seva pel·lícula
 *  favorita cada que vegada que invoqui next(), i que torni al principi de la llista de personatges una
 *   vegada que hagi acabat amb tots els noms. Utilitzi aquest generador per a emplenar una matriu, un 
 *   ArrayList, un LinkedList, un HashSet, un LinkedHashSet i un TreeSet, i després imprimeixi per pantalla 
 *   cada contenidor*/

package s103Nivell1Exercici3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("yo soy un array");
		int numero=10;
		String[] b = new String[numero];
		b=generadorCollecciones.rellenaArray( numero);
		for (String p:b){
			System.out.print(p+", ");
		}
		System.out.println();
		System.out.println("yo soy un arrayList");
		ArrayList<String>c=new ArrayList<String>();
		c=(ArrayList<String>)generadorCollecciones.rellenaColecciones( c, 10);
		for (String p:c){
			System.out.print(p+", ");
		}
		System.out.println();
		System.out.println("yo soy un LinkedList");
		
		LinkedList<String>d=new LinkedList<String>();
		d=(LinkedList<String>)generadorCollecciones.rellenaColecciones( d, 10);
		for (String p:d){
			System.out.print(p+", ");
		}
		System.out.println();
		System.out.println("yo soy un HashSet");
		
		HashSet<String>e=new HashSet<String>();
		e=(HashSet<String>)generadorCollecciones.rellenaColecciones( e, 10);
		for (String p:e){
			System.out.print(p+", ");
		}
		System.out.println();
		System.out.println("yo soy un TreeSet");
		
		TreeSet<String>f=new TreeSet<String>();
		f=(TreeSet<String>)generadorCollecciones.rellenaColecciones( f, 10);
		for (String p:f){
			System.out.print(p+", ");
		}
		
	}

}
