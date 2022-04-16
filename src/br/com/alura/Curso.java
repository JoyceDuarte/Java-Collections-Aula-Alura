package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	// Lista que armazena o aluno e a matricola correspondente:
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		// devolver uma cópia,ele não deixa modificar a lista, colocando uma
		// cópia defensiva- é muito importante
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		// 1°-forma de fazer isso é:
		// int tempoTotal=0;
		// for(Aula aula:aulas) {
		// tempoTotal+=aula.getTempo();
		// }
		// return tempoTotal;

		// 2° forma de fazer isso é usando o stream:

		return this.aulas.stream().mapToInt(Aula::getTempo).sum();

	}

	@Override
	public String toString() {
		return "[Curso: " + nome + "; Tempo total: " + this.getTempoTotal() + "," + "aulas:" + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		// Forma privada de adicionar o aluno:
		this.alunos.add(aluno);
		// Cria como a estrutura do Map um "excel" com relação do aluno e a matricula
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

	}

	public Set<Aluno> getAlunos() {
		// Vai criar um outro grupo que não se modifica.
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		// Retorna se um aluno x está matriculado
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		// Procura o aluno pelo número de matricula:
		return matriculaParaAluno.get(numero);
	}

}
