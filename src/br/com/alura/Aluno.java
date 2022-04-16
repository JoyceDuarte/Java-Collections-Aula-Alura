package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
	    if (nome == null) {
	        throw new NullPointerException("Nome não pode ser nulo");
	    }
	    this.nome = nome;
	    this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	
	@Override
	public int hashCode(){
		//Se escrevo equals usando a lista Set tenho que usar o
		//hashCode se quero que ele compare dois objetos(no caso palavras):
	    return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
		// Set não garante sequencia de ordem:
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
	    Aluno outroAluno = (Aluno) obj;
	    return this.nome.equals(outroAluno.nome);
	}
   
}
