import java.util.Scanner;
/**b) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer. */
public class L05B {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int valor=0;
		System.out.println("Digite o valor base da tabuada:");
		valor=sc.nextInt();
		for(byte indice=1;indice<=10;indice++){
			System.out.printf("%d * %d = %d%n",valor,indice,valor*indice);
		}
	}
}
