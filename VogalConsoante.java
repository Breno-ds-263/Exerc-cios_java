import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.*/

public class VogalConsoante {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Entrada do valor
		System.out.println("insira a letra a baixo: ");
		
		String letra = input.nextLine();
		
		// verificar se a entrada é valida
		if(letra.length() != 1){
			System.out.println("Por favor, inserir uma unica letra valída");
		}else {
		
		//logica para verificar se uma letra é vogal ou consoante
		
		switch(letra.toLowerCase()){
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("Essa letra é vogal"); break;
		default:
			System.out.println("Essa letra é consoante");
		
		
		}
		}

	}

}
