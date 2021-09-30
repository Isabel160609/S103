/*Exercici 2. Asseguri's que el Contenidor utilitzat en el punt anterior no permet duplicats, i
 *  verifiqui'l..*/

package s103Nivell1Exercici2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos Array
		
		ArrayList<Month> ListMeses=new ArrayList<Month>();
		
		ListMeses.add(new Month("Enero"));
		ListMeses.add(new Month("Febero"));
		ListMeses.add(new Month("Marzo"));
		ListMeses.add(new Month("Abril"));
		ListMeses.add(new Month("Mayo"));
		ListMeses.add(new Month("Junio"));
		ListMeses.add(new Month("Julio"));
		ListMeses.add(new Month("Septiembre"));
		ListMeses.add(new Month("Octubre"));
		ListMeses.add(new Month("Noviembre"));
		ListMeses.add(new Month("Diciembre"));
		ListMeses.add(new Month("Diciembre"));
		ListMeses.add(new Month("Diciembre"));
		ListMeses.add(new Month("Diciembre"));
		
		LinkedHashSet<Month> listaMesesHash=new LinkedHashSet(ListMeses);
		

		for(Month mes:listaMesesHash) {
			System.out.print(mes.getName()+ ", ");
		}
		System.out.println();
		

	}

}
