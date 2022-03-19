package com.curso.estrategit.conceptos;

public class ConceptosExcepcion {
	
	public static void main(String[] args) {
		Integer sumando1= Integer.parseInt(args[0]);
		Integer sumando2= Integer.parseInt(args[1]);
		System.out.println("Valor ingresando:" + sumando1);
		System.out.println("Valor ingresando:" + sumando2);
		try {
			Integer result =suma(sumando1,sumando2);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
	}

	  public static  Integer suma(Integer sumando1, Integer sumando2) throws Exception {
		  Integer resultado=sumando1 +sumando2;
		  
		  if(resultado<100)
		  return resultado;
		  else
			  throw new Exception("La suma es igual o mayor que 100");
	  }
}
