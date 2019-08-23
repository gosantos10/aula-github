package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Calculadora;

public class Programa5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor do Raio: ");
		double raio = sc.nextDouble();

		double c = Calculadora.circunferencia(raio);

		double v = Calculadora.volume(raio);

		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Circunferência: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculadora.PI);

		sc.close();  
		
		//Usando métodos estaticos na classe de apoio não precisa instanciar objetos. Da pra chamar os métodos através do proprio nome da CLASSE.

	}

}
