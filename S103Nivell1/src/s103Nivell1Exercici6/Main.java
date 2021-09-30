package s103Nivell1Exercici6;

import java.util.LinkedList;
import java.util.ListIterator;

/*Exercici 6. Creu un objecte buit LinkedList<Integer>. Utilitzant un iterador ListIterator, afegeixi
 *  valors sencers a la llista inserint-los sempre a la meitat d'aquesta*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(4);
		
		ListIterator<Integer> iteradorNumeros=listaNumeros.listIterator();
		
		int numeroIntroducir;
		do {
			numeroIntroducir=Teclado.leerInt("dame un numero positivo, cuando no quieras introducir"
									+ " mas numeros introduce un negativo");
			iteradorNumeros=listaNumeros.listIterator();
			if (numeroIntroducir>=0) {
				
				for(int i=0;i<(listaNumeros.size()/2);i++) {
					iteradorNumeros.next();
				}
				iteradorNumeros.add(numeroIntroducir);
			}
			
		}while(numeroIntroducir>=0);
		
		
		System.out.println(listaNumeros);
		
	}

}
