package s103Nivell1Exercici2_2;

public class Main {
	
static int contador=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos Array
		
		Month[] meses = new Month[12];
		
		//llenamos array
		
		//en la primera posicion no hace falta comprobar por que no hay nada
		meses[0] = new Month("Enero");
		
		//con la funcion introducirEnArray solo introducimos si no esta repetido
		introducirEnArray(new Month("Febrero"), meses );
		contador+=1;
		introducirEnArray(new Month("Marzo"), meses );
		contador+=1;
		introducirEnArray(new Month("Abril"), meses );
		contador+=1;
		introducirEnArray(new Month("Mayo"), meses );
		contador+=1;
		introducirEnArray(new Month("Junio"), meses );
		contador+=1;
		introducirEnArray(new Month("Julio"), meses );
		contador+=1;
		introducirEnArray(new Month("Septiembre"), meses );
		contador+=1;
		introducirEnArray(new Month("Octubre"), meses );
		contador+=1;
		introducirEnArray(new Month("Noviembre"), meses );
		contador+=1;
		introducirEnArray(new Month("Diciembre"), meses );
		
		
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

			//a la posicio 7 insertem agost sempre que no estigui repetit
			if (i == 7) {
				aux = meses[i];
				
				boolean esta=false;
				int x=0;
				while(!esta && x<contador){
					if (meses[x].iguals(new Month("agosto"))) {
						esta=true;
					}
					x++;
				}
				if (!esta) {
					meses[i] = new Month("agosto");
				}
				
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
		}

	}
	//funcio per verificar si el mes es dins l'array
	static void introducirEnArray(Month mes,Month[] meses ) {
		Month auxiliar=mes;
		
		boolean esta=false;
		int x=0;
		while(!esta && x<contador){
			if (meses[x].iguals(auxiliar)) {
				esta=true;
			}
			x++;
		}
		if (!esta) {
			meses[x] = mes;
		}
		
	}
}
