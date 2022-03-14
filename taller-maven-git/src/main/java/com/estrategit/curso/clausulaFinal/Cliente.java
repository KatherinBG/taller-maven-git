package com.estrategit.curso.clausulaFinal;

public class Cliente extends Persona{

	protected Cliente(String cedula) {
		super(cedula);
	
	}
	
	public String obtenerCedulaCliente() {
		return "Cli:" + super.obtenerCedula();
	}

}
