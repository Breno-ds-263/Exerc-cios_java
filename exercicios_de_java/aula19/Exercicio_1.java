/*Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].*/

package exercicios_de_java.aula19;

public class Exercicio_1 {

	public static void main(String[] args) {
		int vetorA [] = {1,2,3,4,5};
		int vetorB []= new int [5]; 
		
		for(int i = 0; i < vetorA.length; i++){
			//System.out.println(" valor na posição %d é %d".formatted(i+1, vetorA[i]));
			
			vetorB[i] = vetorA[i];
			}
		
		for(int i = 0; i < vetorB.length; i++){
			System.out.println("vetor B valor na posição %d é %d".formatted(i+1, vetorB[i]));
			
			}
		
	}

}
