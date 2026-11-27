/**k) Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares
 situados na faixa numérica de 1 a 10. */
public class L05K {
	public static void main(String[] args) {
		for(int indiceA=1;indiceA<=10;indiceA++){
			int valor=1;
			if(indiceA%2==1){
				for (int indiceB=1;indiceB<=indiceA;indiceB++){
					valor*=indiceB;
				}
				System.out.printf("O fatorial de %d é: %,d%n",indiceA,valor);
			}
		}
	}
}
