package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;

public class TestandoListas {

	public static void main(String[] args) {
	
		//sequencia de aulas:
		
		String aula1= "Conhecendo mais de listas";
		String aula2="Modelando a classe Aula";
		String aula3="Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		//metodos de adicionar- add
		aulas.add(aula1);
		aulas.add(aula2);
	    aulas.add(aula3);

	     aulas.remove(0);
		System.out.println(aulas);
		
		for(String aula: aulas) {
			System.out.println("Aula: "+ aulas);
		}
		
		//Percorrendo uma lista: Me d� a primeira aula:
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula �: "+ primeiraAula);
		
		//Para percorrer a lista e retorna a primeira e ultima aula
		
		for(int i= 0; i<aulas.size();i++) {
			System.out.println("Aula: "+aulas.get(i));
		}
		//Outro m�todo para percorrer � usar o forEche. 
		//Quero para cada aula quero que imprime 
		aulas.forEach(aula-> {
			System.out.println("Percorrendo :");
			System.out.println("Aula :"+ aula);
			});
		
		//M�todo para ordenar listas
	    // aulas.add("Aumentando o noso conhecimentos");
		//  Collections.short(aulas);
		 
		
		
		
	}

}
