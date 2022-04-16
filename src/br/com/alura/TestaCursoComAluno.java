package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es do java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		Aluno a1 = new Aluno("Luana", 3456);
		Aluno a2 = new Aluno("Frabr�cio", 4896);
		Aluno a3 = new Aluno("Pedro", 7245);

		// Matricular os alunos-tenho que implementar o m�todo na Classe Curso
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println("O aluno" + a1 + "�st� matriculado? ");
		// Quero saber se est� matriculado o aluno 1;
		System.out.println(javaColecoes.estaMatriculado(a1));

		// Para procurar o nome do aluno:
		Aluno luana = new Aluno("Luana", 3456);
		System.out.println("E esse Luana, est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(luana));

	}

}
