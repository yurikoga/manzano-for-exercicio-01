
/**e) Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar
 se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução <u>se</u>
 , perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo. */
public class L05E {
	public static void main(String[] args) {
		byte contadora=1;
		for(byte indice=0;indice<=20;indice++){
			if(indice%2==0){
				continue;
			}
			System.out.printf("%d° número ímpar é: %d%n",contadora,indice);
			contadora++;
		}
	}
}
