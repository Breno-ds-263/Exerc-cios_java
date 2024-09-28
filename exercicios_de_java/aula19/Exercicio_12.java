/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.*/

package exercicios_de_java.aula19;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []vetorA = new int [2];
		int soma = 0;

		//entrada de valores no Vetor A
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição %d".formatted(i));
			vetorA[i] = input.nextInt();
		}

		//visualização do vetor A 
		System.out.println("-------Vetor A-------");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.printf("%d ",vetorA[i]);
		}
		
		//soma dos valores do vetorA
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			soma = soma + vetorA[i];
		}
		
		System.out.println("");
		System.out.printf("A Soma de todos os elementos armazenados no vetor A é: %d", soma);
		
	}

}
