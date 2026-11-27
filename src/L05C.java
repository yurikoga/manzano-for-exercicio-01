/**c) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100). */
public class L05C {
	public static void main(String[] args) {
		int acumuladora=0;
		for(int indice=1;indice<=100;indice++){
			acumuladora+=indice;
			System.out.printf("indice: %d | acumulado: %d%n",indice,acumuladora);
		}
	}
}
