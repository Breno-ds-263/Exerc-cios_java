/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo elemento de A multiplicado por sua posição (ou
índice), ou seja:
B[i] = A[i] * i.*/

package exercicios_de_java.aula19;

public class Exercicio_5 {

	public static void main(String[] args) {
		int vetorA [] = {1,2,3,4,5,6,7,8,9,10};
		int vetorB []= new int [vetorA.length]; 
		
		for(int i = 0; i < vetorA.length; i++){
			//System.out.println(" valor na posição %d é %d".formatted(i+1, vetorA[i]));
			
			vetorB[i] = vetorA[i]*i;
			}
		
		for(int i = 0; i < vetorB.length; i++){
			System.out.println(" Vetor B: valor na posição %d é %d".formatted(i+1, vetorB[i]));
			
		}
	}

}
