/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.*/

package exercicios_de_java.aula19;

public class Exercicio_2 {

	public static void main(String[] args) {
		
			int vetorA [] = {1,2,3,4,5,6,7,8};
			int vetorB []= new int [vetorA.length]; 
			
			for(int i = 0; i < vetorA.length; i++){
				//System.out.println(" valor na posição %d é %d".formatted(i+1, vetorA[i]));
				
				vetorB[i] = vetorA[i] * 2;
				}
			
			for(int i = 0; i < vetorB.length; i++){
				System.out.println("vetor B valor na posição %d é %d".formatted(i+1, vetorB[i]));
				
				}
		
	}

}
