/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/
package exercicios_de_java.aula17;

import java.util.Scanner;


public class Exercicio_1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		while(true){
			System.out.println("informe um número de 0 a 10: ");
            int numero = input.nextInt();
            
            if(numero >= 0 && numero <= 10){
            	System.out.println("Valor entre 0 e 10!");
            	break;
            }else {
            	System.out.println("Valor inválido, tente novamente!");
            }
		}
	}
	

}
