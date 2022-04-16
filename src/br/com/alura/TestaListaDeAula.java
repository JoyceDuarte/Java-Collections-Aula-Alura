package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		  Aula a1 = new Aula("Revistando as ArrayLists", 21);
	        Aula a2 = new Aula("Listas de objetos", 20);
	        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

	        ArrayList<Aula> aulas = new ArrayList<>();
	        aulas.add(a1);
	        aulas.add(a2);
	        aulas.add(a3);

	        System.out.println(aulas);
	        
	        //Ordenando listas-
	        Collections.sort(aulas);
	        
	        System.out.println(aulas);
	        
	        //Recebe um comparador de dois parametros, comparando com o tempo das aulas
	        Collections.sort(aulas,Comparator.comparing(Aula::getTempo));
	        //Outra forma de fazer a mesma coisa, comparar por tempo é :
	        //aulas.sort(Comparator.comparing(Aula::getTempo));
	        
	        System.out.println(aulas);

	}

}
