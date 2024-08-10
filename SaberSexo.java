import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/

public class SaberSexo {

	public static void main(String[] args) {
		
		//Entrada do valor
		Scanner input = new Scanner(System.in);
		
		System.out.println("escrever: F - Feminino, M - Masculino: ");
		String nome = input.nextLine();
		
		// logica para verificar se o valor é F ou M
		switch(nome){
		case "F":
			System.out.println("Feminino"); break;
		case "M":
			System.out.println("Masculino"); break;
		default:
			System.out.println("Sexo inválido"); 
			
			
		}
		
		
		
		

	}

}
