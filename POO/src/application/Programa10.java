


												//FALTA TERMINAR//

package application;

import java.util.ArrayList;              
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;

public class Programa10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Empregado e1 = new Empregado("Guilherme", 131, 1200);
		Empregado e2 = new Empregado("Maria", 171, 1500);
		Empregado e3 = new Empregado("João", 255, 2400);
		Empregado e4 = new Empregado("Paulo", 171, 3000);

		List<Empregado> empregados = new ArrayList<>();

		empregados.add(e1);
		empregados.add(e2);
		empregados.add(e3);
		empregados.add(e4);

		System.out.println("OS FUNCIONÁRIOS DA EMPRESA SÃO:");
		System.out.println("-----------------------------------");
		System.out.println("Funcionário: " + e1.getNome() + ", ID: " + e1.getId() + ", Salário: " + e1.getSalario());
		System.out.println("Funcionário: " + e2.getNome() + ", ID: " + e2.getId() + ", Salário: " + e2.getSalario());
		System.out.println("Funcionário: " + e3.getNome() + ", ID: " + e3.getId() + ", Salário: " + e3.getSalario());
		System.out.println("Funcionário: " + e4.getNome() + ", ID: " + e4.getId() + ", Salário: " + e4.getSalario());
		System.out.println("--------------------------------------------------------------------------------------------");

		System.out.print("Digite o ID do funcionário que deseja aumentar o salário: ");
		int id = sc.nextInt();
		
		
		
		
		sc.close();
	}

}
