package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conversor;

public class Programa6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos dólares serão comprados? ");
		double qtdDol = sc.nextDouble();

		System.out.println("A quantidade a ser paga em Reais é: R$" + Conversor.converter(qtdDol));

		sc.close();
	}

}
