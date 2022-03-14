package com.estrategit.curso.mandouniversal;

public class Dispositivo {
	
	public static void main(String[] args) {
	
		//protected String nombreDispositivo;
		
		Acciones acciones= new Acciones();
		acciones.encender();
		acciones.apagar();
		acciones.bajarvolumen();
		acciones.subirvolumen();
		System.out.println("\t");
        NuevosDispositivos nuevosDispo= new NuevosDispositivos();
        nuevosDispo.mando();
        nuevosDispo.encender();
        nuevosDispo.apagar();
        nuevosDispo.bajarvolumen();
        nuevosDispo.subirvolumen();
}

}