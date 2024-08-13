/*Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.*/

import java.util.Scanner;

public class ProdutoMaisBarato {

	public static void main(String[] args) {
		// Entrada de valores
		Scanner input = new Scanner(System.in);

		System.out.println("insira o Preço do primeiro produto");
		double num1 = input.nextDouble();

		System.out.println("insira o Preço do seguinte produto ");
		double num2 = input.nextDouble();

		System.out.println("insira o Preço do terceiro produto");
		double num3 = input.nextDouble();
		
		// logica para saber qual produto é o mais barato
		
		double listacompra [] = {num1, num2, num3};
		
		double maisbarato = listacompra[0];
		
		for(int i = 0; i < listacompra.length; i++){
			if(listacompra[i] < maisbarato){
				maisbarato = listacompra[i];
			}
		}
		
		System.out.println("O produto mais barato é: " + maisbarato);
		

	}

}
