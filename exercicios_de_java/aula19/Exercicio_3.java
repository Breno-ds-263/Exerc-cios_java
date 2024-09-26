/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].*/
package exercicios_de_java.aula19;

public class Exercicio_3 {

	public static void main(String[] args) {
		
			int vetorA [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
			int vetorB []= new int [vetorA.length]; 
			
			for(int i = 0; i < vetorA.length; i++){
				//System.out.println(" valor na posição %d é %d".formatted(i+1, vetorA[i]));
				
				vetorB[i] = vetorA[i] * vetorA[i];
				}
			
			for(int i = 0; i < vetorB.length; i++){
				System.out.println(" Vetor B: valor na posição %d é %d".formatted(i+1, vetorB[i]));
				
				}

	}

}
