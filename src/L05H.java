import java.util.Scanner;
/**h) Elaborar um programa que apresente como resultado o valor de uma potência de uma base
 qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor
 do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
 portuguol (^). */
public class L05H {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]valores=new int[3];
		System.out.print("Digite o valor da base:");
		valores[0]= sc.nextInt();
		System.out.print("Digite o valor do expoente:");
		valores[1]= sc.nextInt();
		//potência
		valores[2]=1;
		for(int indice=0;indice<valores[1];indice++){
//			System.out.println(valores[2]*=valores[0]);
			valores[2]*=valores[0];
		}
		System.out.printf("\tO resultado da exponenciação é: %,d",valores[2]);

	}
}
