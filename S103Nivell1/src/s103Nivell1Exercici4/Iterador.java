package s103Nivell1Exercici4;

import java.util.Collection;
import java.util.Iterator;

public class Iterador {
	public static <T> void iterador(Collection<T> coleccion) {

		Iterator<T> it = coleccion.iterator();

		while (it.hasNext()) {
			String objecte = it.next().toString();
			System.out.print(objecte + ", ");
		}

	}
}
