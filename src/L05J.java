/**j)
 Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de
 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O
 programa deve apresentar os valores das duas temperaturas. A fórmula de conversão
 é <b><u>F = (9C+160)/5</u></b>, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/
public class L05J {
	public static void main(String[] args) {
		for (int indice=10;indice<=100;indice+=10){
			System.out.printf("%d graus Celsius = %.2f graus Fahrenheit%n",indice,cauculoTemperatura(indice));
		}
	}
	public static double cauculoTemperatura(int valorCelc){
		return (9*valorCelc+160)/5f;
	}
}
