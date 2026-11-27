/**g) Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
 considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
 neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).*/
public class L05G {
	public static void main(String[] args) {
		int base=3;
		int potencia=1;
		for (int indice=0;indice<=15;indice++){
			System.out.printf("%d^%d = %,d%n",base,indice,potencia);
			potencia*=base;
		}
	}
}
