/*Exercici 7. Empleni un HashMap amb parells clau-valor. Imprimeixi els resultats per a mostrar 
 * l'ordenació segons el codi hash. Ordeni les parelles, extregui la clau i introdueixi el resultat
 *  en un mapa LinkedHashMap. Demostri que es manté l'ordre d'inserció*/

package s103Nivell1Exercici7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;

public class Main2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
//esta seria una forma de ordenar con un treemap
		
		
		HashMap<String, Integer>numeros = new HashMap<String, Integer>();

		numeros.put("uno", 1);
		numeros.put("dos", 2);
		numeros.put("tres", 3);
		numeros.put("cuatro", 4);

		System.out.println("imprimo HashMap");
		for (String key :numeros.keySet()) {
			System.out.println("Clave: " + key + ", Valor: " +numeros.get(key));
		}

		TreeMap<String, Integer> treeMapNumeros = new TreeMap<>();

		treeMapNumeros.putAll(numeros);

		System.out.println("imprimo TreeMap");

		for (String key : treeMapNumeros.keySet()) {
			System.out.println("Clave: " + key + ", Valor: " + treeMapNumeros.get(key));
		}

		LinkedHashMap<String, Integer> linkedHashMapnumeros = new LinkedHashMap<String, Integer>();

		linkedHashMapnumeros.putAll(treeMapNumeros);

		System.out.println("imprimo linkedHashMap");
		for (String key : linkedHashMapnumeros.keySet()) {
			System.out.println("Clave: " + key + ", Valor: " + linkedHashMapnumeros.get(key));
		}
		
		//aqui la segunda parte con hashSet y LinkedHashSet
		
		HashSet <String> nombres=new HashSet <String>();
		nombres.add("Ana");
		nombres.add("Pepe");
		nombres.add("David");
		nombres.add("Paloma");
		
		System.out.println(nombres);
		List<String> ListaOrdenadaNombres = new ArrayList<>(nombres);
		Collections.sort( ListaOrdenadaNombres);

		System.out.println(ListaOrdenadaNombres);
		
		LinkedHashSet <String> linkedHashSetNombres=new  LinkedHashSet <String>();
		
		linkedHashSetNombres.addAll(ListaOrdenadaNombres);
		
		System.out.println(linkedHashSetNombres);
	}

}
