import java.util.Scanner;
public class MaiorIdade {
	//escreva um programa que leia a idade de uma pessoa e diga se ela pode votar (idade >= 18).

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe sua idade abaixo: ");
		int idade = input.nextInt();
		
		if(idade < 18){
			System.out.println("Você não pode votar por ser menor de 18 anos");
		}
		else {
			System.out.println("Você pode votar");
			}
		
	}

}
