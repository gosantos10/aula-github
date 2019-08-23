package aulas_da_udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria"); // adicionar itens dentro da lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		list.add(2, "Marco"); // adiciona em posição específica

		System.out.println(list.size()); // mostra o tamanho da lista

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");

		//list.remove("Anna"); // remove um dado da lista por nome

		list.remove(1); // remove um dado pela posição

		list.removeIf(x -> x.charAt(0) == 'M'); //remova cada elemento "x" se o elemento "x" tiver como caractere na posição zero a letra M
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------");
		System.out.println("posição de bob: " + list.indexOf("Bob")); //mostra a posição de um elemento. Se não existir, retorna -1
		System.out.println("-------------------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList()); //filtra pessoa que começa com letra B na lista anterior, joga dentro de uma nova e exibe
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------------------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); //Encontra o primeiro elemento que começa com a letra que quiser, se nao achar retorna nulo
		System.out.println(nome);

	}

}
