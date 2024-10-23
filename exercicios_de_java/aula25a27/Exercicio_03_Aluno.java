/*Escreva	uma	class	para	representar	um	Aluno.	Adicione	atributos	
relacionados	às	caracteristicas	de	um	Aluno,	como	nome,	matricula,	curso	
que	está	matriculado,	nome	de	3	disciplinas	que	está	cursando e	as	notas	
dessas 3 disciplinas. Desenvolva	um	método	para	verificar	se	o	aluno	está	
aprovado	(nota	maior	ou	igual	a	7)	em	uma determinada	disciplina.
Escreva	um	programa	para	testar	essa	classe,	que	pede	as	informações	do	
aluno	ao	usuário	e	ao	final	informa	o	nome	das	disciplinas,	mostra as	
notas e	mostra	se	o	aluno	foi	aprovado	ou	não.*/

package exercicios_de_java.aula25a27;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio_03_Aluno {
	String nome;
	int matricula;
	String curso;
	String disciplinas[] = new String [3];
	double notas[][] = new double [3][3];
	
	
	
	
	void verificarAprovacao() {
		double soma = 0;
		double media =0;
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j+1 < notas[i].length; j++) {
				soma = soma + notas[i][j];
			}
			}
		media = soma/3;
		}
	
	
	void insirirDisciplinas() {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("insira a disciplina %d".formatted(i+1));
			disciplinas[i] = input.next();
			}
	}
	
	void mostrarDisciplinas() {
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println();
			System.out.println("disciplina %d: %s".formatted(i+1, disciplinas[i]));
			
		}
	}
	
	void insirirNotas() {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j+1 < notas[i].length; j++) {
				System.out.println("insira a nota %d da disciplina %s".formatted(j+1,disciplinas[i]));
				notas[i][j] = input.nextDouble();
				
			}
			
		}
	}
	void mostrarNotas() {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
			
			System.out.printf(notas[i][j] + "\t");
			
			}
			System.out.println();
			
		}
	}
	

}
