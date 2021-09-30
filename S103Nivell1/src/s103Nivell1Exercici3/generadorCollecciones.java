package s103Nivell1Exercici3;

import java.util.Collection;

public class generadorCollecciones {
	
	public static Collection<String> rellenaColecciones(Collection<String> c, int numero){
		for (int i=0;i<numero;i++) {
			c.add(Pelicula.next());
		}
		return c;
	}

	public static String[] rellenaArray( int numero){
		String[] c = new String[numero];
		for (int i=0;i<numero;i++) {
			c[i]=(Pelicula.next());
		}
		return c;
	}
}
