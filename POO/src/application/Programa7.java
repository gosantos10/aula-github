package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaBanco;

public class Programa7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os dados da conta");
		System.out.println("----------------------------");
		System.out.print("Nome: ");
		String nomeTitular = sc.nextLine();
		System.out.print("Número da conta: ");
		int numConta = sc.nextInt();

		ContaBanco c1 = new ContaBanco(numConta, nomeTitular);
		System.out.println();

		System.out.println();
		System.out.println("Deseja realizar deposito inicial? 1=Sim/2=Não");
		int resp = sc.nextInt();
		System.out.println();
		if (resp == 1) {
			System.out.print("Entre com o valor do depósito: R$");
			double valor = sc.nextDouble();
			c1.Depositar(valor);
			c1.mostrar();
		} else {
			c1.mostrar();
		}
		System.out.println();
		System.out.print("Entre com o valor a ser depositado: R$");
		double valor = sc.nextDouble();
		c1.Depositar(valor);
		c1.mostrar();

		System.out.println();
		System.out.print("Entre com o valor a ser sacado: R$");
		double valorSaque = sc.nextDouble();
		c1.Sacar(valorSaque);
		c1.mostrar();

		sc.close();

	}

}
