/*Exercici 8. Empleni un mapa LinkedHashMap amb claus de tipus String i objectes del tipus que prefereixi.
 *  Extregui les parelles, ordeni-les segons les claus (en ordre alfabètic) i torni a inserir-les en el mapa.
 *  */

package s103Nivell1Exercici8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//introdueixo en un LinkedHashMap
		LinkedHashMap<String,Persona>  mapa=new LinkedHashMap<String,Persona>();
		
		mapa.put("uno", new Persona("pepe","perez"));
		mapa.put("dos", new Persona("Josep","Doenech"));
		mapa.put("tres", new Persona("Juan","Garcia"));
		mapa.put("cuatro", new Persona("Toni","Cuevas"));
		
		System.out.println(mapa);
		
		//puedo ordenar con el sort pero antes hay que introducir en un arrayList para que pueda hacer sort
		 Set<Map.Entry<String,Persona>> set =  mapa.entrySet();
		 List<Map.Entry<String,Persona>> list = new ArrayList<Map.Entry<String,Persona>>(set);
		 System.out.println(list);
		 
		 //una vez en un arrayList ya puedo ordenar cuando lo hago con Strings utilizo el compareTo
		 //estoy metiendo la funcion comparar como parametro de la funcion sort
		 Collections.sort(list, new Comparator<Map.Entry<String,Persona>>(){
			 public int compare(Map.Entry<String,Persona> entry1, Map.Entry<String,Persona> entry2) {
		            return entry1.getKey().compareTo(entry2.getKey());
		        }
		 });
		 //imprimo la lista para ver que esta ordenado
		 System.out.println(list);
		 
		 //Introduzco  en el linkedHashMapa pero tengo que extraer de la array los pares clave valor en este caso no puedo llenarlo
		 //con un linkedHashMapMapa.putAll(list) ya que hay que extraer la clave y el valor de los entry
		 Map<String,Persona> linkedHashMapa = new LinkedHashMap<String,Persona>();
		    for (Map.Entry<String,Persona> entry : list) {
		       linkedHashMapa.put(entry.getKey(), entry.getValue());
		    }
		    
		    System.out.println(linkedHashMapa);
		    
		    
		    
		 //esta seria otra manera de ordenar introduciendo en un treemap   
		    
		/*//ordeno amb el treeMap
		TreeMap<String,Persona> treeMapMapa = new TreeMap<>();
		treeMapMapa.putAll(mapa);
		System.out.println( treeMapMapa);
		
		//torno a insertar en unLinkedHashMap
		LinkedHashMap<String,Persona>  linkedHashMapMapa=new LinkedHashMap<String,Persona>();
		linkedHashMapMapa.putAll(list);
		System.out.println( linkedHashMapMapa);
		*/
	}
	
	

}
