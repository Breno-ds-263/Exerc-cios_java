/*.As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.*/

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe seu salário: ");
		double salario = input.nextDouble();

		double aumento;
		double reajuste;

		if(salario > 0 && salario <=280){
			aumento = salario * 0.2;
			reajuste = salario + aumento;
			System.out.println("salário antes do reajuste: " + salario);
			System.out.println("percentual de aumento aplicado: 20%" );
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("novo salário, após o aumento: " + reajuste);
		}
		else if(salario > 280 && salario <700){
			aumento = salario * 0.15;
			reajuste = salario + aumento;
			System.out.println("salário antes do reajuste: " + salario);
			System.out.println("percentual de aumento aplicado: 15%" );
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("novo salário, após o aumento: " + reajuste);
		}
		else if(salario >= 700 && salario <1500){
			aumento = salario * 0.10;
			reajuste = salario + aumento;
			System.out.println("salário antes do reajuste: " + salario);
			System.out.println("percentual de aumento aplicado: 10%" );
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("novo salário, após o aumento: " + reajuste);
		}
		else if(salario >= 1500){
			aumento = salario * 0.05;
			reajuste = salario + aumento;
			System.out.println("salário antes do reajuste: " + salario);
			System.out.println("percentual de aumento aplicado: 5%" );
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("novo salário, após o aumento: " + reajuste);
		}






	}

}
