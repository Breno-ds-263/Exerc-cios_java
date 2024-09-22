/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/
package exercicios_de_java.aula17;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		String senha;
		
		while(true) {
			System.out.println("Insira um nome");
			nome = input.nextLine().trim();
			System.out.println("Insira uma senha");
			senha = input.nextLine().trim();
			
			if(senha.toUpperCase().equals(nome.toUpperCase())){
				System.out.println("Erro!, insira uma senha diferente do nome");
			}else {
				System.out.println("Senha aceita!");
				break;
			}
			
		}
		

	}

}
