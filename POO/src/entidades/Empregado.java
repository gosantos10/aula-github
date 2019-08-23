package entidades;

public class Empregado {
	private String nome;
	private int id;
	private double salario;

	public Empregado(String nome, int id, double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void Aumento(double porcentagem) {
		this.salario = salario + (salario * porcentagem/100);
	}

}
