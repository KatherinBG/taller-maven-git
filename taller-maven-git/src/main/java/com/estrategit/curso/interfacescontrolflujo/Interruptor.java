package com.estrategit.curso.interfacescontrolflujo;

public class Interruptor implements InterfaceEjecutable{
	
	public static final String APAGAR = "Apagar";
	public static final String ENCENDER = "Encender";


	public String ejecutar(String comando) {
		return "Comando:"+  comando + ", ejecutado";
	}
       

	private void presentarResultadoComando(String comando ){
		String resultado=ejecutar(comando);
		System.out.println(resultado);
	}
	
	
	public void encender() {
		presentarResultadoComando(ENCENDER);
	}
	
	public void apagar() {
		presentarResultadoComando(APAGAR);
	}
}
