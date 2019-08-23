package aulas_da_udemy;

import java.util.Locale;
import java.util.Scanner;

public class TreinosParaProjeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;
		do {
			System.out.println("Digite um número: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Raiz quadrada = %.3f%n", sq);

			System.out.println("Deseja repetir? (S/N)");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();

	}
}
