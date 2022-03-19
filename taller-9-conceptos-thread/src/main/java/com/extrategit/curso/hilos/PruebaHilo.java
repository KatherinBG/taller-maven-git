package com.extrategit.curso.hilos;

public class PruebaHilo {

	public static void main(String[] args) {
		
		Competidor comp1 = new Competidor("Katherin");
		Competidor comp2 = new Competidor("Lissette");
		Competidor comp3 = new Competidor("Anjeli");
		Competidor comp4 = new Competidor("Cristel");
		
		comp1.setPriority(Thread.MAX_PRIORITY);
		comp2.start();
		comp3.start();
		comp4.start();
		
	

	}

}
