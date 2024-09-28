/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5*/

package exercicios_de_java.aula19;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []vetorA = new int [10];
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

		//soma dos valores multiplos de 5 do vetorA
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 5 == 0) {
				soma = soma + vetorA[i];
			}
			
		}
		
		System.out.printf("Soma dos valores multiplos de 5 do vetor A = %d ",soma);
	}

}
