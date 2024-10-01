/*. Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares*/

package exercicios_de_java.aula20;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int matriz [][] = new int[3][3];
       
       for (int i = 0; i < matriz.length; i++) {
    	   for (int j = 0; j < matriz[i].length; j++) {
    		   System.out.printf("insira o valor na posição [%d][%d]: ", i, j );
    		   System.out.println();
    		   matriz[i][j] = input.nextInt();
			
		}	
	}
       
       System.out.println("---------Matriz----------");
       mostrarMatriz(matriz);
       
       
       System.out.println();
       System.out.println("Valores pares da matriz");
       for (int i = 0; i < matriz.length; i++) {
    	   for (int j = 0; j < matriz[i].length; j++) {
    		   if(matriz[i][j] % 2 ==0) {
    			   System.out.printf(matriz[i][j] + "\t");
    		   }
			
		}
		
	}
       System.out.println();
       System.out.println("Valores impares da matriz");
       for (int i = 0; i < matriz.length; i++) {
    	   for (int j = 0; j < matriz[i].length; j++) {
    		   if(matriz[i][j] % 2 != 0) {
    			   System.out.printf(matriz[i][j] + "\t");
    		   }
			
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

}
