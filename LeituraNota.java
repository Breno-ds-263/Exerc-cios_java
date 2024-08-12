/*. Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez.*/

import java.util.Scanner;

public class LeituraNota {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Entrada dos valores
		System.out.println("informe a primeria nota abaixo:");

		double nota1 = input.nextDouble();

		System.out.println("informe a segunda nota abaixo:");

		double nota2 = input.nextDouble();

		// logica para saber a média do aluno
		double media = (nota1 + nota2) / 2;

		// logica para informar se o aluno ira ser reprovado ou aprovado
		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}

}
