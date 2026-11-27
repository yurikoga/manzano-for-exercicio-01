
/**a) Apresentar os quadrados dos números inteiros de 15 a 200. */
public class L05A {
	public static void main(String[] args) {
		int resultado;
		for(int indice=0;indice<=200;indice++){
			resultado=indice*indice;
			System.out.printf("%d²= %,d%n",indice,resultado);
		}
	}
}
