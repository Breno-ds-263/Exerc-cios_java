/*Faça um Programa que leia três números e mostre o maior e o menor deles*/

import java.util.Scanner;
public class MairMenorNumero {

	public static void main(String[] args) {
		
		//Entrada de valores 
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira o primeiro número");
		double num1 = input.nextDouble();
		
		System.out.println("insira o segundo número");
		double num2 = input.nextDouble();
		
		System.out.println("insira o terceiro número");
		double num3 = input.nextDouble();
		
		// logica para saber qual é o maior e qual é o menor
		
		double vetor[] = {num1, num2, num3};
		
		double maior = vetor[0];
		double menor = vetor[0];

		
		
		for(int i = 0; i< vetor.length; i++){
			if(vetor[i] > maior){
				maior = vetor[i];
			}
			if(vetor[i] < menor){
				menor = vetor[i];
			}
		}
		
		//Saida dos valores
		System.out.println("o Mair número: " + maior);
		System.out.println("O menor número: " + menor);



	}

	
}
