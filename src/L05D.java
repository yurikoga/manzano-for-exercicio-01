/**d) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
 1 até 500. */
public class L05D {
	public static void main(String[] args) {
		int somatorio=0;
		for(int indice=1;indice<=500;indice++){
			if(indice%2==0){
				System.out.printf("número somado: %d | somatorio: %d%n",indice,somatorio+=indice);
			}
		}
	}
}
