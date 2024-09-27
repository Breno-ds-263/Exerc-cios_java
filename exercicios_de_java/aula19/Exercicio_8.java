/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a multiplicação dos
respectivos elementos em A e B, ou seja:
C[i] = A[i] * B[i].*/

package exercicios_de_java.aula19;

public class Exercicio_8 {

	public static void main(String[] args) {
		int vetorA []= {1,2,3,4,5,6,7,8,9,10};
		int vetorB []= {1,2,3,4,5,6,7,8,9,10};
		
		int vetorC [] = new int [vetorA.length];
		
		for(int i = 0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("vetor A:  posição = %d, valor = %d".formatted(i+1, vetorA[i] ));
		}
		for(int i = 0; i<vetorB.length; i++) {
			System.out.println("vetor B:  posição = %d, valor = %d".formatted(i+1, vetorB[i] ));
		}
		for(int i = 0; i<vetorC.length; i++) {
			System.out.println("vetor C:  posição = %d, valor = %d".formatted(i+1, vetorC[i] ));
		}

	}

	}


