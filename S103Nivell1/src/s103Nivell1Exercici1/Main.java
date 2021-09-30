/*Exercici 1. Creu un objecte de tipus Month amb un atribut "name" (que contingui el nom del mes
 *  de l'any).
Anyada 11 objectes Month (cadascun amb el seu atribut diferent) en un Contenidor Java, a excepció
 de l'objecte amb atribut "Agost". Després, efectuï la inserció en el lloc que correspon a aquest 
 mes i demostri que el Contenidor manté l'ordre correcte.*/

package s103Nivell1Exercici1;

import java.util.ArrayList;

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
		
		
		for (int i = 0; i < ListMeses.size() ; i++) {
			System.out.print(ListMeses.get(i).getName() + ", ");
		}
		System.out.println();
		ListMeses.add(7,new Month("Agosto"));
		
		for (int i = 0; i < ListMeses.size() ; i++) {
			System.out.print(ListMeses.get(i).getName() + ", ");
		}
		System.out.println();
		
		
		/*Month[] meses = new Month[12];
		
		//llenamos array
		meses[0] = new Month("Enero");
		meses[1] = new Month("Febero");
		meses[2] = new Month("Marzo");
		meses[3] = new Month("Abril");
		meses[4] = new Month("Mayo");
		meses[5] = new Month("Junio");
		meses[6] = new Month("Julio");
		meses[7] = new Month("Septiembre");
		meses[8] = new Month("Octubre");
		meses[9] = new Month("Noviembre");
		meses[10] = new Month("Diciembre");

		//imprimimos array i veiem que no te agost
		for (int i = 0; i < meses.length - 1; i++) {
			System.out.print(meses[i].getName() + ", ");
		}
		System.out.println();

		
		//Creem un algoritme per insertar el mes al seu lloc
		Month aux = new Month("");
		Month aux2 = new Month("");
		//tot lo anterior a 7 queda igual
		for (int i = 0; i < meses.length; i++) {

			//a la posicio 7 insertem agost
			if (i == 7) {
				aux = meses[i];
				meses[i] = new Month("agosto");
			//movem tots els demes mesos per que estiguin al seu lloc
			} else if (i > 7) {
				aux2=meses[i];
				meses[i] = aux;
				aux=aux2;
				

			}
		}
		//tornem a imprimir per veure que es correcte
		for (int j = 0; j < meses.length; j++) {
			System.out.print(meses[j].getName() + ", ");
		}*/

	}

}
