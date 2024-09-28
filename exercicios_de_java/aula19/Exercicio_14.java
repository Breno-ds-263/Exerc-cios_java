/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.*/

package exercicios_de_java.aula19;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []vetorA = new int [10];
		int soma = 0;
		int media =0;
		int cont =0;

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
		
		//soma dos valores impares do vetor A
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0 ){
			soma = soma + vetorA[i];
			cont++;
			}
		}
		media = soma/cont;
		System.out.printf("Soma dos valores impares do vetor A = %d ",soma);
		System.out.println("");
		System.out.printf("média Imapares dos valores impares do vetor A = %d ",media);

	}

}
