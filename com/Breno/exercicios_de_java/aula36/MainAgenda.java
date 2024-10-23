package com.Breno.exercicios_de_java.aula36;

import java.util.Iterator;
import java.util.Scanner;

public class MainAgenda {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		Scanner input = new Scanner(System.in);
		
		System.out.print("insira o nome da Agenda: ");
	    String nomeagenda = input.nextLine();
		agenda.setNome(nomeagenda);
		
		System.out.println("insira os contatos:");
		
		Contato contatos = new Contato();
		
		System.out.println();
		
		
		
		
		

		
		

	}

}
