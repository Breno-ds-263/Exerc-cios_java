package com.Breno.exercicios_de_java.aula28a33;

import java.util.Scanner;

public class AlunoMain {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Aluno aluno = new Aluno();
	
	System.out.println("informe o nome do aluno: ");
	String nome = input.next();
	aluno.setNome(nome);

	
	System.out.println("informe a matricula do aluno: ");
	String matricula = input.next();
	aluno.setMatricula(matricula);

	
	System.out.println("informe o curso do aluno: ");
	String curso = input.next();
	aluno.setCurso(curso);
	
	System.out.println("informe as disciplinas: ");
	String [] disciplinas = new String [3]; 
	for (int i = 0; i < disciplinas.length; i++) {
		System.out.printf("Insira o a disciplina %d: ", i+1);
		disciplinas[i] = input.next();
		}
	aluno.setDisciplinas(disciplinas);
	
	
	
	aluno.getNome();
	aluno.getCurso();
	aluno.getMatricula();
	
	for (int i = 0; i < aluno.getDisciplinas().length; i++) {
		System.out.printf("disciplina %d: %s",i+1, aluno.getDisciplinas()[i] );
		System.out.println();
		}
	
	
	}

}
