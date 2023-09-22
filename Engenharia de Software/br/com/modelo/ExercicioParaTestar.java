package br.com.modelo;

public class ExercicioParaTestar {
	
	// Atributo
	
	private int a;
	private int b;
	private double c;
	
	// Método para somar
	
	public double testandoErrado(int a ){
		b = a + 1; // deveria ser a - 1
		c = b / 30000;
		return c;
	}
	
	public double testandoCerto(int a ){
		b = a - 1;
		c = b / 30000;
		return c;
	}
}
