import java.util.Scanner;

public class OperacoesMatematicas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe o primerio valor");
		double num = input.nextDouble();
		
		System.out.println("informe o segundo valor");
		double num2 = input.nextDouble();
		
		soma(num, num2);
		
		subtracao(num, num2);
		
		multiplicacao(num, num2);
		
		divisao(num, num2);

	}

	public static void soma(double a, double b) {
		double soma = a + b;

		System.out.println("soma dos valores: " + soma);
	}
	
	public static void subtracao(double a, double b) {
		double sub = a - b;

		System.out.println("A subtração dos valores: " + sub);
	}
	public static void multiplicacao(double a, double b) {
		double multi = a * b;

		System.out.println("A multeplicação dos valores: " + multi);
	}
	public static void divisao(double a, double b) {
		double divisao = a/b;

		System.out.println("A divisão dos valores: " + divisao);
	}

}
