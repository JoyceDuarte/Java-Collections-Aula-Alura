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
		alunos.add("F�bio");
		alunos.add("Marta");
		alunos.add("Yara");
		alunos.add("B�rbara");

		// para acessar um elemento usa :
		// for (String aluno : alunos) {
		// System.out.println(aluno);
		// }

		// Outra forma de acessar o elemento � usar o forEch

		// alunos.forEach(aluno -> {
		// System.out.println(aluno);
		// });

		// Quantidade de alunos;
		System.out.println(alunos.size());

		// M�todo para saber se um elemento est� na lista:
		boolean annaEstaMatriculado = alunos.contains("Anna");
		//Quando quero remover um item:
		//alunos.remove("Yara");
		System.out.println(annaEstaMatriculado);

		System.out.println(alunos);

		//Para buscar um elemento em uma posi��o x, fa�o:
		List<String> alunosEmLista = new ArrayList<>(alunos);
	
		
		
	}

}
