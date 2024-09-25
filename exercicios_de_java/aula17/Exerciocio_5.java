/*. Supondo que a população de um país A seja da ordem de 8000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.*/

/*Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação.*/

package exercicios_de_java.aula17;
import java.util.Scanner;

public class Exerciocio_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double paisA;
		double paisB;
		int anos =0;
		double taxadecrescimentoA;
		double taxadecrescimentoB;
		
		System.out.println("informe o tamanho da populaçao A");
		paisA = input.nextDouble();
		System.out.println("informe o tamanho da populaçao B");
		paisB = input.nextDouble();
		System.out.println("informe a taca de crescimento do pais A");
		taxadecrescimentoA = input.nextDouble();
		System.out.println("informe a taca de crescimento do pais B");
		taxadecrescimentoB = input.nextDouble();
		
		while(paisA < paisB){
			paisA = paisA + paisA*taxadecrescimentoA;
			paisB = paisB + paisB*taxadecrescimentoB;
			anos = anos +1;
			};
		
		System.out.println("O pais A ira ultrapassar o pais B em %d anos".formatted(anos));

	}

}
