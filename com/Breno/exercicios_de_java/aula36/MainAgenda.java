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
		
		Contato contato1 = new Contato();
		Contato contato2 = new Contato();
		Contato contato3 = new Contato();
		
		Contato []contatos = {contato1,contato2,contato3};
		
		agenda.setContato(contatos);
		
		agenda.inserirContatos();
		
		agenda.exibirTodosContato();
		
		System.out.println();
		
		
		
		
		

		
		

	}

}
