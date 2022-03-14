package com.estrategit.curso.herenciapolimorfismo;

public class Triangulo extends Figura{

	protected Double altura;
	protected Double base;
	
	
	public Triangulo(Double altura, Double base) {
		super();
		this.altura = altura;
		this.base = base;
		nombre="Triangulo";
	}




	public Double getArea() {
		return base*altura / 2;
	}
	

}
