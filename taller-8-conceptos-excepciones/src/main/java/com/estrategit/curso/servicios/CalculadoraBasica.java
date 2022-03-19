package com.estrategit.curso.servicios;

import com.estrategit.curso.excepciones.CalculadoraExcepction;

public class CalculadoraBasica {
	
	public static final String CODIGO_MULTIPLICACION = "003";
	public static final String CODIGO_SUMA = "002";

	public static Double suma(Double sumando1,Double sumando2) throws CalculadoraExcepction {
		if(sumando1==null) {
			
         CalculadoraExcepction exception=
        		   new CalculadoraExcepction(CODIGO_SUMA,"El sumando1 es nulo");
         
         
         throw exception;
		}
			
		if(sumando2<0)
			throw new CalculadoraExcepction(CODIGO_SUMA,"El sumando2 es negativo");
		
		return sumando1+sumando2;
	}
               
		public static Double multiplicar(Double multiplicando,Double multiplicador) throws CalculadoraExcepction {          
		
		if(multiplicando<0 || multiplicador==null )
			throw new CalculadoraExcepction(CODIGO_MULTIPLICACION,"El sumando1 es nulo");
		
		return multiplicando * multiplicador;
	}
	
	
	
}
