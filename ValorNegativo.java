import java.util.Scanner;

public class ValorNegativo {
	// Escreva um programa que leia um número do usuário e imprima se ele é
	// positivo, negativo ou zero.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Entrada do valor
		System.out.println("insira um número");
		int num = input.nextInt();

		// Logica para saber se o numero é negativo ou positio
		if (num < 0) {
			System.out.println("Esse número é negativo");
		}

		else if (num > 0) {
			System.out.println("Esse número é positivo");
		} else {
			System.out.println("Esse número é igual a zero");

		}

	}

}
