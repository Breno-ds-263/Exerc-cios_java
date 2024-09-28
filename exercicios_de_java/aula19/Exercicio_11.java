/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.*/

package exercicios_de_java.aula19;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []vetorA = new int [10];

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

		//visualização dos valores pares do vetor A
		System.out.println();
		System.out.println("valores pares do vetor A");
		
		for(int i = 0; i < vetorA.length; i++) {
			
			if(vetorA[i] % 2 == 0) {
				System.out.printf("%d ",vetorA[i]);
			}
		}


	}

}
