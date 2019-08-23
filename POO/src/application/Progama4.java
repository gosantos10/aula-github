package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Progama4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Entre com as informações do aluno");
		System.out.println("-------------------------------------");

		System.out.print("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("1º Nota: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("2º Nota: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("3º Nota: ");
		aluno.nota3 = sc.nextDouble();
		System.out.println();

		aluno.calcMedia();

		System.out.print("Digite a média do aluno para verificar sua situação: ");
		double media = sc.nextDouble();
		aluno.situacao(media);

		sc.close();

	}

}
