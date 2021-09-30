package s103Nivell3Exercici2;

import java.util.Arrays;

public class Numero {

	private int[] numeros;
	private static int size;

	public Numero() {
		numeros = new int[size];
		size = 0;
	}

	public int[] getnumeros() {
		return numeros;
	}

	public void setnumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		Numero.size = size;
	}

	@Override
	public String toString() {
		return "Cadena [numeros=" + Arrays.toString(numeros) + "]";
	}

	public void add(int numero) {
		if (size >= numeros.length) {
			numeros = Arrays.copyOf(numeros, size + 1);
		}
		numeros[size] = numero;
		size++;
	}

	public boolean esta(int posicion) {
		boolean iguales = false;
		int i = 0;
		while (!iguales && i < numeros.length) {
			if (i == posicion) {
				iguales = true;
			}
			i++;
		}
		return iguales;
	}
	
	public void remove(int posicion) {
		if(esta(posicion)) {
			int [] numeros2=new int [size-1];
			int j=0;
			for (int i=0;i<numeros.length;i++) {
				
				if( i!=posicion) {
					numeros2[j]=numeros[i];
					j++;
				}
			}
			size--;
			numeros=numeros2;
			
		}else {
			System.out.println("esta posicion no se puede borrar por que no existe");
		}
	}
}
