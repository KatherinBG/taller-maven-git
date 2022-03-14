package com.estrategit.curso.clausulaFinal;

public class Persona {

	  private String cedula;

	public Persona(String cedula) {
		this.cedula = cedula;
	}
	  
	  public final String obtenerCedula() {
		  return cedula;
	  }
}
