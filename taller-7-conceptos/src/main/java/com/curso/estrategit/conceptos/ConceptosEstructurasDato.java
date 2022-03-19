package com.curso.estrategit.conceptos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class ConceptosEstructurasDato {

	public static void main(String[] args) {
		
		ArrayList<String> listaString = new ArrayList<String>();
		listaString.add("Bienvenidos");
		listaString.add("Curso");
		listaString.add("Java");
		
		for(String elemento: listaString) {
			System.out.println(elemento);
		}
		
		
		listaString.forEach(/*objeto actual del cual realiza el recorrido*/
				elemento->{ String segmento=elemento.substring(2);
					System.out.println(segmento);});//conceptos de programacion general 
		
		Iterator<String> recorre= listaString.iterator();
		while(recorre.hasNext()) {
			System.out.println(recorre.next());
		}
		
		Vector<String> vector=new Vector<String>();
		vector.add("Cadena1");
		vector.add(0, "Cadena2");
		
		for(String elem:vector) {
			System.out.println(elem);
		}
		
		HashMap<String, Long> edadPersona=
				              new HashMap<String, Long>();
		edadPersona.put("Katherin Bagui", new Long(28));
		edadPersona.put("Lissette Garcia", new Long(29));
		edadPersona.put("Anjeli Torres", new Long(15));
		edadPersona.put("Cristel Correa", new Long(5));
		
		Iterator<String>  recorreClaves=
				edadPersona.keySet().iterator();
		
	 while(recorreClaves.hasNext()) {
		 String clavePrimaria= recorreClaves.next();
		 System.out.println("La persona: " + clavePrimaria+ ", tiene: " + edadPersona.get(clavePrimaria) + " años");
	 }
	 
	 for(Entry<String, Long> reg:
		 edadPersona.entrySet()
			 
			 ) {
		 System.out.println("La persona: " + reg.getKey()+ ", tiene: " + reg.getValue() + " años");
	 }
	}
}
