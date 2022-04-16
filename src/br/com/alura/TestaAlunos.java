package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo");
		alunos.add("Anna");
		alunos.add("Fábio");
		alunos.add("Marta");
		alunos.add("Yara");
		alunos.add("Bárbara");

		// para acessar um elemento usa :
		// for (String aluno : alunos) {
		// System.out.println(aluno);
		// }

		// Outra forma de acessar o elemento é usar o forEch

		// alunos.forEach(aluno -> {
		// System.out.println(aluno);
		// });

		// Quantidade de alunos;
		System.out.println(alunos.size());

		// Método para saber se um elemento está na lista:
		boolean annaEstaMatriculado = alunos.contains("Anna");
		//Quando quero remover um item:
		//alunos.remove("Yara");
		System.out.println(annaEstaMatriculado);

		System.out.println(alunos);

		//Para buscar um elemento em uma posição x, faço:
		List<String> alunosEmLista = new ArrayList<>(alunos);
	
		
		
	}

}
