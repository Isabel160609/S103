package s103Nivell1Exercici4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Persona  implements Comparable<Persona>{

	String nombre;
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//implementamos comparable
	@Override
	public int compareTo(Persona o) {
		return this.getNombre().compareTo(o.getNombre());
	}
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

	
	
}
