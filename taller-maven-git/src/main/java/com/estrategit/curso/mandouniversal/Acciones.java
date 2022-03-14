package com.estrategit.curso.mandouniversal;

public class Acciones {

	public static final String APAGAR = "Apagar";
	public static final String ENCENDER = "Encender";
	public static final String SUBIRVOLUMEN = "Subir Volumen";
	public static final String BAJARVOLUMEN = "Bajar Volumen";
	
	public String accionar(String accion) {
		return "Accion:"+  accion + " dispositivo "+ ", ejecutada";
	}
	
	
	/*public String acciones(String accion) {
		
		return "Accion:"+  accion + " dispositivo "+ ", ejecutada";
	}*/
       

	private void EjecutarAccion(String comando ){
		String resultado=accionar(comando);
		System.out.println(resultado);
	}
	
	
	public void encender() {
		EjecutarAccion(ENCENDER);
	}
	
	public void apagar() {
		EjecutarAccion(APAGAR);
	}
     
	public void subirvolumen() {
		EjecutarAccion(SUBIRVOLUMEN);
		
	}
	
      public void bajarvolumen() {
	EjecutarAccion(BAJARVOLUMEN);
		
	}
	
	}

