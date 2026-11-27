/**i)
 Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de
 Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza
 pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo
 valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo
 é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc. */
public class L05I {
	public static void main(String[] args) {
		int atual=1,anterior=0,resultado, termo=15;
		for(int indice=0;indice<termo;indice++){
			if (indice<termo-1){
				System.out.printf("%,d , ",atual);
			}else{
				System.out.printf("%,d.",atual);
			}
			resultado=atual+anterior;
			anterior=atual;
			atual=resultado;
		}
	}
}
