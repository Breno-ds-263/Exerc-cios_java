package projeto_jogo_da_velha;

import java.util.Scanner;

import projeto_jogo_da_velha.tabuleiro.*;


public class main {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		char jogadoratual = 'X';

		do {
			imprimirtabela(tabuleiro.tabuleiro);
			System.out.println("informe a linha: ");
			int linha = input.nextInt();

			System.out.println("informe a coluna: ");
			int coluna = input.nextInt();

			tabuleiro.tabuleiro[linha][coluna] = jogadoratual;

			if(combinacaosvitoria(jogadoratual) == true) {
				imprimirtabela(tabuleiro.tabuleiro);
				System.out.println("Vitoria do jogador %s".formatted(jogadoratual));
				break;
			}

			jogadoratual = jogadoratual ==('X') ? 'O' : 'X';


		}while(true);
		
	}

	//Função para exibir tabuleiro
	public static void imprimirtabela(char tabuleiro[][]) {
		for (int i = 0; i < 3; i++) {
			System.out.print("|" + tabuleiro[i][0] + "|" + tabuleiro[i][1]+ "|" +tabuleiro[i][2] + "|" + "\n");

		}

	}
	//Função com todas as combinações de vitoria 
	public static boolean combinacaosvitoria(char jogadoratual) {
		for (int i = 0; i < 3; i++) {
			if(tabuleiro.tabuleiro[i][0] == jogadoratual && tabuleiro.tabuleiro[i][1] == jogadoratual && tabuleiro.tabuleiro[i][2] == jogadoratual){
				return true;
			}
			if(tabuleiro.tabuleiro[0][i] == jogadoratual && tabuleiro.tabuleiro[1][i] == jogadoratual && tabuleiro.tabuleiro[2][i] == jogadoratual){
				return true;
			}
			if(tabuleiro.tabuleiro[0][0] == jogadoratual && tabuleiro.tabuleiro[1][1] == jogadoratual && tabuleiro.tabuleiro[2][2] == jogadoratual){
				return true;
			}
			if(tabuleiro.tabuleiro[0][2] == jogadoratual && tabuleiro.tabuleiro[1][1] == jogadoratual && tabuleiro.tabuleiro[2][0] == jogadoratual){
				return true;
			}
		}
		return false;

	}

}


