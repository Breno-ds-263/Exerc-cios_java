/*Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.*/

import java.util.Scanner;

public class Turno {

	public static void main(String args []) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite M-matutino ou V-Vespertino ou N- Noturno: ");
		String turno = input.nextLine();
		
		switch(turno.toUpperCase()) {	
		case "M":
			System.out.println("Bom Dia!");
			break;
		case "V":
			System.out.println("Boa tarde!");
			break;
		case "N":
			System.out.println("Boa noite!");
			break;
		default:
			System.out.println("Valor inválido");
		
		
		}
		
	}
	
}
