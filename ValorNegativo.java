import java.util.Scanner;
public class ValorNegativo {
	//Escreva um programa que leia um número do usuário e imprima se ele é positivo, negativo ou zero.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira um número");
		int num = input.nextInt();
		
		if(num < 0){
			System.out.println("Esse número é impar");
			}
		
		else {
			System.out.println("Esse número é par");
		}
		
		
		

	}

}
