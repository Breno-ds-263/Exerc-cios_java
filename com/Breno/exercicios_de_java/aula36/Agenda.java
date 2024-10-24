package com.Breno.exercicios_de_java.aula36;

import java.util.Scanner;

public class Agenda {
	private String nome;
	private Contato[] contato;
	
	
	public Agenda() {}
	
	public Agenda(String nome, Contato[] contato) {
		super();
		this.nome = nome;
		this.contato = contato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContato() {
		return contato;
	}
	public void setContato(Contato[] contato) {
		this.contato = contato;
	}
	
	public String exibirContato(String nome){
		for (int i = 0; i < contato.length; i++) {
			if (contato[i].getNome().equals(nome)) {
				return "\n nome: %s \n telefone: %s \n email: %s ".formatted(contato[i].getNome(),contato[i].getTelefone(), contato[i].getEmail());
				}
			}
		return "Contato não encontrado";
	}
	
	public void exibirTodosContato(){
		for (int i = 0; i < contato.length; i++) {
			System.out.printf("\n nome: %s \n telefone: %s \n email: %s ", contato[i].getNome(),contato[i].getTelefone(), contato[i].getEmail());
			System.out.println();
		}
	}
	
	public void inserirContatos() {
		
		Scanner input = new Scanner(System.in);
		
		
		for (int i = 0; i < contato.length; i++) {
			System.out.println("Insira o contato %d ".formatted( i+1));
			
			System.out.print("insira o nome: ");
			String nome = input.nextLine();
			contato[i].setNome(nome);
			
			System.out.print("insira o Telefone: ");
			String telefone = input.nextLine();
			contato[i].setTelefone(telefone);
			
			System.out.print("insira o email: ");
			String email = input.nextLine();
			contato[i].setEmail(email);
			
		}
	}
	
	
	

}
