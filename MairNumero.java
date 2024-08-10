import java.util.Scanner;

//1. Faça um Programa que peça dois números e imprima o maior deles.
public class MairNumero {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Entrada dos valores
		System.out.println("insira o primeiro número");
		double num1 = input.nextDouble();

		System.out.println("insira o segundo número");
		double num2 = input.nextDouble();

		// Logica para descobrir qual é o maior
		if (num1 > num2) {
			System.out.println(num1 + " é maior que " + num2);
			
		}else {
			System.out.println(num2 + " é maior que " + num1);

		}
	}

}
