package s103Nivell2;

import java.util.*;
//tenemos que implementar Comparable para que pueda funcionar PriorityQueue ya que necesita comparar para poder ordenar
public class Numero implements Comparable<Numero>{
	int numero;
	//pedimos el random
	public Numero() {
		numero=(int) Math.floor(Math.random()*(100-0+1)+0);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Numero [numero=" + numero + "]";
	}
	//necesitamos sobreescribir el comparabe para implementarlo 
	@Override
	public int compareTo(Numero o) {
		// TODO Auto-generated method stub
		return this.numero-o.numero;
	}

	
	
	
}
