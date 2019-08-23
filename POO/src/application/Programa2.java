package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Programa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com o valor da altura do retângulo: ");
		retangulo.altura = sc.nextDouble();
		System.out.println("Entre com o valor da largura do retângulo: ");
		retangulo.largura = sc.nextDouble();
		System.out.println("--------------------------------------------------------");
		
		System.out.println("A área do retângulo é: " + retangulo.calcArea());
		System.out.println("O perímetro do retângulo é: " + retangulo.calcPerimetro());
		System.out.println("A diagonal do retângulo vale: " + retangulo.calcDiagonal());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
