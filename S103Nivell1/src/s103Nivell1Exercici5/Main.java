/*Exercici 5. Creu i empleni un objecte List<Integer>. Creu un segon objecte List<Integer> de la mateixa
 *  grandària que el primer i utilitzi sengles objectes ListIterator per a llegir els elements de la primera
 *   llista i inserir-los en la segona en ordre invers (provi d'explorar diverses formes diferents de
 *    resoldre aquest problema).*/

package s103Nivell1Exercici5;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//primera lista
		LinkedList<Integer> listaImpares = new LinkedList<Integer>();
		listaImpares.add(1);
		listaImpares.add(3);
		listaImpares.add(5);
		listaImpares.add(7);

		//segunda lista
		LinkedList<Integer> listaPares = new LinkedList<Integer>();
		listaPares.add(2);
		listaPares.add(4);
		listaPares.add(6);
		listaPares.add(8);
		
		System.out.println(listaImpares);
		System.out.println(listaPares);
		
		
		//creamos los iteradores
		//ponemos como parametros el iterador.size() para que empiece a iterar desde el final
		ListIterator<Integer> iteradorImpares=listaImpares.listIterator(listaImpares.size());
		ListIterator<Integer> iteradorPares=listaPares.listIterator(listaPares.size());
		
//		
		//mientras pueda recorrer hacia atras que inserte los datos
		while(iteradorPares.hasPrevious()) {
			
			//si quisieramos alternarlos descomentariamos el if
			
//			if (iteradorImpares.hasNext()) {
//				
//				 iteradorImpares.next();
//			}
			iteradorImpares.add(iteradorPares.previous());
		}
		System.out.println(listaImpares);
		
		//otra forma de hacerlo con un bucle for
		for (int i=listaPares.size()-1;i>=0;i--) {
			listaImpares.add(listaPares.get(i));
			
		}
		System.out.println(listaImpares);
	}
	
	
}
