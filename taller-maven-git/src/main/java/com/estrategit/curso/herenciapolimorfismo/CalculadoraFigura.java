package com.estrategit.curso.herenciapolimorfismo;

public class CalculadoraFigura {

	public static void calcularAreaFigura(Figura figura) {
		System.out.println("El area de la figura("+figura.nombre+") es: " + figura.getArea());
		
	}
}
