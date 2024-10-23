package exercicios_de_java.aula25a27;

public class teste {

	public static void main(String[] args) {
		double[][] notas = {
	            {8.5, 6.0, 7.5, 9.0},
	            {5.0, 10.0, 3.5, 4.5},
	            {9.0, 2.5, 6.0, 8.0}
	        };
		
		
		for (int i = 0; i < notas.length; i++) {
			double soma = 0;
			for (int j = 0; j < notas[i].length; j++) {
				soma = soma + notas[i][j];
			}
			double media = soma/notas[i].length;
			System.out.println(media);
			}
	}
}


