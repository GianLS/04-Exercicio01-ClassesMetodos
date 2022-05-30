package br.com.glandata.model;

public class Aluno {
	public String nome;
	
	public float calcularMedia(float nota1, float nota2, float nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}

	public boolean validarSituacao(float notaFinal) {
		return notaFinal >= 5;
	}
}
