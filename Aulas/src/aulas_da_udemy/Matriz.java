package aulas_da_udemy;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de linhas e colunas: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {   //esses dois FOR são usados pra ler a matriz. O primeiro lê as linhas o segundo lê as colunas.
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal Principal: ");
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int cont = 0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j] < 0) {
					cont ++;
				}
			}
		}
		System.out.println("Quantidade de números negativos: " + cont);
		
		
		
		
		sc.close();
	}

}
