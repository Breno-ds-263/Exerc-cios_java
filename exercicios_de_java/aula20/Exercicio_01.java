/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).*/

package exercicios_de_java.aula20;

import java.util.Iterator;
import java.util.Random;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		int [][] matriz = new int [4][4];
		
		preencherMatriz(matriz);
		
		System.out.println("------matriz A-------");
		mostrarMatriz(matriz);
		
		 encontrarMaiorNumero(matriz);	

	}
	
	public static void  preencherMatriz(int Matriz[][]) {
		Random radom = new Random();
		
		for(int i = 0; i< Matriz.length; i++) {
		   for(int j = 0; j<Matriz[i].length;j++) {
			   Matriz[i][j] = radom.nextInt(9);
			   
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
	
	public static void  encontrarMaiorNumero( int [][] matriz) {
		int maiorNumero = 0;
		int linha= 0;
		int coluna = 0;
		
		for(int i = 0; i < matriz.length; i++ ) {
			for(int j = 0; j <matriz[i].length; j++) {
				if(maiorNumero < matriz[i][j]) {
					maiorNumero = matriz[i][j];
					linha = i;
					coluna =j;
					
				}
				
			}
			
		}
		System.out.printf("maior número do vetor = %d, coluna = %d, linha = %d", maiorNumero, linha,coluna);
	}

}
