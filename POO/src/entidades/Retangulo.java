package entidades;

public class Retangulo {
	
	//atributos
	public double largura;
	public double altura;
	
	//métodos
	public double calcArea() {
		double area = (largura * altura);
		return area;
	}
	
	public double calcPerimetro() {
		double perimetro = (largura * 2) + (altura * 2);
		return perimetro;
	}
	
	public double calcDiagonal() {
		double diagonal = (largura * largura) + (altura * altura);
		diagonal = Math.sqrt(diagonal);
		return diagonal;
	}
	

}
