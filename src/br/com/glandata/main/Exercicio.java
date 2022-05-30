package br.com.glandata.main;

import br.com.glandata.model.Aluno;

public class Exercicio {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Epaminondas";
		float notaFinal = aluno1.calcularMedia(5.75f, 6.75f, 2.25f);
		String situacao = aluno1.validarSituacao(notaFinal) ? "Aprovado!" : "Reprovado!";

		System.out.println("A nota final do aluno " + aluno1.nome + " é: " + notaFinal + " Status: " + situacao);
	}

}
