package com.Breno.exercicios_de_java.aula28a33;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	private String []disciplinas = new String[3];
	private double [][] notas = new double[3][3];
	
	
	public Aluno() {}
	
	
	public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][]notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	public double[][] getNotas() {
		return notas;
	}
	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
	
	
	// Método para calcular a média de uma disciplina específica
    private double calcularMediaDisciplina(int indiceDisciplina) {
        double soma = 0;
        int quantidadeDeNotas = notas[indiceDisciplina].length;

        for (int i = 0; i < quantidadeDeNotas; i++) {
            soma += notas[indiceDisciplina][i];
        }

        return soma / quantidadeDeNotas;
    }

    // Método para verificar aprovação por disciplina
    public void verificarAprovacao() {
        for (int i = 0; i < disciplinas.length; i++) {
            double media = calcularMediaDisciplina(i);
            System.out.println("Disciplina: " + disciplinas[i]);
            if (media >= 7) {
                System.out.println("Aprovado com média: " + media);
            } else {
                System.out.println("Reprovado com média: " + media);
            }
        }
    }

		
	}
	

