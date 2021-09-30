package s103Nivell3Exercici1;

import java.util.Arrays;

public class Cadena {

	private String[] paraules;
	private static int size;

	public Cadena() {
		paraules = new String[size];
		size = 0;
	}

	public String[] getParaules() {
		return paraules;
	}

	public void setParaules(String[] paraules) {
		this.paraules = paraules;
	}

	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		Cadena.size = size;
	}

	@Override
	public String toString() {
		return "Cadena [paraules=" + Arrays.toString(paraules) + "]";
	}

	public void add(String paraula) {
		if (size >= paraules.length) {
			paraules = Arrays.copyOf(paraules, size + 1);
		}
		paraules[size] = paraula;
		size++;
	}

	public boolean esta(int posicion) {
		boolean iguales = false;
		int i = 0;
		while (!iguales && i < paraules.length) {
			if (i == posicion) {
				iguales = true;
			}
			i++;
		}
		return iguales;
	}
	
	public void remove(int posicion) {
		if(esta(posicion)) {
			String [] paraules2=new String [size-1];
			int j=0;
			for (int i=0;i<paraules.length;i++) {
				
				if( i!=posicion) {
					paraules2[j]=paraules[i];
					j++;
				}
			}
			size--;
			paraules=paraules2;
			
		}else {
			System.out.println("esta posicion no se puede borrar por que no existe");
		}
	}
}
