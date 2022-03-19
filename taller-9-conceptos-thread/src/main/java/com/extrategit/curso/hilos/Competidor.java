package com.extrategit.curso.hilos;

public class Competidor extends Thread{
	private String nombre;

	public Competidor(String nombre) {
		this.nombre = nombre;

	}
	
	@Override
	public void run() {
		for(int i=0 ; i<1000; i++) {
			System.out.println("Competidor:"+nombre);
			
			
		}
		System.out.println("FIN DE LA EJECUCCION");
	}
}