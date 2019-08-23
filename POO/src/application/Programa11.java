package application;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Número de linhas da Matriz: ");
		int n = sc.nextInt(); // numero de linhas -leitura-
		System.out.print("Número de colunas da Matriz: ");
		int m = sc.nextInt(); // numero de colunas -leitura-
		System.out.println();

		System.out.println("Entre com os valores da matriz separados por espaço");
		System.out.println();

		int[][] mat = new int[n][m]; // instanciando a matriz

		for (int i = 0; i < mat.length; i++) { // lendo as linhas da matriz
			for (int j = 0; j < mat[i].length; j++) { // lendo as colunas da matriz
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Escolha um número da matriz: ");
		int num = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Nº a Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Nº Acima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Nº a Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Nº Abaixo: " + mat[i + 1][j]);
					}
				}
			}
			sc.close();
		}
	}
}
