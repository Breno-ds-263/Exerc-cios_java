package exercicios_de_java.aula34;

import java.util.Iterator;

public class Calculadora {

	public static void soma(double A, double B) {

		double soma = A+B;
		System.out.println(soma);
	}

	public static void sub(double A, double B) {

		if (A> B) {
			double sub = A - B;
			System.out.println(sub);
		}else {

			double sub = B - A;
			System.out.println(sub);}
	}

	public static void multi(double A, double B) {

		double multi = A*B;
		System.out.println(multi);
	}

	public static void divi(double A, double B) {
		if(B == 0) {
			System.out.println("divisão por zero impossivel!");
		}else {
			double divi= A/B;
			System.out.println(divi);
		}
	}
	
	public static void poten(double A, double B) { 
		double potencia = 0;
		for(int i = 0; i<B; i++) {
			potencia = A * A;
		}
		
		System.out.println(potencia);
	}
	
	public static void fatorial(int A) {
		int fato = 1;
		
		for (int i = 1; i <= A; i++) {
			
			fato = fato * i;
			
		}
		
		System.out.println("Fatorial de %d é %d".formatted(A, fato));
	}
	
	

}
