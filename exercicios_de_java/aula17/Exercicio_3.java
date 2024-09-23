/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/
package exercicios_de_java.aula17;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
	    String nome;
	    int idade;
	    double salario;
	    char sexo;
	    char estadocivil;
	   
		
		boolean dadosvalidos = true;
		
		while(dadosvalidos) {
			Scanner input = new Scanner(System.in);
			System.out.println("informe seu nome: ");
			nome = input.nextLine();;
			System.out.println("informe sua idade: ");
			idade = input.nextInt();
			System.out.println("informe seu salario: ");
			salario = input.nextDouble();
			System.out.println("informe seu sexo 'f' ou 'm': ");
			sexo = input.next().charAt(0);
			System.out.println("informe seu Estado civil 's', 'c', 'v', 'd':  ");
			estadocivil = input.next().charAt(0);
			
		if(nome.toUpperCase().length() > 3 && idade > 0 && idade <=150 && salario > 0 && (sexo == 'f' || sexo =='m') && (estadocivil == 's' || estadocivil == 'c'|| estadocivil == 'v' || estadocivil == 'd')){
			System.out.println("Informações validas");
			dadosvalidos = false;} else {
			System.out.println("informe os dados novamente");
			}
		}



	}

}
