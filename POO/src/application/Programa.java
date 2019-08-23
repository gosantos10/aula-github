package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		//chamada de bibliotecas necessárias
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("INSIRA OS DADOS DO PRODUTO");
		System.out.println("------------------------------");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		//instanciando produto
		Produto produto = new Produto(nome, preco);
		

		
		System.out.println();
		System.out.println("Dados do PRODUTO: " + produto);

		System.out.println();
		System.out.print("Digite o número de produtos que serão adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);

		System.out.println();
		System.out.print("DADOS ATUALIZADOS: " + produto);

		System.out.println();
		System.out.println("Digite o número de produtos que serão retirados do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println("DADOS ATUALIZADOS: " + produto);

		sc.close();
	}

}
