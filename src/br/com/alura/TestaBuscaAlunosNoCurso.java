package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Luana");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Luana", 3456);
		Aluno a2 = new Aluno("Frabrício", 4896);
		Aluno a3 = new Aluno("Pedro", 7245);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com a matricula 3456?");
		Aluno aluno = javaColecoes.buscaMatriculado(3456);
		System.out.println("Aluno: "+aluno);

	}

}
