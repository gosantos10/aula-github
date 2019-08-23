package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluguel;

public class Programa9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos alugarão quartos? ");
		int n = sc.nextInt();

		Aluguel[] vect = new Aluguel[10];

		for (int i = 0; i < n; i++) {

			sc.nextLine();
			System.out.println("Aluguel #" + (i + 1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int numQuarto = sc.nextInt();
			System.out.println();
			vect[i] = new Aluguel(nome, email, numQuarto);
		}
		sc.close();

	}

}
