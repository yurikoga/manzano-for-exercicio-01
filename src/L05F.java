/**f)
 Apresentar todos os números divisíveis por 4 que sejam menores que 200. Para verificar se o
 número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a
 instrução <u>se</u>, perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o
 próximo passo. A variável que controlará o contador deve ser iniciada com o valor 1. */
public class L05F {
	public static void main(String[] args) {
		int contadora=1,divisao;
		for (int indice=1;indice<200;indice++){
			//verifica se NÃO é divisível por 4
			if(indice%4!=0){
				continue;
			}
			divisao=indice/4;
			System.out.printf("%d° número dívisivel por 4 é: %d, se resultado é: %d%n",contadora,indice,divisao);
			contadora++;
		}
	}
}
