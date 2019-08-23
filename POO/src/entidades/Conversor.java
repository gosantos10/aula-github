package entidades;

public class Conversor {
	
	
	
	public static double converter(double qtdReal) {
		
		double vlrDolar = 3.10;
		double dolarParcial = vlrDolar * qtdReal;
		double iof = dolarParcial * (6/100);
		double dolar = dolarParcial + iof;
		
		return dolar;	
	}

}
