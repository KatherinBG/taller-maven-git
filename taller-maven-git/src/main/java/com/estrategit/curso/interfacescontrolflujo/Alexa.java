package com.estrategit.curso.interfacescontrolflujo;

public class Alexa implements InterfaceEjecutable {

	public String  ejecutar(String comandoVoz ) {
		return "Comando de voz"+comandoVoz+"ejecutado";
		
	}
}
