/*Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.*/

package exercicios_de_java.aula20;

import java.util.Random;

public class Exercicio_02 {

	public static void main(String[] args) {
		int [][] matriz = new int [10][10];

		preencherMatriz(matriz);
		
		System.out.println("-------------------------------matriz-------------------------------");
		mostrarMatriz(matriz);
		
		int maiorNumero = encontrarMaiorNumero(matriz);
		
		System.out.println();
		System.out.println(maiorNumero);
		

	}
	
	public static void  preencherMatriz(int Matriz[][]) {
		Random radom = new Random();
		
		for(int i = 0; i< Matriz.length; i++) {
		   for(int j = 0; j<Matriz[i].length;j++) {
			   Matriz[i][j] = radom.nextInt(100);
			   
		   }
			}
		
	}
	
	public static void mostrarMatriz(int [] [] matriz) {
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+ "\t");
				
			}
			System.out.println();
		}
	}
	
	public static int encontrarMaiorNumero( int [][] matriz) {
		int maiorNumeroLInha7 = 0;
		
		
			for(int j = 0; j <matriz[7].length; j++) {
				if(maiorNumeroLInha7 < matriz[7][j]) {
					maiorNumeroLInha7 = matriz[7][j];
					
				}
				
			}
		
		return maiorNumeroLInha7;
	}

}
