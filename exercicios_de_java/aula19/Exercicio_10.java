/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2.*/

package exercicios_de_java.aula19;

public class Exercicio_10 {

	public static void main(String[] args) {
		int vetorA []= {1,2,3,4,5,6,7,8,9,10};
		int vetorB []= new int [vetorA.length];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorB[i] = vetorA[i] % 2;
		}
		
		for(int i = 0; i < vetorB.length; i++) {
            System.out.println("vetor B: posição = %d, valor = %d".formatted(i+1, vetorB[i]));
        }
	}

}
