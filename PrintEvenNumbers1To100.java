// Escreva um programa que imprima todos os números pares de 1 a 100
public class PrintEvenNumbers1To100 {

	public static void main(String[] args) {
		int contador = 0;

		while (true) {

			if (contador % 2 == 0) {
				System.out.println(contador);
			}
			contador++;
			if (contador > 100) {
				break;
			}
		}

	}

}
