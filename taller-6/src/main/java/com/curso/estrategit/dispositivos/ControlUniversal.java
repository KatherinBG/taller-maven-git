package com.curso.estrategit.dispositivos;

import com.curso.estrategit.comandos.ComandoBasico;

public class ControlUniversal {
	
	public void ejecutarComandoDispositivo(DispositivoElectronico 
			                               dispositivo,ComandoBasico comando) {
		comando.ejecutar();
		System.out.println(dispositivo.getMarcaModelo()
				           +" "
				           + comando.getResultado());
		
	}

}
