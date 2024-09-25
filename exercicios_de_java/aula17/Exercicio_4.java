/*. Supondo que a população de um país A seja da ordem de 8000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.*/

package exercicios_de_java.aula17;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		double paisA = 80000;
		double paisB = 200000;
		int anos =0;
		double taxadecrescimentoA = 0.03;
		double taxadecrescimentoB = 0.015;
		
		while(paisA < paisB){
			paisA = paisA + paisA*taxadecrescimentoA;
			paisB = paisB + paisB*taxadecrescimentoB;
			anos = anos +1;

			
			
		};
		
		System.out.println("O pais A ira ultrapassar o pais B em %d anos".formatted(anos));

	}

}
