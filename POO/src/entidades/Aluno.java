package entidades;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	
	public double calcMedia() {
		double media = (nota1 * 0.30) + (nota2 * 0.35) + (nota3 * 0.35);
		System.out.println("A média do aluno é: " + media);
		return media;
	}
	
	public void situacao(double media) {
		if (media >= 6.0) {
			System.out.println("Aluno Aprovado!");
		} else {
			System.out.println("Aluno Reprovado! Faltam " + (6-media) + " para aprovação!");
		}
	} 
} 
