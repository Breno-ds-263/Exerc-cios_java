/*. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]). */
package exercicios_de_java.aula19;

public class Exercicio_4 {

	public static void main(String[] args) {
		int vetorA [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		double vetorB []= new double [vetorA.length]; 
		
		for(int i = 0; i < vetorA.length; i++){
			//System.out.println(" valor na posição %d é %d".formatted(i+1, vetorA[i]));
			
			vetorB[i] = Math.sqrt(vetorA[i]);
			}
		
		for(int i = 0; i < vetorB.length; i++){
			System.out.println(" Vetor B: valor na posição %d é %.2f".formatted(i+1, vetorB[i]));
			
			}
	}

}
