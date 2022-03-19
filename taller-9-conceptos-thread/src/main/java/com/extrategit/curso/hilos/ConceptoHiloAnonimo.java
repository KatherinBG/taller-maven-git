package com.extrategit.curso.hilos;

public class ConceptoHiloAnonimo {
	
	public static void main(String[] args) {
		System.out.println("-------INICIA SENTENCIAS HILO MAIN------");
		Thread competidor1 = new Thread(
				new Runnable() {
					public void run() {
						for (int i = 0; i < 1000; i++ ) {
							System.out.println("Competidor 1");
						}
					}
				}
				);
		Thread competidor2 = new Thread(
					new Runnable() {
						public void run() {
							for (int i =0; i < 1000; i++ ) {
								System.out.println("Competidor2");
							}
						}
					}
				);
		Thread competidor3 = new Thread ( new Runnable() {
							public void run() {
								for (int i =0; i < 1000; i++ ) {
									System.out.println("Competidor3");
								}
							}
						});	
		competidor1.start();
		competidor2.start();
		competidor3.start();
		System.out.println("-------FINALIZA SENTENCIAS HILO MAIN------");
	}

}
