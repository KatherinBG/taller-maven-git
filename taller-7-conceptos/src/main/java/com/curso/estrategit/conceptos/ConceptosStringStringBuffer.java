package com.curso.estrategit.conceptos;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class ConceptosStringStringBuffer {
	
	public static void main(String[] args) {
		String cadena="Hola Mundo";
		String cadena2=new String("Hola Mundo");
		String cadena3=cadena;
		
		
		if(cadena3==cadena) {
			//System.out.println("Cadena3==cadena");
		}
		
		if(cadena==cadena2) {
			//System.out.println("Cadenas iguales?");
		}else {
			//System.out.println("Cadenas diferente?");
		}
		if(cadena.equals(cadena2)) {
			//System.out.println("El valode de cadena2 == al valor de de cadena");
		}
		
		if(cadena.isEmpty()) {
			//System.out.println("Cadena vacia");
		}else {
			//System.out.println("Cadena con elementos");
	
		}
		for(int i=0;i< cadena2.length();i++) {//cantidad de la cadena -1
			
			//System.out.println(cadena2.charAt(i));
		}
		 for (char ch: cadena2.toCharArray()) {
			 
			 //System.out.println(ch);
		 }
		 
		int tamanio= cadena2.length();
		while(tamanio>0) {
			tamanio--;//tamanio=tamanio-1;
			//System.out.println(cadena2.charAt(tamanio));
			
		}
	
	  StringBuffer cadenaBuffer=new StringBuffer("Curso Estrategit");
	     cadenaBuffer.append("Marzo 2022");
	     
	    // System.out.println(cadenaBuffer);
	    // System.out.println(cadenaBuffer.reverse());
	     
	     String cadenaIterable="Vamos a continuar con el while";
	     
	     CharacterIterator iterador=new StringCharacterIterator(cadenaIterable);
	     
	     while(iterador.current()!=CharacterIterator.DONE) {
	    	// System.out.println(iterador.current());
			 iterador.next();
		}
	     
	     for(int i=5;i< cadenaIterable.length();i++) {//cantidad de la cadena -1
				
				//System.out.println(cadenaIterable.charAt(i));
}
	     System.out.println("**********");
	     String subCadena=cadenaIterable.substring(5);
	     
	      for(char cha:subCadena.toCharArray()) {
	    	  System.out.println(cha);
	      }
}
}