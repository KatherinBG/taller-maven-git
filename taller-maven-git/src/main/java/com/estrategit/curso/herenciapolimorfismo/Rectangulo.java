package com.estrategit.curso.herenciapolimorfismo;

public class Rectangulo extends Figura {

	protected Double altura;
	protected Double base;
	

	public Rectangulo(Double altura, Double base) {
		super();
		this.altura = altura;
		this.base = base;
		nombre="Rectangulo";
	}



	@Override
	public Double getArea() {
		
		return base * altura;
	}

}
